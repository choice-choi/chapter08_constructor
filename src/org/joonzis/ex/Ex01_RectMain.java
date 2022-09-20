package org.joonzis.ex;

public class Ex01_RectMain {

	public static void main(String[] args) {
		/*
		 * 필드
		 * - int width, height
		 * - boolean isSquare
		 * 
		 * 메소드
		 * - Ex01_Rect() --> w, h 1고정
		 * - Ex01_Rect()(int side)
		 * - Ex01_Rect()(int w, int h)
		 * - calcArea(크기 계산 후 리턴)
		 * - output(너비, 높이, 크기, 형태(정사각형 or 직사각형) 출력)
		 */
		
		//기본생성자
		Ex01_Rect a1 = new Ex01_Rect();
		a1.output();
		
		System.out.println("------------------------");
		
		Ex01_Rect a2 = new Ex01_Rect(10);		//초기화에서 생성하기 떄문에 input은 필요가 없음
		a2.output();
		
		System.out.println("------------------------");
		
		Ex01_Rect a3 = new Ex01_Rect(12, 17);
		a3.output();
		
		
		
		

	}

}
