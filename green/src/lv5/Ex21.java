package lv5;

public class Ex21 {
//���ڿ���ȭ3����
	public static void main(String[] args) {
		String nameData = "";
		nameData +=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";


		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
				
				/*
				 * 100001/�̸���/600
				 * 100003/���缮/7000
				 * 100001/�̸���/100
				 * 100002/�̿���/400
				 * 100001/�̸���/600
				 * 100004/�ڸ��/900
				 * 100001/�̸���/130
				 * 100003/���缮/200
				 * 100002/�̿���/700
				 * 100002/�̿���/900
				 * 100004/�ڸ��/800
				 */
				
				String a[] = nameData.split("\n");
//			for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			}
				String name[][] = new String[a.length][2];

				for (int i = 0; i < a.length; i++) {
					String temp1[] = a[i].split("/");
					name[i][0] = temp1[0];
					name[i][1] = temp1[1];

				}
//			for(int i = 0; i < name.length; i++) {
//				System.out.println(name[i][0]);
//				System.out.println(name[i][1]);				
//			}

				String b[] = moneyData.split("\n");
//			for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//			}
				String money[][] = new String[b.length][2];
				for (int i = 0; i < b.length; i++) {
					String temp2[] = b[i].split("/");
					money[i][0] = temp2[0];
					money[i][1] = temp2[1];
				}

//			for(int i = 0; i < money.length; i++) {
//				System.out.println(money[i][0]);
//				System.out.println(money[i][1]);				
//			}	

				String temp3[][] = new String[money.length][3];
				for (int i = 0; i < money.length; i++) {
					temp3[i][0] = money[i][0];
//					temp3[i][1]=name[i][1];
					temp3[i][2] = money[i][1];
					for (int j = 0; j < name.length; j++) {
						if (money[i][0].equals(name[j][0])) {
							temp3[i][1] = name[j][1];
						}
					}
				}

				String userData = "";

				for (int i = 0; i < money.length; i++) {
					userData += temp3[i][0];
					userData += "/";
					userData += temp3[i][1];
					userData += "/";
					userData += temp3[i][2];
					userData += "\n";
				}
				System.out.println(userData + " ");
				
	}

}
