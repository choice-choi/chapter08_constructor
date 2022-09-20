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
 * - 판매량 입력 받는 setSalesVolume(int sales) 메소드 -> 판매량이 1000이상이면 베스트 셀러
 * - 제목, 저자, 가격, 판매량, 베스트셀러 or 일반 서적 출력하는 output() 메소드
 */


public class Ex04_Book {

	String title;
	String writer;
	int price;
	int salesVolume;
	boolean isBestSeller;
	
	//기본생성자
	public Ex04_Book() {
	}
	
	//책 제목, 가격 초기화 하는 생성자		-> 저자는 "작자미상"으로 기입
	public Ex04_Book(String title2, int price2) {
		title = title2;
		price = price2;
		writer = "작자미상";
	}
	
	//책 제목, 가격, 저자 초기화 하는 생성자
	public Ex04_Book(String title3, int price3, String writer3) {
		title = title3;
		price = price3;
		writer = writer3;
	}
	
	
	void setSalesVolume(int sales) {
		this.salesVolume = sales;	//초기화 만드는 식
		
		//isBestSeller = (sales == salesVolume) ? true : false;		>>나의오답
		
		if(sales >= 1000) {
			isBestSeller = true;
		}else {
			isBestSeller = false;
		}
		
//		(isBestSeller >= 1000)  ? "베스트셀러" : "일반서적";		>>나의오답

	}
	
	public void output() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + writer);
		System.out.println("가격: " + price);
		System.out.println("판매량: " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
		
	}
	
}
