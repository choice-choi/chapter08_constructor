package org.joonzis.ex.commentary;

public class Ex05_LocalMain {

	public static void main(String[] args) {
		
		Ex05_Local person1 = new Ex05_Local("아빠", 70, "555555-1231234");
		Ex05_Local person2 = new Ex05_Local("카말", 50, "777777-7885643");
		Ex05_Local person3 = new Ex05_Local("에일리언", 300);
		
		person1.output();
		System.out.println("---------------------------");
		person2.output();
		System.out.println("---------------------------");
		person3.output();

	}

}
