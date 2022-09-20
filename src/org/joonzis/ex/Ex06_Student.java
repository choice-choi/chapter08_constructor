package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_Student {
	
	/*
	 * 필드
	 * - 이름 name
	 * - 학과 dept
	 * - 중간 점수 score1	*String
	 * - 기말 점수 score2	*String
	 * - 평균 avg
	 * - 합격 유무 isPass
	 * 
	 * 메소드
	 * - 이름, 학과 초기화 생성자
	 * - 콘솔 입력을 통해 중간, 기말 점수를 입력 받는 input() 메소드
	 * 		=> 평균 및 평균 점수로 패스 유무 판단(80점 이상)
	 * - 이름, 학과, 평균, 합or불 판단 출력 output() 
	 */ 

	String name;
	String dept;
	String score1;
	String score2;
	int avg;
	boolean isPass;
	
	public Ex06_Student(String name, String dept) {
		
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("중간 점수 입력 >> ");
		String score1 = sc.nextLine();
		System.out.println("기말 점수 입력 >> ");
		String score2 = sc.nextLine();
		
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}
	
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + avg);
		System.out.println(isPass ? "합격" : "불합격" );
	}
	
	
}
