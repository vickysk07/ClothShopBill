package clothshopbilling;
import java.util.*;
import java.util.Comparator;

public class ChiuMart {
	private String product;
	private int price;
	public ChiuMart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiuMart(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static Comparator<ChiuMart> suja=new Comparator<ChiuMart>() {
		public int compare(ChiuMart s1,ChiuMart s2) {
			String productName=s1.getProduct().toUpperCase();
			String productName1=s2.getProduct().toUpperCase();
			return productName.compareTo(productName1);
		}
	};
	@Override
	public String toString() {
		return "             " + product + "                          " + price ;
	}
	

}
