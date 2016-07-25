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
	PRODUCTION("https://cielotms.m4u.com.br/order-management/api/v1"),

	/**
	 * Environment.SANDBOX
	 */
	SANDBOX("https://cielotms.stg.m4u.com.br/order-management/api/v1");

	private final String url;

	Environment(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}
}