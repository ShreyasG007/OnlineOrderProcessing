package com.tka.onlineOrder;

public class OnlineOrder extends Order {
	public String shippingAddress;

	public OnlineOrder(int orderId, String orderDate, double totalAmount, String shippingAddress) {
		super(orderId, orderDate, totalAmount);
		this.shippingAddress = shippingAddress;
	}
	
	@Override
	public void display() {
		System.out.println("Order Details");
		System.out.println("Order Id : "+orderId);
		System.out.println("Order Date : "+orderDate);
		System.out.println("Total Amount : "+totalAmount);
		System.out.println("Shipping Address : "+shippingAddress);
	}
}
