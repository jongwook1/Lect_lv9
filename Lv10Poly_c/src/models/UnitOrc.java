package models;

public class UnitOrc extends Unit {
	public UnitOrc() {
		this.setName("오크");
	}

	void skill() {
		System.out.println("한명에게 2배의 데미지 + 기절 ");
	}

}
