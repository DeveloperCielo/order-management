package cielo.lio.sdk.order;

public class Transaction {
	public enum Status {
		CONFIRMED, ANNULLED, CANCELED, ERROR
	}

	public enum PaymentType {
		CREDIT, DEBIT, VOUCHER, MONEY
	}

	private String id;
	private int price;
	private String brand;
	private String mask;
	private String cieloCode;
	private String authCode;
	private Status status;
	private PaymentType paymentType;
	private String description;

	public Transaction(String id, int price) {
		this.id = id;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getMask() {
		return mask;
	}

	public String getCieloCode() {
		return cieloCode;
	}

	public String getAuthCode() {
		return authCode;
	}

	public Status getStatus() {
		return status;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public String getDescription() {
		return description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public void setCieloCode(String cieloCode) {
		this.cieloCode = cieloCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
