package org.joonzis.ex;

public class Ex02_Person {

	/*
	 * 필드
	 * - int age
	 * - String name
	 * - double height
	 * - char gender
	 * 
	 * 메소드
	 * - Ex02_Person()
	 * - Ex02_Person(String name, int age, double height, char gender)
	 * - output(이름, 나이, 키, 성별 출력)
	 */

	
	int age;
	String name;
	double height;
	char gender;

	//기본생성자
	public Ex02_Person() {
		
	}

	public Ex02_Person(String name, int age, double height, char gender) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.gender = gender;
	}
	
	void output() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		System.out.println("성별:" + gender);
		
	}
	
}
