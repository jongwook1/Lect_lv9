package lv7;

class Member333 {
	String name;
	int num;
}

class MemberManager333 {
	Member333[] memberList = new Member333[3];
}

public class Ex_other {

	public static void main(String[] args) {
		MemberManager333 mg = new MemberManager333();
		Member333 m1 = new Member333();
		mg.memberList[0] = m1;
		m1.name = "±èÃ¶¼ö";
		m1.num = 1001;
		m1 = new Member333();
		mg.memberList[1] = m1;
		m1.name = "ÀÌ¸¸¼ö";
		m1.num = 1002;
		m1 = new Member333();
		mg.memberList[2] = m1;
		m1.name = "¹Ú¿µÈñ";
		m1.num = 1003;
//		Member333 temp = mg.memberList[0];
		Member333 temp = mg.memberList[1];
//		Member333 temp = mg.memberList[2];
		System.out.println(temp.name);

	}

}
