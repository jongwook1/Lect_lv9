package lv8;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Tv777{
	String name;
	String brand;
	int price;
	
	
	
	
	Tv777(String name, String brand, int price){
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	void printInfo() {
		System.out.printf("%s %s : %d원\n",this.name, this.brand, this.price);
	}	
	
}

class MyVector777{
	private int size;
	private Tv777[] arr;
	
	//add()
	public boolean add(Tv777 tv) {
		try {
			Tv777[] temp =this.arr;
			arr = new Tv777[this.size+1];
			if(this.size>0) {
				for(int i=0;i<this.size;i++) {
					this.arr[i]=temp[i];
				}
			}
			this.arr[this.size]=tv;
			this.size++;
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}
	//add()
	public void add(int index, Tv777 tv) {
		Tv777 temp[]=this.arr;
		this.arr=new Tv777[this.size+1];
		for(int i=0;i<this.size;i++) {
			if(i<index) {
				this.arr[i]=temp[i];
			}else {
				this.arr[i+1]= temp[i];
			}
		}
		this.arr[index]=tv;
		this.size++;
	}
	//remove();
	public void remove(int index) {
		Tv777 temp[]=this.arr;
		this.arr=new Tv777[this.size-1];
		int idx=0;
		for(int i=0;i<this.size;i++) {
			if(i!=index) {
				this.arr[idx]=temp[i];
				idx++;
			}
		}
		this.size--;
	}
	//remove();
	public void remove(Tv777 tv) {
		int index=-1;
		for(int i=0;i<this.size;i++) {
			if(this.arr[i].brand.equals(tv.brand)
					&&this.arr[i].name.equals(tv.name)
					&&this.arr[i].price==tv.price) {
				index=i;
				}
		}
		if(index!=-1) {
			Tv777 temp[]=arr;
			arr=new Tv777[size-1];
			int idx=0;
			for(int i=0;i<this.size;i++) {
				if(i!=index) {
					this.arr[idx]=temp[i];
					idx++;
				}
			}
			this.size--;			
		}		
		
	}
	//size();
	public int size() {
		return this.size;
	}
	//sort();
	public void sort() {
		for(int i=0;i<this.size;i++) {
			String first =this.arr[i].name;
			int idx=i;
			
			for(int j=i;j<this.size;j++) {
				if(first.compareTo(this.arr[i].name)>0) {
					first =this.arr[j].name;
					idx=j;
				}
			}
			Tv777 temp= this.arr[i];
			this.arr[i]=this.arr[idx];
			this.arr[idx]=temp;			
		}
	}
	//toString();
	@Override
	public String toString() {		
//		return super.toString();
		String str="[";
		for(int i=0;i<this.size;i++) {
			str+=this.arr[i].name+"/";
			str+= this.arr[i].brand+" : ";
			str+=this.arr[i].price;
			if(i<this.size-1)
				str+=", ";
		}
		str+="]";
		return str;
	}
	
	
}

public class Ex04_myvector_답 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Vector<Integer> arr33=new Vector<>();
//		
//		arr33.add(30);
//		arr33.add(20);
//		arr33.add(10);
//		System.out.println(arr33);
//		Collections.sort(arr33);
//		System.out.println(arr33);
//		
		
		
		
		MyVector777 arr = new MyVector777();
		while(true) {
			System.out.println(arr.size());
			System.out.println(arr.toString());
			
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.정렬");
			
			System.out.print("선택: ");
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.print("Tv명:");
				String name=sc.next();
				System.out.print("브랜드명:");
				String brand=sc.next();
				System.out.print("가격:");
				int price=sc.nextInt();
				
//				arr.add(new Tv(name,brand,price))
				Tv777 newTv=new Tv777(name,brand,price);
				arr.add(newTv);
				
			}
			else if(sel==2) {}
			else if(sel==3) {}
			else if(sel==4) {}
			else if(sel==5) {}
			
		}

	}

}
