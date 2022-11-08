package org.joonzis.test;

import java.util.Calendar;

/*
 * Q1.
Car.java				필드 -String model, String color, int year, booleans isNewCar
						메소드 - Constructor, output
CarMain.java
★
생성자(모델, 색상, 연식) / 생성자(모델, 색상)
Calendar calendar = Calendar.getInstance();
calendar.get(Calendar.YEAR);
 */
public class Car {
	//필드 선언
	String model;
	String color;
	int year;
	boolean isNewCar;
	
	//생성자(모델, 색상, 연식)
	public Car(String model, String color, int year) {
		
		this.model = model;
		this.color = color;
		Calendar calendar = Calendar.getInstance();
		this.year = calendar.get(Calendar.YEAR);
	}
	
	//생성자(모델, 색상)
	public Car(String model, String color) {
		
		this.model = model;
		this.color = color;
	}
	
	//void는 리턴타입 안되니까 return 타입은 그에 맞는 데이터 타입 설정하기
	//메소드 - Constructor
//	void Constructor() {
//		System.out.println();
//	}
	
	//메소드 - output
	void output() {
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("연식:" + year);//애초에 위에서 초기화 해야하는 메소드 거쳤기 때문에 여기에 무조건 연식이 들어감. 그래서 비교할게 없으므로 이 식이 끝.
	}
	
}
