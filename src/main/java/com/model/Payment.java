package com.model;

public class Payment {

	 private int cartId;
	 private String paymentMethod;
	 
	 public Payment() 
	 { 
		 
		
	 }

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	 
	 
	 
}
