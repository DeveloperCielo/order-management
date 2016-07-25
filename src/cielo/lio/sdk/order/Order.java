package cielo.lio.sdk.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Order representation
 */
public class Order {
	/**
	 * Valid Order statuses
	 *  <li>{@link #DRAFT}</li>
	 *  <li>{@link #ENTERED}</li>
	 *  <li>{@link #CANCELED}</li>
	 *  <li>{@link #PAID}</li>
	 *  <li>{@link #APPROVED}</li>
	 *  <li>{@link #REJECTED}</li>
	 *  <li>{@link #RE_ENTERED}</li>
	 *  <li>{@link #CLOSED}</li>
	 */
	public enum Status {
		DRAFT, ENTERED, CANCELED, PAID, APPROVED, REJECTED, RE_ENTERED, CLOSED,
	}

	/**
	 * {@link Order#setId(String)}
	 */
	private String id;
	
	/**
	 * {@link Order#setNumber(String)}
	 */
	private String number;
	
	/**
	 * {@link Order#setReference(String)}
	 */
	private String reference;
	
	/**
	 * {@link Order#setStatus(Status)}
	 */
	private Status status;

	/**
	 * {@link Order#setCreatedAt(String)}
	 */
	@SerializedName("created-at")
	private String createdAt;

	/**
	 * {@link Order#setUpdatedAt(String)}
	 */
	@SerializedName("updated-at")
	private String updatedAt;
	
	/**
	 * {@link Order#setItems(List<OrderItem>})}
	 */
	private List<OrderItem> items;
	
	/**
	 * {@link Order#setNotes(String)}
	 */
	private String notes;
	
	/**
	 * {@link Order#setTransactions(List<Transactions>)}
	 */
	private List<Transaction> transactions;
	
	/**
	 * {@link Order#setPrice(int)}
	 */
	private int price;

	/**
	 * Create a new Order setting the order number
	 * @param number the order number
	 */
	public Order(String number) {
		this.number = number;
	}

	/**
	 * Create a new Order setting the order number and total in cents
	 * @param number the order number
	 * @param price the order total
	 */
	public Order(String number, int price) {
		this(number);

		this.price = price;
	}

	/**
	 * Add a new item to the cart
	 * @param item the item to be added to the cart
	 */
	public void addItem(OrderItem item) {
		if (this.items == null) {
			this.items = new ArrayList<OrderItem>();
		}

		this.items.add(item);
	}

	/**
	 * Create a new instance of OrderItem, add to the cart and return it 
	 * @param unitPrice The item unit price
	 * @return The item created
	 */
	public OrderItem addNewItem(int unitPrice) {
		OrderItem item = new OrderItem(unitPrice);

		addItem(item);

		return item;
	}

	/**
	 * Add a transaction to the cart
	 * @param transaction the transaction to be added to the cart
	 */
	public void addTransaction(Transaction transaction) {
		if (this.transactions == null) {
			this.transactions = new ArrayList<Transaction>();
		}

		this.transactions.add(transaction);
	}

	/** 
	 * @return the order id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the order number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the order reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @return the order status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @return the order created time
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the order updated time
	 */
	public String getUpdatedAt() {
		return updatedAt;
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
	 * @return the list of transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @return the order total in cents
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * {@link Order#getId()}
	 * @param id the order id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * {@link Order#getNumber()}
	 * @param number the order number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * {@link Order#getReference()}
	 * @param reference the order reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * {@link Order#getStatus()}
	 * @param status the order status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * {@link Order#getCreatedAt()}
	 * @param createdAt the order creation time
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * {@link Order#getUpdatedAt()}
	 * @param updatedAt the order update time
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * {@link Order#getItems()}
	 * {@link Order#addItem(OrderItem)}
	 * @param items list of items
	 */
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	/**
	 * {@link Order#getNotes()}
	 * @param notes optional notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * {@link Order#getTransactions()}
	 * {@link Order#addTransaction(Transaction)}
	 * @param transactions list of transactions
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	/**
	 * {@link Order#getPrice()}
	 * @param price order total in cents
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}