package org.joonzis.ex;

public class Ex01_Rect {

	/* (객체 3개 생성)
	 * 필드
	 * - int width, height
	 * - boolean isSquare
	 * 
	 * 메소드
	 * - Ex01_Rect() --> w, h 1고정		//비어있는건 1로 고정시키기
	 * - Ex01_Rect()(int side)
	 * - Ex01_Rect()(int w, int h)
	 * - calcArea(크기 계산 후 리턴)
	 * - output(너비, 높이, 크기, 형태(정사각형 or 직사각형) 출력)
	 */

	int width, height;
	boolean isSquare;
	
	// 기본 생성자 3개
	public Ex01_Rect() {
		width = 1;
		height = 1;
		isSquare = true;
	}
	
	
	public Ex01_Rect(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	
	
	public Ex01_Rect(int w, int h) {
		width = w;
		height = h;
		isSquare = (w==h) ? true : false;
	}
	
	int calcArea() {
		return width * height;	//가로 곱하기 세로
	}
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println("형태 : " + (isSquare ? "정사각형" : "직사각형"));		//삼항연산자 대신 if문 사용하려면 void output() 위 문단에서 작성 가능
	}
	
	
	
	
	
	
	
	
}
