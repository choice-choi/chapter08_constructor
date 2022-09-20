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
public class Ex03_CircleMain {

	public static void main(String[] args) {
		
		// 기본 생성자		-> 좌표 0,0	r값 1
		Ex03_Circle one = new Ex03_Circle();
		one.output();
		
		System.out.println("-----------------------");
		
		// r값만 받는 생성자 	-> 좌표 0,0
		Ex03_Circle two = new Ex03_Circle(5);	//임의로 주는 값, 생성자를 통해 어떤 값을 전달해줌
		two.output();
		
		System.out.println("-----------------------");
		
		// 각 좌표 및 r 값 받는 생성자
		Ex03_Circle three = new Ex03_Circle(3, 4, 6);	//임의로 주는 값들
		three.output();

	}

}
