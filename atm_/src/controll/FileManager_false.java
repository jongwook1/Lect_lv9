package controll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import models.Account;
import models.User;

public class FileManager_false {
	public static FileManager_false instance = new FileManager_false();

	private String fileName = "myAtm1.txt";
	private File file = new File(fileName);
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	int cnt1 = 0;

	public void save(ArrayList<User> u) {
		String data = "";

		for (int i = 0; i < UserManager.instance.getUsersSize(); i++) {
			String info = "";
			info += u.get(i).getCode() + "/"; // 0
			info += u.get(i).getName() + "/";
			info += u.get(i).getId() + "/";
			info += u.get(i).getPw() + "/"; // 3
			for (int j = 0; j < u.get(i).getAccsSize(); j++) {
				info += u.get(i).getAcc(j).getUserCode()+"/"; // 4
				info += u.get(i).getAcc(j).getAccNum() + "/";
				info += u.get(i).getAcc(j).getMoney(); 		// 6
				if (j != u.get(i).getAccsSize() - 1) {
					info += "/";
				}
			}
			data += info;
//			this.cnt1++;
			if (i != UserManager.instance.getUsersSize() - 1) {
				data += "\n";
			}
		}
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void load2() {
		String data = "";
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String info = br.readLine();
			while (info != null) {
				data += info + "\n";
				this.cnt1++;
				info = br.readLine();
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		String temp[] = data.split("\n");
//		String x=temp[2];
//		String c=temp[3];
//		int z=Integer.parseInt(temp[0]);
//		String v=temp[1];
//		
//		User b=new User(z,x,c,v);
//		User a=new User(z,x,c,v);
//		System.out.println(a.getId());

//		System.out.println("asdfsadsadfsda" + temp[0]);
//		System.out.println("asdfsadsadfsda" + temp[1]);

		ArrayList<User> r = new ArrayList<User>();
//		ArrayList<ArrayList<Account>> h = new  ArrayList<ArrayList<Account>>();

		for (int i = 0; i < temp.length; i++) {
			String x[] = temp[i].split("/");

//			4031		0
//			/홍			1
//			/1			2
//			/1			3

//			/10788		4
//			/1000		5
//			/4031		6

//			/72981		7
//			/1000		8
//			/4031		9

			User u = new User(Integer.parseInt(x[0]), x[2], x[3], x[1]);
//			User u = new User(i, data, data, data);
			// r.add(u);

//			u.setCode(Integer.parseInt(x[0]));
//			u.setName(x[1]);
//			u.setId(x[2]);
//			u.setPw(x[3]);
			int k = 0;
			int size = (x.length - 4) / 3;
			ArrayList<Account> acc = new ArrayList<Account>();
			for (int j = 0; j < size; j++) {
				// Integer.parseInt(x[4]), Integer.parseInt(x[5]), Integer.parseInt(x[6]));
				int userCode = Integer.parseInt(x[4 + j * k]);
				int accNum = Integer.parseInt(x[4 + j * k + 1]);
				int money = Integer.parseInt(x[4 + j * k + 2]);
				k += 3;
				if(k>=6) {
					k=k%2;
				}
				Account aa = new Account(userCode, accNum, money);

				acc.add(aa);

				u.setAccs(acc);
			}
			r.add(i, u);

			UserManager.instance.setUsers(r);

		}

//		UserManager.instance.setUsers(r);

//		User[] u=new User[cnt1];
//		for(int i=0;i<cnt1;i++) {
//			u=new User[i];
//		}
//		for(int i=0;i<temp.length;i++) {
//			User u=new User(Integer.parseInt(temp[0]),temp[2],temp[3],temp[1]);
//			r.add(i, u);
//			System.out.println("왜!!!");
//			UserManager.instance.getUser(i).setCode(Integer.parseInt(temp[0]));
//			UserManager.instance.getUser(i).setName(temp[1]);
//			UserManager.instance.getUser(i).setId(temp[2]);
//			UserManager.instance.getUser(i).setPw(temp[3]);			

//		}

//		ArrayList<User> r=new ArrayList<User>();
//		
//		User[] u=new User[cnt1];
//		UserManager.instance.setUsers(r);
//		UserManager.instance.setUsers(null);
//		r.add(u);
//		ArrayList<User>[] temp=new ArrayList<User>
	}

	public void load() {
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = br.readLine();

			while (data != null) {
				String info[] = data.split("/");
//				this.users.add(new User(randomCode2(),id,pw,name));

//				UserManager.instance.getUsers().add(new User(Integer.parseInt(info[0]),info[2],info[3],info[1]));
//				int k=0;
//				for(int i=0;i<UserManager.instance.getUsers().size();i++) {
//					int userCode=Integer.parseInt(info[3]);
//					int accNum=Integer.parseInt(info[4]);
//					int money=Integer.parseInt(info[5]);
//					Account loadAccs=null;
//					loadAccs.setUserCode(userCode);
//					loadAccs.setAccNum(accNum);
//					loadAccs.setMoney(money);
//					
//					UserManager.instance.getUser(i).addAcc(loadAccs);
//				}

//				User(int code,String id, String pw,String name)
			}
			System.out.println("로드완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
