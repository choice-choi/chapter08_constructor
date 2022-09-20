package org.joonzis.ex;

public class Ex00_Triangle {

	/*
	 * 필드
	 * - width, height
	 * 
	 * 메소드
	 * - 입력 메소드
	 * - calcArea(계산 후 리턴하는 메소드)
	 * - output(너비, 높이, 크기 출력)
	 */
	
	// 필드
	int width, height;
	
	// 메소드
	// 생성자 -> 1.클래스 이름 (2.매개변수선언)
	public Ex00_Triangle() {	//public 안쓰면 디폴트 들어가니까 클래스 앞에 써줘야함
		width = 1;				//필드들 초기화해야 함
		height = 1;
	}
	
	// width, height값 받는 생성자. 전달받은 매개 값을 대입하는 식 : 매개변수를 전달받는다
	public Ex00_Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	
	// 추가 기능
	double calcArea() {
		return (width * height) / 2.0;
	}
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		
	}
}
