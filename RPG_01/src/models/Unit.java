package models;

public class Unit {
	private String name;
	private int level;
	private int hp;
	private int maxHp;
	private int att;
	private int def;
	private int exp;
	private boolean party;
	private Item weapon;
	private Item armor;
	private Item ring;

	public Unit(String name, int level, int maxHp, int att, int def, int exp) {
		this.name = name;
		this.level = level;
		this.maxHp = maxHp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.hp = this.maxHp;
		party = false;
		weapon = null;
		armor = null;
		ring = null;
	}

	// road할때 씀
	public Unit(String n, int l, int h, int a, int d, int e, boolean p) {
		name = n;
		level = l;
		maxHp = h;
		att = a;
		def = d;
		exp = e;
		hp = maxHp;
		party = p;
		weapon = null;
		armor = null;
		ring = null;
	}

	public void setItem(Item w, Item a, Item r) {
		weapon = w;
		armor = a;
		ring = r;
	}

	public void printStatus() {
		System.out.print("[이름 : " + name + "]");
		System.out.print(" [레벨 : " + level + "]");
		if (ring != null) {
			System.out.print("[체력 : " + (this.hp + "+" + this.ring.power));
		} else {
			System.out.print("[체력 : " + this.hp);
		}
		if (ring != null) {
			System.out.println("/ " + (this.maxHp + "+" + this.ring.power) + "]");
		} else {
			System.out.println("/ " + this.maxHp + "]");
		}

		if (weapon != null) {
			System.out.print("[공격력 : " + (this.att + "+" + weapon.power) + "]");
		} else {
			System.out.print("[공격력 : " + this.att + "]");
		}

		if (armor != null) {
			System.out.print("[방어력 : " + (this.def + "+" + armor.power) + "]");
		} else {
			System.out.print("[방어력 : " + this.def + "]");
		}
		System.out.println("[파티중 : " + this.party + "]");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public boolean isParty() {
		return party;
	}

	public void setParty(boolean party) {
		this.party = party;
	}

	public Item getWeapon() {
		return weapon;
	}

	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Item armor) {
		this.armor = armor;
	}

	public Item getRing() {
		return ring;
	}

	public void setRing(Item ring) {
		this.ring = ring;
	}

	public void printEquItem() {
		if (this.weapon == null) {
			System.out.println("[무기 : 없음 ]");
		} else {
			System.out.println("[무기 : " + this.weapon.name + "]");
		}
		if (this.armor == null) {
			System.out.println("[방어구 : 없음 ]");
		} else {
			System.out.println("[방어구 : " + this.armor.name + "]");
		}
		if (this.ring == null) {
			System.out.println("[반지 : 없음 ]");
		} else {
			System.out.println("[반지 : " + this.ring.name + "]");
		}
	}

}
