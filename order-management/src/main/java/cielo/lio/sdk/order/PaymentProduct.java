package cielo.lio.sdk.order;

public class PaymentProduct {
	/**
	 * {@link PaymentProduct#setName(String)}
	 */
	private String name;

	/**
	 * {@link PaymentProduct#setNumber(int)}
	 */
	private int number;

	/**
	 * {@link PaymentProduct#setSubPaymentProduct(PaymentProduct)}
	 */
	private PaymentProduct sub;

	public PaymentProduct() {
	}

	/**
	 * @return the payment product name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the payment product number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the sub payment product
	 */
	public PaymentProduct getSubPaymentProduct() {
		return sub;
	}

	/**
	 * Sets the payment product name
	 * 
	 * @param name
	 * @return this instance
	 */
	public PaymentProduct setName(String name) {
		this.name = name;

		return this;
	}

	/**
	 * Sets the payment product number
	 * 
	 * @param number
	 * @return this instance
	 */
	public PaymentProduct setNumber(int number) {
		this.number = number;

		return this;
	}

	/**
	 * Sets the sub payment product
	 * 
	 * @param subPaymentProduct
	 * @return this instance
	 */
	public PaymentProduct setSubPaymentProduct(PaymentProduct subPaymentProduct) {
		this.sub = subPaymentProduct;

		return this;
	}
}
