package org.joonzis.ex.commentary;

public class Ex00_Triangle {
	/*
	 * 필드
	 *  - width, height
	 *  
	 *  메소드 
	 *   - 입력 메소드
	 *   - calcArea(계산 후 리턴하는 메소드)
	 *   - output(너비, 높이, 크기 출력)
	 */
	int width, height;
	
	public Ex00_Triangle() {
		width = 1;
		height = 1;
	}
	
	public Ex00_Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	double calcArea() {
		return width * height / 2.0;
	}
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
}
