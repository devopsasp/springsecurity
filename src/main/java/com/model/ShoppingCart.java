package com.model;
import java.util.List;
public class ShoppingCart {
	
	private int cartId;
	private List<Item> itemList;
    private float totalAmount;
    
    public ShoppingCart() 
    { 
    	
    }

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
    
    
}
