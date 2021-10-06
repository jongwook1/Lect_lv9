package models;



public class Item {
	
	
	private String name;
	private int price;
	private String category;		//카테고리 정보를 담음	
	
	public Item(String name,int price,String category) {
		this.name=name;
		this.price=price;
		this.category=category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void print() {
		System.out.println("["+this.name+"]"+"["+this.price+"]"+"["+this.category+"]");
		
	}

}
