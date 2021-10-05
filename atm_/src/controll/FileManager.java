package controll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import models.Account;
import models.User;

public class FileManager {
	public static FileManager instance = new FileManager();
	
	private UserManager um=UserManager.instance;
	private AccountManager am=AccountManager.instance;
	
	private String userFileName="users.txt";
	private String AccountFileName= "accounts.txt";
	
	File file=null;
	FileWriter fw=null;
	FileReader fr=null;
	BufferedReader br=null;
	
	public void save() {
		String data = "";

		for (int i = 0; i < um.getUsersSize(); i++) {
			data += um.getUser(i).getCode() + "/";
			data += um.getUser(i).getId() + "/";
			data += um.getUser(i).getPw() + "/";
			data += um.getUser(i).getName() + "\n";
		}

		try {
			file = new File(userFileName);
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("유저저장완료");
		} catch (Exception e) {
			System.out.println("저장실패");
		}

		data = "";

		for (int i = 0; i < am.getAccsSize(); i++) {
			data += am.getAcc(i).getUserCode() + "/";
			data += am.getAcc(i).getAccNum() + "/";
			data += am.getAcc(i).getMoney() + "\n";

		}

		try {
			file = new File(AccountFileName);
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("계좌저장완료");
		} catch (Exception e) {
			System.out.println("저장실패");
		}

	}
	
	
	public void load() {
		try {
			file=new File(userFileName);
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String data=br.readLine();
			
			while(data!=null) {
				String temp[]=data.split("/");
				int code=Integer.parseInt(temp[0]);
				String id=temp[1];
				String pw=temp[2];
				String name=temp[3];
				
				User u=new User(code,id,pw,name);
				um.addUser(u);
				//바로 위2줄과 같은내용
//				um.addUser(new User(code,id,pw,name));
				
				data=br.readLine();		//이거놓치기쉬움!!!!
			}
			fr.close();
			br.close();			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			file=new File(AccountFileName);
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String data=br.readLine();
			
			while(data!=null) {
				String temp[]=data.split("/");
				int code=Integer.parseInt(temp[0]);
				int num=Integer.parseInt(temp[1]);
				int money=Integer.parseInt(temp[2]);				
				Account acc=new Account(code,num,money);
				am.addAccount(acc);
//				am.addAccount(new Account(code,num,money));
				
				//code 를 활용 ->해당 User 객체의 accs 배열에도 추가
				for(int i=0;i<um.getUsersSize();i++) {
					if(code==um.getUser(i).getCode()) {
						um.getUser(i).addAcc(acc);
					}
				}
				data=br.readLine();
				
			}
			fr.close();
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
