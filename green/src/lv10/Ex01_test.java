package lv10;

class UserManager1{
	private static UserManager1 instance=new UserManager1();
	private UserManager1() {}
	public static UserManager1 getUserManager() {
		return instance;
	}
	
}
class a{
	UserManager1 um= UserManager1.getUserManager();
}


public class Ex01_test {

	public static void main(String[] args) {
		
	}

}
