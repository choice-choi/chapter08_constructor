package org.joonzis.ex;

public class Ex06_StudentMain {
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
	public static void main(String[] args) {


		Ex06_Student some = new Ex06_Student();
		some.input();
		
		
		
		Ex06_Student some2 = new Ex06_Student();
		some2.output();

	}

}
