package cielo.lio.sdk.order;

public class Card {
	/**
	 * Valid brands
	 * <li>{@link #VISA}</li>
	 * <li>{@link #MASTERCARD}</li>
	 * <li>{@link #DINERS}</li>
	 * <li>{@link #DISCOVER}</li>
	 * <li>{@link #ELO}</li>
	 * <li>{@link #AMEX}</li>
	 * <li>{@link #JCB}</li>
	 * <li>{@link #AURA}</li>
	 */
	public enum Brand {
		AMEX, AURA, DINERS, DISCOVER, ELO, JCB, MASTERCARD, VISA
	}

	/**
	 * {@link Card#setBin(String)}
	 */
	private String bin;

	/**
	 * {@link Card#setBrand(Brand)}
	 */
	private Brand brand;

	/**
	 * {@link Card#setLast(String)}
	 */
	private String last;

	/**
	 * Default constructor
	 */
	public Card() {
	}

	/**
	 * @return the bank identification number
	 */
	public String getBin() {
		return bin;
	}

	/**
	 * @return the card's brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * @return the last 4 credit card digits
	 */
	public String getLast() {
		return last;
	}
}