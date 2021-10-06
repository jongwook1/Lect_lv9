package models;

public class Cart {
	private String userId;
	private String itemName;
	private int price;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print(int n) {
		System.out.println(n+1+"번"+"[" + "userId: " + userId + "]" + "아이템이름: " + itemName);
	}
}
