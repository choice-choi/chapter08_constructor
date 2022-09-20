package org.joonzis.ex.commentary;

import java.util.Scanner;

public class Ex06_Student {

	/*
	 * 필드
	 *  - 이름 name
	 *  - 학과 dept
	 *  - 중간 점수 score1		*String
	 *  - 기말 점수 score2		*String
	 *  - 평균 avg
	 *  - 합격 유무 isPass
	 *  
	 * 메소드
	 *  - 이름, 학과 초기화 생성자
	 *  - 콘솔 입력을 통해 중간, 기말 점수를 입력 받는 input() 메소드
	 *  	=> 평균 및 평균 점수로 패스 유무 판단(80점 이상)
	 *  - 이름, 학과, 평균, 합or불 판단 출력 output()
	 *  
	 */
	String name;
	String dept;
	String score1;
	String score2;
	double average ;
	boolean isPass;
	
	Ex06_Student(String _name, String _dept){
		name = _name;
		dept = _dept;		
	}
	
	void input(Scanner scanner) {
		System.out.print("중간 >> ");
		score1 = scanner.nextLine();
		System.out.print("기말 >> ");
		score2 = scanner.nextLine();
		average = (Double.parseDouble(score1) + Double.parseDouble(score2)) / 2;
		isPass = average >= 80 ? true : false;
	}
	void output() {
		
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println(isPass ? "합격!" : "불합격!");
	}
}
