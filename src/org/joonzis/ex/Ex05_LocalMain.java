package org.joonzis.ex;

/*
 * 필드
 * - 이름 name
 * - 나이 age
 * - 주민등록번호 sn
 * - 한국인 판단 isKorean
 * 
 * 메소드
 * - 기본생성자(constructor)
 * - 이름, 나이, 주민등록번호 초기화 생성자 => 주민등록 번호 뒷자리 이용하여 한국인 판단
 * - 이름, 나이 초기화 생성자
 * - 이름, 나이, 주민등록번호, 한국인 유무 출력
 */
public class Ex05_LocalMain {

	public static void main(String[] args) {

		// 기본생성자(constructor)
		Ex05_Local k = new Ex05_Local();
		k.output();

		System.out.println("--------------------");
		
		//이름, 나이, 주민등록번호 초기화 생성자 => 주민등록 번호 뒷자리 이용하여 한국인 판단
		Ex05_Local k2 = new Ex05_Local("이모씨", 30, "9999999999");
		k2.output();

		System.out.println("--------------------");
		
		//이름, 나이 초기화 생성자
		Ex05_Local k3 = new Ex05_Local("한모씨", 15);
		k3.output();

	}

}
