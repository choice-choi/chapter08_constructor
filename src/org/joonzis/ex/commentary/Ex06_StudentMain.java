package org.joonzis.ex.commentary;

import java.util.Scanner;


public class Ex06_StudentMain {

	public static void main(String[] args) {
		
		Ex06_Student student1 = new Ex06_Student("영희", "경제학과");
			
		student1.input(new Scanner(System.in));
		student1.output();
	
	}
}
