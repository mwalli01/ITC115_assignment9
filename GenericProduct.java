package assignments;

//GenericProduct
//
//This is a class representing a product in a grocery store
//By: m.w.
//12/8/2019
//*******************************************************************

import java.text.NumberFormat;

public class GenericProduct {
	//Private variables for our product
	private int productCode;
	private String productDescription;
	private double productPrice;
	private int productCount;
	
	//A formatting method we call in the toString method
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(productPrice);
		return formattedPrice;
	}
	
	//We can see all the data about our product here, with a formatted price.
	public String toString() {
		return "Product Code: " + productCode + "\n" +
				"Item Description: " + productDescription + "\n" +
				"Price: " + getPriceFormatted() + "\n" + 
				"Item Count: " + productCount;
	}
	
	//Getters and setters.
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
}
