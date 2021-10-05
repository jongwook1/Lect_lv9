package models;

public class Cart {
	private String userId; // 구입한 유저 id
	private String itemName; // 구입한 아이템
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

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

	public void print(int n) {
//		System.out.println("[" + userId + "]" + "아이템 : " + itemName);	
		
		System.out.println(n+1+"번"+"[" +"userId: "+ userId + "]" + "아이템 : " + itemName);
		
	}
}
