package models;

public class UnitBat extends Unit {
	public UnitBat() {
		this.setName("박쥐");
	}

	void skill() {
		System.out.println("적 한명에게 침묵 시전 ");
	}
}
