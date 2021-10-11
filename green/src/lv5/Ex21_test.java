package lv5;

public class Ex21_test {

	public static void main(String[] args) {
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
				/*
				 * 100001/이만수/600
				 * 100003/유재석/7000
				 * 100001/이만수/100
				 * 100002/이영희/400
				 * 100001/이만수/600
				 * 100004/박명수/900
				 * 100001/이만수/130
				 * 100003/유재석/200
				 * 100002/이영희/700
				 * 100002/이영희/900
				 * 100004/박명수/800
				 */
				
				String nameData = "";
				nameData+=	"100001/이만수";nameData += "\n";		
				nameData += "100002/이영희";nameData += "\n";
				nameData += "100003/유재석";nameData += "\n";
				nameData += "100004/박명수";nameData += "\n";
				nameData += "100005/최여정";nameData += "\n";
				nameData += "100006/박병욱";
				
				String[] list = nameData.split("\n");
				String[][] name = new String[list.length][2];
				for(int i = 0; i < name.length; i++) {
					String[] info = list[i].split("/");
					name[i][0] = info[0];
					name[i][1] = info[1];
				}
				
				for(int i = 0; i < name.length; i++) {
					System.out.println(name[i][1]);
				}
				
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
				
				String[] moneyList = moneyData.split("\n");
				String[][] moneyName = new String[moneyList.length][2];
				
				for(int i = 0; i < moneyName.length; i++) {
					String[] moneyInfo = moneyList[i].split("/");
					moneyName[i][0] = moneyInfo[0];
					moneyName[i][1] = moneyInfo[1];
				}
//				System.out.println("money" + moneyName.length);
				
				for(int i = 0; i < moneyList.length; i++) {
//					System.out.println(moneyName[i][0] + "/" + name[i][1] + "/" +  moneyName[i][1]);
				}
				
				String userData = "";
//					for(int i = 0; i < moneyData.length(); i++) {
//						userData += moneyName[i][0];
//						userData += "/";
//						userData += name[i][1];
//						userData += "/";
//						userData += moneyName[i][1];
//						System.out.println(userData);
//					}
				
				// temp배열을 새로 생성
				// ㄴ moneyData가 기준.
				// 0. id
				// 1. name -> 
				// 2. money
			
				String[][] temp = new String[moneyName.length][3];
				
				for(int i = 0; i < temp.length; i++) {
					temp[i][0] = moneyName[i][0];
					temp[i][2] = moneyName[i][1];
					for(int j = 0; j < name.length; j++) {
						// id를 기준으로 data를 색인.
						if(name[j][0].equals(temp[i][0])) {
							temp[i][1] = name[j][1];
						}
					}
					
					userData += temp[i][0];
					userData += "/";
					userData += temp[i][1];
					userData += "/";
					userData += temp[i][2];
					userData += "\n";	
				}
				
				// 
				System.out.println(userData);



	}

}
