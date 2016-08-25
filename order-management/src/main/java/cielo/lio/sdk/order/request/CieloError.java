package cielo.lio.sdk.order.request;

public class CieloError {
	private final Integer code;
	private final String detail;
	private final String developerMessage;

	public CieloError(Integer code, String detail, String developerMessage) {
		this.code = code;
		this.detail = detail;
		this.developerMessage = developerMessage;
	}

	public Integer getCode() {
		return code;
	}

	public String getDetail() {
		return detail;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}
}