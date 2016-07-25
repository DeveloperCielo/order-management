package cielo.lio.sdk.order;

import com.google.gson.annotations.SerializedName;

public class OrderItem {
	public enum UnitOfMeasure {
		EACH, HOURS, DAYS, SECONDS, CRATE_OF_12, SIX_PACK, GALLON, LITRE, OTHER,
	}

	private String sku;
	private String name;

	@SerializedName("unit-price")
	private int unitPrice;

	private int quantity;

	@SerializedName("unit-of-measure")
	private UnitOfMeasure unitOfMeasure;

	private String details;

	public OrderItem(int unitPrice, int quantity) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public OrderItem(int unitPrice) {
		this(unitPrice, 1);
	}

	public String getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public String getDetails() {
		return details;
	}

	public OrderItem setSku(String sku) {
		this.sku = sku;

		return this;
	}

	public OrderItem setName(String name) {
		this.name = name;

		return this;
	}

	public OrderItem setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;

		return this;
	}

	public OrderItem setQuantity(int quantity) {
		this.quantity = quantity;

		return this;
	}

	public OrderItem setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;

		return this;
	}

	public OrderItem setDetails(String details) {
		this.details = details;

		return this;
	}
}