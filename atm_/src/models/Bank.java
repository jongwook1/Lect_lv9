package models;

public class Bank {
	private String brand ="";
	public static Bank instance=new Bank();	//Bank �ν��Ͻ�(��ü)�� �ý��� �����, �����ϰ� �����ϵ��� ������� 
	
	public static int log = -1;
	//��ũ.log
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
}
