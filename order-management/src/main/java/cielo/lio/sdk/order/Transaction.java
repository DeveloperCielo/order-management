package cielo.lio.sdk.order;

import com.google.gson.annotations.SerializedName;

public class Transaction {
	/**
	 * Valid Transaction statuses
	 * <li>{@link #CANCELLED}</li>
	 * <li>{@link #CONFIRMED}</li>
	 * <li>{@link #PENDING}</li>
	 */
	public enum Status {
		CANCELLED, CONFIRMED, PENDING
	}

	/**
	 * Valid Transaction types
	 * <li>{@link #CANCELLATION}</li>
	 * <li>{@link #PAYMENT}</li>
	 */
	public enum TransactionType {
		CANCELLATION, PAYMENT
	}

	/**
	 * {@link Transaction#setAmount(int)}
	 */
	private int amount;

	/**
	 * {@link Transaction#setAuthorizationCode(String)}
	 */
	@SerializedName("authorization_code")
	private String authorizationCode;

	/**
	 * {@link Transaction#setCard(Card)}
	 */
	private Card card;

	/**
	 * {@link Transaction#setCreatedAt(String)}
	 */
	@SerializedName("created_at")
	private String createdAt;

	/**
	 * {@link Transaction#setDescription(String)}
	 */
	private String description;

	/**
	 * {@link Transaction#setId(String)}
	 */
	private String id;

	/**
	 * {@link Transaction#setNumber(int)}
	 */
	private int number;

	/**
	 * {@link Transaction#setPaymentProduct(PaymentProduct)}
	 */
	@SerializedName("payment_product")
	private PaymentProduct paymentProduct;

	/**
	 * {@link Transaction#setStatus(Status)}
	 */
	private Status status;

	/**
	 * {@link Transaction#setTerminalNumber(int)}
	 */
	@SerializedName("terminal_number")
	private int terminalNumber;

	/**
	 * {@link Transaction#setTransactionType(TransactionType)}
	 */
	@SerializedName("transaction_type")
	private TransactionType transactionType;

	/**
	 * {@link Transaction#setUpdatedAt(String)}
	 */
	@SerializedName("updated_at")
	private String updatedAt;

	/**
	 * Default constructor
	 */
	public Transaction() {
	}

	/**
	 * Creates a Transaction defining its id and amount
	 * 
	 * @param id
	 * @param amount
	 */
	public Transaction(String id, int amount) {
		this.id = id;
		this.amount = amount;
	}

	/**
	 * @return the transaction's amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the transaction's authorization code
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @return the transaction's card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @return the transaction's creation date
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the transaction's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the transaction's id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the transaction's number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the transaction's related payment product
	 */
	public PaymentProduct getPaymentProduct() {
		return paymentProduct;
	}

	/**
	 * @return the transaction's status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @return the transaction's terminal number
	 */
	public int getTerminalNumber() {
		return terminalNumber;
	}

	/**
	 * @return the transaction's type
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * @return the transaction's updated date
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the amount
	 * 
	 * @param amount
	 * @return this instance
	 */
	public Transaction setAmount(int amount) {
		this.amount = amount;

		return this;
	}

	/**
	 * Sets the authorization code
	 * 
	 * @param authorizationCode
	 * @return this instance
	 */
	public Transaction setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;

		return this;
	}

	/**
	 * Sets the card
	 * 
	 * @param card
	 * @return this instance
	 */
	public Transaction setCard(Card card) {
		this.card = card;

		return this;
	}

	/**
	 * Sets the transaction creation date
	 * 
	 * @param createdAt
	 * @return this instance
	 */
	public Transaction setCreatedAt(String createdAt) {
		this.createdAt = createdAt;

		return this;
	}

	/**
	 * Sets the transaction description
	 * 
	 * @param description
	 * @return this instance
	 */
	public Transaction setDescription(String description) {
		this.description = description;

		return this;
	}

	/**
	 * Sets the transaction id
	 * 
	 * @param id
	 * @return this instance
	 */
	public Transaction setId(String id) {
		this.id = id;

		return this;
	}

	/**
	 * Sets the transaction number
	 * 
	 * @param number
	 * @return this instance
	 */
	public Transaction setNumber(int number) {
		this.number = number;

		return this;
	}

	/**
	 * Sets the payment product
	 * 
	 * @param paymentProduct
	 * @return this instance
	 */
	public Transaction setPaymentProduct(PaymentProduct paymentProduct) {
		this.paymentProduct = paymentProduct;

		return this;
	}

	/**
	 * Sets the transaction status
	 * 
	 * @param status
	 * @return this instance
	 */
	public Transaction setStatus(Status status) {
		this.status = status;

		return this;
	}

	/**
	 * Sets the transaction terminal number
	 * 
	 * @param terminalNumber
	 * @return this instance
	 */
	public Transaction setTerminalNumber(int terminalNumber) {
		this.terminalNumber = terminalNumber;

		return this;
	}

	/**
	 * Sets the transaction type
	 * 
	 * @param transactionType
	 * @return this instance
	 */
	public Transaction setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;

		return this;
	}

	/**
	 * Sets the transaction updated date
	 * 
	 * @param updatedAt
	 * @return this instance
	 */
	public Transaction setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;

		return this;
	}
}