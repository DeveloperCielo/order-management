package cielo.lio.sdk.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cielo.lio.sdk.Environment;
import cielo.lio.sdk.order.request.CieloError;
import cielo.lio.sdk.order.request.CieloRequestException;

public class OrderManagement {
	// Authorization-Bearer
	private String authorizationBearer;

	// Application-Id
	private String appId;

	// Frontend-Id
	private String frontendId;

	// Device-Id
	private String deviceId;

	// Correlation-Id
	private String correlationId;

	// Merchant-Id
	private String merchantId;

	private Environment environment;

	public OrderManagement(String deviceId, String appId, String merchantId, String authorizationBearer, String frontendId,
			String correlationId, Environment environment) {

		this.deviceId = deviceId;
		this.appId = appId;
		this.merchantId = merchantId;
		this.authorizationBearer = authorizationBearer;
		this.frontendId = frontendId;
		this.correlationId = correlationId;
		this.environment = environment;
	}

	public OrderManagement(String deviceId, String appId, String merchantId, String authorizationBearer, String frontendId,
			String correlationId) {

		this(deviceId, appId, merchantId, authorizationBearer, frontendId, correlationId,
				cielo.lio.sdk.order.Environment.PRODUCTION);
	}

	public OrderManagement(String deviceId, String appId, String merchantId, String authorizationBearer, String frontendId,
			Environment environment) {

		this(deviceId, appId, merchantId, authorizationBearer, frontendId, UUID.randomUUID().toString(), environment);
	}

	public OrderManagement(String deviceId, String appId, String merchantId, String authorizationBearer, String frontendId) {

		this(deviceId, appId, merchantId, authorizationBearer, frontendId, cielo.lio.sdk.order.Environment.PRODUCTION);
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public Order createOrder(Order order) throws CieloRequestException, IOException {
		String url = environment.getUrl() + "/orders";

		HttpPost request = new HttpPost(url);

		request.setEntity(new StringEntity(new GsonBuilder().create().toJson(order)));

		String response = sendRequest(request);
		Gson gson = new Gson();

		return gson.fromJson(response, Order.class);
	}

	void updateOrder(String id, String action) throws IOException, CieloRequestException {
		String url = environment.getUrl() + "/orders/" + id + "?action=" + action;

		HttpPut request = new HttpPut(url);

		sendRequest(request);
	}

	public void cancelOrder(String id) throws IOException, CieloRequestException {
		updateOrder(id, "cancel");
	}

	public void placeOrder(String id) throws IOException, CieloRequestException {
		updateOrder(id, "place");
	}

	public void releaseOrderForVerification(String id) throws IOException, CieloRequestException {
		updateOrder(id, "release_for_verification");
	}

	public void approveOrder(String id) throws IOException, CieloRequestException {
		updateOrder(id, "approve");
	}

	public void rejectOrder(String id) throws IOException, CieloRequestException {
		updateOrder(id, "reject");
	}

	public void closeOrder(String id) throws IOException, CieloRequestException {
		updateOrder(id, "close");
	}

	public Order getOrder(String id) throws IOException, CieloRequestException {
		String url = environment.getUrl() + "/orders/" + id;

		HttpGet request = new HttpGet(url);

		String response = sendRequest(request);
		Gson gson = new Gson();

		return gson.fromJson(response, Order.class);
	}

	String sendRequest(HttpUriRequest request) throws IOException, CieloRequestException {
		HttpClient client = HttpClientBuilder.create().build();

		request.addHeader("Accept", "application/json");
		request.addHeader("Accept-Encoding", "gzip");
		request.addHeader("Content-Type", "application/json");
		request.addHeader("User-Agent", "Cielo-Lio SDK");

		request.addHeader("Authorization-Bearer", authorizationBearer);
		request.addHeader("Application-Id", appId);
		request.addHeader("Frontend-Id", frontendId);
		request.addHeader("Device-Id", deviceId);
		request.addHeader("Correlation-Id", correlationId);
		request.addHeader("Merchant-Id", merchantId);

		HttpResponse response = client.execute(request);

		return readResponse(response);
	}

	String readResponse(HttpResponse response) throws IOException, CieloRequestException {
		HttpEntity responseEntity = response.getEntity();
		InputStream responseEntityContent = responseEntity.getContent();

		Header contentEncoding = response.getFirstHeader("Content-Encoding");

		if (contentEncoding != null && contentEncoding.getValue().equalsIgnoreCase("gzip")) {
			responseEntityContent = new GZIPInputStream(responseEntityContent);
		}

		BufferedReader responseReader = new BufferedReader(new InputStreamReader(responseEntityContent));
		StringBuilder responseBuilder = new StringBuilder();
		String line;

		while ((line = responseReader.readLine()) != null) {
			responseBuilder.append(line);
		}
		
		int statusCode = response.getStatusLine().getStatusCode();
		String responseBody = responseBuilder.toString();
		
		if (statusCode >= 400 && statusCode < 500) {
			CieloRequestException exception = null;
			
			if (statusCode == 404) {
				exception = new CieloRequestException("Not found", new CieloError(404, "Not found", ""), exception);
			} else {
				CieloError[] errors = new Gson().fromJson(responseBody, CieloError[].class);
	
				for (CieloError error : errors) {
					exception = new CieloRequestException(error.getDetail(), error, exception);
				}			
			}
			
			throw exception;
		}

		return responseBody;
	}
}