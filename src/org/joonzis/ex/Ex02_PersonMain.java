package org.joonzis.ex;
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
public class Ex02_PersonMain {

	public static void main(String[] args) {
		
		//기본 생성자(생성자 안 만들면 알아서 만드는 기본 생성자, 하나라도 만들어져 있으면 기본 생성자도 추가로 만들어야 함)
		Ex02_Person some = new Ex02_Person();
		some.output();
		
		System.out.println("----------------------");
		
		
		//풀 생성자
		Ex02_Person f = new Ex02_Person("현아", 25, 170.2, '여');
		f.output();
		

	
		/*
		 * 개발자가 생성자를 하나도!! 구현하지 않았다면 => 자바가 디폴트 생성자를 만들어서 호출
		 * 개발자가 생성자를 하나라도!! 구현하면 => Person(){} 형태의 생성자가 없을 때 오류 발생
		 * 즉! 개발자가 생성자를 만들면, 개발자가 원하는 모습으로만! 객체를 생성할 수 있다.
		 */
		

	}

}
