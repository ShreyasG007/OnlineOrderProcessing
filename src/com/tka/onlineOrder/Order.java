package com.tka.onlineOrder;

public class Order {
	public int orderId;
	public String orderDate;
	public double totalAmount;
	
	public Order(int orderId, String orderDate, double totalAmount) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}
	
	public void display() {
		System.out.println("Order Details");
		System.out.println("Order Id : "+orderId);
		System.out.println("Order orderDate : "+orderDate);
		System.out.println("Order total Amount : "+totalAmount);
		
	}
	
	
}
