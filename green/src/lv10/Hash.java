package lv10;
// 자료구조 : 데이터를 어떤 규칙(조직)으로 저장하고, 가져올것인가
// Collection
// ㄴ ArrayList, Vector

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

// ㄴ HasMap (key-value)			//key값이 인덳의 역할을 하게됨


public class Hash {
	public static void main(String[] args) {
		
		// 제네릭 <?> 은 : 객체의 자료형을 지정
		// ㄴ 선언부에서 자료형(Type)을 정해주기 전까지는 
		// ㄴ 결정되어지지 않은 열린 상태
		
		
		// HasMap 선언 및 초기화
		Map<String, Integer> users = new HashMap<>();
		
		// 추가
		// put() 메소드 사용
		// . 1쌍의 키-밸류 가 들어가야 함
		// . 중복키를 허용하지 X
		users.put("홍길동", 31);
		users.put("도우너", 10);
		users.put("홍희동", 2);
		users.put("홍둘리", 9);
		users.put("홍길동", 33);			// 들어가지 못함 (중복키 존재하는 경우 -> 값을 갱신해줌)
		
		System.out.println(users.size());
		
		
		// keySet() 은 맵의 키값만 배열로 반환 (Type : Obejcect)
		for(Object key : users.keySet()) {		// key 값이 하나씩 key 배열에 들어감
			//값 조회
			System.out.print(key+": ");
			System.out.println(users.get(key));
		}
		
		// 삭제
		// remove();
		users.remove("홍길동");
		
		
		
		System.out.println();
		for(Object val : users.values()) {
			System.out.println(val);
		}
		
		// 정렬 (우회적인 방법)
		Object[] keys = users.keySet().toArray();
		Arrays.sort(keys);
		
		for(int i=0; i<keys.length; i++) {
			System.out.print(keys[i]+ ": ");
			System.out.println(users.get(keys[i]));			
		}
		
		//{4,3,7,1,2}
		//숫자 정렬 -> 2차원 for문 활용
		int temp[] = {4,3,7,1,2};
		
		
		for(int i=0; i<temp.length; i++) {
			for(int j=i; j<temp.length; j++) {
				if(temp[i]>temp[j]) {
					int temp2=temp[i];
					temp[i]=temp[j];
					temp[j]=temp2;
					
				}
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		System.out.println("==================");
		
//		for (int i = 0; i < keys.length; i++) {
//			for (int j = i; j < keys.length; j++) {
//				if (users.get(keys[i]) > users.get(keys[j])) {
//					Object obj = users.get(keys[i]);
//					Object obj2 = users.get(keys[j]);
//					obj=obj2;
//					obj2=obj;				
//				}
//			}
//		}
		
		
		
		//값으로 정렬 후 출력
		// 희동 -> 둘리 -> 도우너 순으로 '키-밸류' 출력
		
		//keys 배열의 순서를 값 정렬의 순서로 나열
		//ver.1
		for (int i = 0; i < keys.length; i++) {
			for (int j = i; j < keys.length; j++) {
				if (users.get(keys[i]) > users.get(keys[j])) {	//값 기준
					// keys 배열을 정렬					
					Object temp2 = keys[i];
					keys[i] = keys[j];
					keys[j] = temp2;				
				}
			}
		}
		
		//ver.2
//		for (int i = 0; i < keys.length; i++) {
//			int min = users.get(keys[i]);
//			int idx = i;
//			for(int j=i; j<keys.length; j++) {
//				if(min > users.get(keys[j])) {
//					min = users.get(keys[j]);
//					idx = j;
//				}
//			}
//			Object temp3 = keys[i];
//			keys[i] = keys[idx];
//			keys[idx] = temp;
//		}
		
		
		
		
		for(int i=0; i<keys.length; i++) {
			System.out.print(keys[i]+ ": ");
			System.out.println(users.get(keys[i]));			
		}		
		
	
		
	}
}
