package org.joonzis.ex.commentary;

public class Ex03_Circle {
	/*
	 * 필드 
	 *  - int x, y
	 *  - double radius
	 *  
	 * 메소드
	 *  - 기본 생성자    -> 좌표 0,0     r값 1
	 *  - r 값만 받는 생성자  -> 좌표 0,0
	 *  - 각 좌표 및 r 값 받는 생성자
	 *  - calcArea(원의 크기 계산 후 리턴)  -> PI * r * r
	 *  - calcCircum(원의 둘레 계산 후 리턴) -> 2 * PI * r
	 *  - output(중심 좌표, 반지름, 크기, 둘레 출력) 
	 *  
	 *  *** PI 구하기    -> Math.PI
	 */
	
	int x, y;
	double radius;
	
	public Ex03_Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	public Ex03_Circle(double r) {
		x = 0;
		y = 0;
		radius = r;
	}
	public Ex03_Circle(int _x, int _y, double r) {
		x = _x;
		y = _y;
		radius = r;
	}
	double calcArea() {
		return Math.PI * radius * radius;
	}
	double calcCircum() {
		return 2 * Math.PI * radius;
	}
	void output() {
		System.out.println("원의 중심 좌표["+ x +", " + y + "]");
		System.out.println("반지름 : "  + radius);
		System.out.println("원의 둘레 : " + calcCircum());
		System.out.println("원의 크기 : " + calcArea());
	}
	
	
	
}
