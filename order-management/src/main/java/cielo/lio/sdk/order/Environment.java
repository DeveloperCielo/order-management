package cielo.lio.sdk.order;

/**
 * API Environment URLs
 * <p/>
 * <li>{@link #PRODUCTION}</li>
 * <li>{@link #SANDBOX}</li>
 */
public enum Environment implements cielo.lio.sdk.Environment {
	/**
	 * Environment.PRODUCTION
	 */
	PRODUCTION("https://api.cielo.com.br/order-management/api/v2"),

	/**
	 * Environment.SANDBOX
	 */
	SANDBOX("https://api.cielo.com.br/sandbox/order-management/api/v2");

	private final String url;

	Environment(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}
}