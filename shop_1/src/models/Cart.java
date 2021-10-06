package models;

public class Cart {
	private String userId;
	private String itemName;

	public void print() {
		System.out.println("[" + "userId: " + userId + "]" + "아이템이름: " + itemName);
	}
}
