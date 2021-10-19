package models;

public abstract class Unit {

		private String name;
		private int curhp;
		private int maxhp;
		private int pow;
		
		Unit(){};
		
		public Unit(String name, int maxhp, int pow){
			this.name = name;
			this.maxhp = maxhp;
			this.curhp = maxhp;
			this.pow = pow;			
		}
		
		public void init(int max, int pw) {
			this.maxhp = max;
			this.curhp = max;
			this.pow = pw;
		}
	
		public void init(String name, int max, int pw) {
			this.name = name;
			this.maxhp = max;
			this.curhp = max;
			this.pow = pw;
		}
}
