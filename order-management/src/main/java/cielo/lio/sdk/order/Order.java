package cielo.lio.sdk.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Order {
	/**
	 * Valid Order statuses
	 * <li>{@link #DRAFT}</li>
	 * <li>{@link #ENTERED}</li>
	 * <li>{@link #PAID}</li>
	 * <li>{@link #CLOSED}</li>
	 */
	public enum Status {
		DRAFT, ENTERED, PAID, CLOSED
	}

	/**
	 * {@link Order#setCreatedAt(String)}
	 */
	@SerializedName("created_at")
	private String createdAt;

	/**
	 * {@link Order#setId(String)}
	 */
	private String id;

	/**
	 * {@link Order#setItems(List<OrderItem>})}
	 */
	private List<OrderItem> items;

	/**
	 * {@link Order#setNotes(String)}
	 */
	private String notes;

	/**
	 * {@link Order#setNumber(String)}
	 */
	private String number;

	/**
	 * {@link Order#setPrice(int)}
	 */
	private int price;

	/**
	 * {@link Order#setReference(String)}
	 */
	private String reference;

	/**
	 * {@link Order#setRemaining(int)}
	 */
	private int remaining;

	/**
	 * {@link Order#setStatus(Status)}
	 */
	private Status status;

	/**
	 * {@link Order#setTransactions(List<Transactions>)}
	 */
	private List<Transaction> transactions;

	/**
	 * {@link Order#setUpdatedAt(String)}
	 */
	@SerializedName("updated_at")
	private String updatedAt;

	/**
	 * Create a new Order setting the order number
	 * 
	 * @param number
	 *            the order number
	 */
	public Order(String number) {
		this.number = number;
		this.transactions = new ArrayList<Transaction>();
		this.createdAt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(new Date());
	}

	/**
	 * Create a new Order setting the order number and total in cents
	 * 
	 * @param number
	 *            the order number
	 * @param price
	 *            the order total
	 */
	public Order(String number, int price) {
		this(number);
	}

	/**
	 * Add a new item to the cart
	 * 
	 * @param item
	 *            the item to be added to the cart
	 * @return this instance
	 */
	public Order addItem(OrderItem item) {
		if (this.items == null) {
			this.items = new ArrayList<OrderItem>();
		}

		this.items.add(item);

		return this;
	}

	/**
	 * Create a new instance of OrderItem, add to the cart and return it
	 * 
	 * @param unitPrice
	 *            The item unit price
	 * @return The item created
	 */
	public OrderItem addNewItem(int unitPrice) {
		OrderItem item = new OrderItem(unitPrice);

		addItem(item);

		return item;
	}

	/**
	 * Add a transaction to the cart
	 * 
	 * @param transaction
	 *            the transaction to be added to the cart
	 * @return this instance
	 */
	public Order addTransaction(Transaction transaction) {
		if (this.transactions == null) {
			this.transactions = new ArrayList<Transaction>();
		}

		this.transactions.add(transaction);

		return this;
	}

	/**
	 * @return the order created time
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the order id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the list of items
	 */
	public List<OrderItem> getItems() {
		return items;
	}

	/**
	 * @return optional notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @return the order number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the order total in cents
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the order reference
	 */
	public String getReference() {
		return reference;
	}

	public int getRemaining() {
		return remaining;
	}

	/**
	 * @return the order status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @return the list of transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @return the order updated time
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * {@link Order#getCreatedAt()}
	 * 
	 * @param createdAt
	 *            the order creation time
	 * @return this instance
	 */
	public Order setCreatedAt(String createdAt) {
		this.createdAt = createdAt;

		return this;
	}

	/**
	 * {@link Order#getId()}
	 * 
	 * @param id
	 *            the order id
	 * @return this instance
	 */
	public Order setId(String id) {
		this.id = id;

		return this;
	}

	/**
	 * {@link Order#getItems()} {@link Order#addItem(OrderItem)}
	 * 
	 * @param items
	 *            list of items
	 * @return this instance
	 */
	public Order setItems(List<OrderItem> items) {
		this.items = items;

		return this;
	}

	/**
	 * {@link Order#getNotes()}
	 * 
	 * @param notes
	 *            optional notes
	 * @return this instance
	 */
	public Order setNotes(String notes) {
		this.notes = notes;

		return this;
	}

	/**
	 * {@link Order#getNumber()}
	 * 
	 * @param number
	 *            the order number
	 * @return this instance
	 */
	public Order setNumber(String number) {
		this.number = number;

		return this;
	}

	/**
	 * {@link Order#getPrice()}
	 * 
	 * @param price
	 *            order total in cents
	 * @return this instance
	 */
	public Order setPrice(int price) {
		this.price = price;

		return this;
	}

	/**
	 * {@link Order#getReference()}
	 * 
	 * @param reference
	 *            the order reference
	 * @return this instance
	 */
	public Order setReference(String reference) {
		this.reference = reference;

		return this;
	}

	public Order setRemaining(int remaining) {
		this.remaining = remaining;

		return this;
	}

	/**
	 * {@link Order#getStatus()}
	 * 
	 * @param status
	 *            the order status
	 * @return this instance
	 */
	public Order setStatus(Status status) {
		this.status = status;

		return this;
	}

	/**
	 * {@link Order#getTransactions()} {@link Order#addTransaction(Transaction)}
	 * 
	 * @param transactions
	 *            list of transactions
	 * @return this instance
	 */
	public Order setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;

		return this;
	}

	/**
	 * {@link Order#getUpdatedAt()}
	 * 
	 * @param updatedAt
	 *            the order update time
	 * @return this instance
	 */
	public Order setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;

		return this;
	}
}