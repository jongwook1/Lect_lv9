package lv10;

import java.util.ArrayList;
import java.util.Scanner;

//상속 -> 다형성
// 상속한 부모를 통해 다양한 class를 정의할 수 있는 것

// Man 
// ㄴ 자식
// ㄴ 아빠
// ㄴ 직원
// ㄴ 사장

//사장 
//>> 커피숍사장
//>> 치킨집사장
//>> 편의점사장

// 그림판 다형성예제
// : 그리기 (모양)
//	 ㄴ점
//	 ㄴ선
//   ㄴ사각형
//   ㄴ원형
//   ㄴ세모

abstract class Shape {
	int x, y;

	public void move() {
	}

	public abstract void draw();
}

// Shape을 활용해서 그리기 툴을 이하에 만들어보기

class Dot extends Shape {

	@Override
	public void draw() {
		System.out.printf(".");
	}

	@Override
	public String toString() {
		return "점 찍기";
	}
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("_");
	}

	public String toString() {
		return "선 그리기";
	}
}

class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("■");
	}

	public String toString() {
		return "사각형 그리기";
	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("●");
	}

	public String toString() {
		return "원형 그리기";
	}

}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("▲");
	}

	public String toString() {
		return "삼각형 그리기";
	}

}

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Dot());
		list.add(new Line());
		list.add(new Square());
		list.add(new Circle());
		list.add(new Triangle());

		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+") "+list.get(i));
		}
		System.out.print("메뉴: ");
		int sel= sc.nextInt()-1;
		
		list.get(sel).draw();
		
	}

}

//숫자 연산 다형성 
// 더하기
// ㄴ정수
// ㄴ소수
// ㄴ분수

//음료만들기 다형성
// 설탕농도 정하기
// 사이다
// 콜라
// 환타
// 카프리선

//rpg-몬스터 다형성
//몬스터 hp 정하기
//오우거
//오크
//고블린
//슬라임
