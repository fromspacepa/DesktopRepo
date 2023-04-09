package _6f__OOPs_Items_In_Cart_Examples_PracticingAllLearnedCodes;

public class Items {
	
	private String item;
	private double price;
	private int qty;
	
	public Items() {
		super();
		this.item = "";
		this.price = 0;
		this.qty = 0;
		
	}
	public Items(String item, double price, int qty) {
		this();
		this.item = item;
		this.price = price;
		this.qty = qty;

		
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty1() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	
	@Override
	public final String toString() {
		return "\n Item:\t\t\t" + item + "\nPrice:\t\t\t" + price + "\nQuantity:\t\t\t" + qty;
	
	}
	public int getQty() {
		// TODO Auto-generated method stub
		return 0;
	}

}
