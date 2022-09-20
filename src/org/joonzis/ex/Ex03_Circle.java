package org.joonzis.ex;

/*
 * 필드
 * - int x, y
 * - double radius
 * 
 * 메소드
 * - 기본 생성자		-> 좌표 0,0	r값 1
 * - r 값만 받는 생성자 	-> 좌표 0,0
 * - 각 좌표 및 r 값 받는 생성자
 * - calcArea(원의 크기 계산 후 리턴)	-> PI * r * r
 * - calcCircum(원의 둘레 계산 후 리턴) -> 2 * PI * r
 * - output(중심 좌표, 반지름, 크기, 둘레 출력)
 * 
 * *** PI 구하기	-> Math.PI
 */

public class Ex03_Circle {
	
	int x, y;
	double radius;
	
//	double PI = Math.PI;
	
	public Ex03_Circle() {
		x=0;
		y=0;
		radius=1;
	}
	
	// r값 받는다 = 매개변수 받는다
	public Ex03_Circle(double r) {
		x=0;
		y=0;
		radius = r;
	}
	
	//this 안 쓰고 public Ex03_Circle(int x, int y, double r)안의 변수를 다르게 줘도 됨
	public Ex03_Circle(int x, int y, double r) {
		this.x=x;
		this.y=y;
		this.radius=r;
	}
	
	
	double calcArea() {
		return Math.PI*radius*radius;
	}
	
	double calcCircum() {
		return 2*Math.PI*radius;
	}
	
	public void output() {
		System.out.println("중심 좌표 : [" + x + "," + y + "]");	//매개변수 1개만 받을 수 있는 상태, 앞에서 문자열로 받으니까 뒤에도 문자열로 인식이 됨.
		System.out.println("반지름 : " + radius);
		System.out.println("원의 크기 : " + calcArea());
		System.out.println("원의 둘레 : " + calcCircum());
	}
	
	
	

}
