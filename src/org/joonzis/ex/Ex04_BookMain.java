package org.joonzis.ex;
/*
 * 필드
 * - 책 제목 title
 * - 저자 writer
 * - 가격 price
 * - 판매량 salesVolume
 * - 베스트 셀러 판단 isBestSeller
 * 
 * 메소드
 * - 1) 기본생성자
 * - 2) 책 제목, 가격 초기화 하는 생성자		-> 저자는 "작자미상"으로 기입
 * - 3) 책 제목, 가격, 저자 초기화 하는 생성자
 * - 판매량 입력 받는 setSalesVolume(int sales) 메소드 -> 판매량이 1000이상이면 베스트 셀러				//받는다 = 매개변수 받는다
 * - 제목, 저자, 가격, 판매량, 베스트셀러 or 일반 서적 출력하는 output() 메소드
 */
public class Ex04_BookMain {

	public static void main(String[] args) {
		
		
		Ex04_Book b1 = new Ex04_Book();
		b1.setSalesVolume(10);			//초기화 하는 생성자에 판매량은 없으니까 판매량 알아내는 식 삽입
		b1.output();
		
		System.out.println("-----------------");
		
		Ex04_Book b2 = new Ex04_Book("책1", 7000);
		b2.setSalesVolume(5000);
		b2.output();
		
		System.out.println("-----------------");
		
		Ex04_Book b3 = new Ex04_Book("책2", 5000, "이씨");
		b3.setSalesVolume(200);
		b3.output();
		
		

	}

}
