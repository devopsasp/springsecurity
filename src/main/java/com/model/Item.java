package com.model;

public class Item {
	
	private int itemId;
	private String itemName;
	private float price;
	private int quantityInStock;
	
	public Item()
	{ 
		
	}
	

	public Item(int itemId, String itemName, float price, int quantityInStock) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", quantityInStock="
				+ quantityInStock + "]";
	}
	
	
	
	
}
