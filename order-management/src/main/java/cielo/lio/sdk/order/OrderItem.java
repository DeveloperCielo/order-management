package cielo.lio.sdk.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

public class OrderItem {
	/**
	 * Valid units of measure
	 * <li>{@link #EACH}</li>
	 * <li>{@link #HOURS}</li>
	 * <li>{@link #DAYS}</li>
	 * <li>{@link #SECONDS}</li>
	 * <li>{@link #CRATE_OF_12}</li>
	 * <li>{@link #SIX_PACK}</li>
	 * <li>{@link #GALLON}</li>
	 * <li>{@link #LITRE}</li>
	 * <li>{@link #OTHER}</li>
	 */
	public enum UnitOfMeasure {
		CRATE_OF_12, DAYS, EACH, GALLON, HOURS, LITRE, OTHER, SECONDS, SIX_PACK
	}

	/**
	 * {@link OrderItem#setCreatedAt(String)}
	 */
	@SerializedName("created_at")
	private String createdAt;

	/**
	 * {@link OrderItem#setDescription(String)}
	 */
	private String description;

	/**
	 * {@link OrderItem#setDetails(String)}
	 */
	private String details;

	/**
	 * {@link OrderItem#setId(String)}
	 */
	private String id;

	/**
	 * {@link OrderItem#setName(String)}
	 */
	private String name;

	/**
	 * {@link OrderItem#setQuantity(int)}
	 */
	private int quantity;

	/**
	 * {@link OrderItem#setSku(String)}
	 */
	private String sku;

	/**
	 * {@link OrderItem#setUnitOfMeasure(UnitOfMeasure)}
	 */
	@SerializedName("unit_of_measure")
	private UnitOfMeasure unitOfMeasure;

	/**
	 * {@link OrderItem#setUnitPrice(int)}
	 */
	@SerializedName("unit_price")
	private int unitPrice;

	/**
	 * {@link OrderItem#setUpdatedAt(String)}
	 */
	@SerializedName("updated_at")
	private String updatedAt;

	/**
	 * Create an order item defining its unit price
	 * 
	 * @param unitPrice
	 *            the item's unit price
	 */
	public OrderItem(int unitPrice) {
		this(unitPrice, 1);
	}

	/**
	 * Create an order item defining its unit price and quantity
	 * 
	 * @param unitPrice
	 *            the item's unit price
	 * @param quantity
	 *            the item's quantity
	 */
	public OrderItem(int unitPrice, int quantity) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.createdAt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(new Date());
		this.id = UUID.randomUUID().toString();
	}

	/**
	 * @return the order item creation date
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the order item description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the order item details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @return the order item id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the order item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the order item quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the order item sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @return the order item unit of measure
	 */
	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * @return the order item unit price
	 */
	public int getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @return the order item last update
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the creation date of the order item
	 * 
	 * @param createdAt
	 * @return this OrderItem instance
	 */
	public OrderItem setCreatedAt(String createdAt) {
		this.createdAt = createdAt;

		return this;
	}

	/**
	 * Sets the description of the order item
	 * 
	 * @param description
	 * @return this OrderItem instance
	 */
	public OrderItem setDescription(String description) {
		this.description = description;

		return this;
	}

	/**
	 * Sets the details of the order item
	 * 
	 * @param details
	 * @return this OrderItem instance
	 */
	public OrderItem setDetails(String details) {
		this.details = details;

		return this;
	}

	/**
	 * Sets the id of the order item
	 * 
	 * @param id
	 * @return this OrderItem instance
	 */
	public OrderItem setId(String id) {
		this.id = id;

		return this;
	}

	/**
	 * Sets the name of the order item
	 * 
	 * @param name
	 * @return this OrderItem instance
	 */
	public OrderItem setName(String name) {
		this.name = name;

		return this;
	}

	/**
	 * Sets the quantity of the order item
	 * 
	 * @param quantity
	 * @return this OrderItem instance
	 */
	public OrderItem setQuantity(int quantity) {
		this.quantity = quantity;

		return this;
	}

	/**
	 * Sets the sku of the order item
	 * 
	 * @param sku
	 * @return this OrderItem instance
	 */
	public OrderItem setSku(String sku) {
		this.sku = sku;

		return this;
	}

	/**
	 * Sets the unit of measure of the order item
	 * 
	 * @param unitOfMeasure
	 * @return this OrderItem instance
	 */
	public OrderItem setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;

		return this;
	}

	/**
	 * Sets the unit price of the order item
	 * 
	 * @param unitPrice
	 * @return this OrderItem instance
	 */
	public OrderItem setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;

		return this;
	}

	/**
	 * Sets the last update date of the order item
	 * 
	 * @param updatedAt
	 * @return this OrderItem instance
	 */
	public OrderItem setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;

		return this;
	}
}