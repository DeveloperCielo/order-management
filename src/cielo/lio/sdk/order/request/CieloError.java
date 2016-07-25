package cielo.lio.sdk.order.request;

/**
 * Just represents an error sent by Cielo; most of time, client errors.
 */
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