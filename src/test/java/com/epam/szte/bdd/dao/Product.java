package com.epam.szte.bdd.dao;

public class Product {

	private String productName;
	private String unitProductPrice;
	private String totalProductPrice;
	private String productQuantity;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnitProductPrice() {
		return unitProductPrice;
	}

	public void setUnitProductPrice(String unitProductPrice) {
		this.unitProductPrice = unitProductPrice;
	}

	public String getTotalProductPrice() {
		return totalProductPrice;
	}

	public void setTotalProductPrice(String totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

}
