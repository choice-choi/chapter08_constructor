package org.joonzis.ex;

public class Ex05_Local {
	
	/*
	 * 필드
	 * - 이름 name
	 * - 나이 age
	 * - 주민등록번호 sn
	 * - 한국인 판단 isKorean
	 * 
	 * 메소드
	 * - 기본생성자(constructor)
	 * - 이름, 나이, 주민등록번호 초기화 생성자 => 주민등록 번호 뒷자리 이용하여 한국인 판단(생성자 내에서 처리)
	 * - 이름, 나이 초기화 생성자
	 * - 이름, 나이, 주민등록번호, 한국인 유무 출력
	 */

	String name;
	int age;
	String sn;
	boolean isKorean;
	
	//기본생성자
	public Ex05_Local() {
		
	}

		
	//이름, 나이, 주민등록번호 초기화 생성자 => 주민등록 번호 뒷자리 이용하여 한국인 판단	
	public Ex05_Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
		
	/*
		// => 주민등록 번호 뒷자리 이용하여 한국인 판단	
		
			String StrSn = sn.substring(6,7);

			if (StrSn.equals("1") || StrSn.equals("2") || StrSn.equals("3") || StrSn.equals("4")) {			//문자열을 숫자로 만드는 식
				isKorean = true;
			} else {
				isKorean = false;
			}
	 */
		}
	
	
	//이름, 나이 초기화 생성자
	public Ex05_Local(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	//이름, 나이, 주민등록번호, 한국인 유무 출력
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + sn);
		System.out.println(isKorean ? "한국인이다." : "한국인이 아니다.");
	}

	
}
