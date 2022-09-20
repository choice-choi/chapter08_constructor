package org.joonzis.ex;

public class Ex00_TriangleMain {

	public static void main(String[] args) {
		
		Ex00_Triangle semo1 = new Ex00_Triangle();	//Ex00_Triangle는 기본 생성자임
		semo1.output();

		System.out.println("=====================");
		
		//객체 만들면서 초기화 (2개의 필드 값 있는 풀생성자 통해서 초기화)
		Ex00_Triangle semo2 = new Ex00_Triangle(10, 3);
		semo2.output();
		
	}

}
