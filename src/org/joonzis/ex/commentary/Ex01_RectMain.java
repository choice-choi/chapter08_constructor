package org.joonzis.ex.commentary;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		Ex01_Rect nemo1 = new Ex01_Rect();
		nemo1.output();
		
		System.out.println("-----------------");
		
		Ex01_Rect nemo2 = new Ex01_Rect(5);
		nemo2.output();
		
		System.out.println("-----------------");
		
		Ex01_Rect nemo3 = new Ex01_Rect(5, 6);
		nemo3.output();
	}
}
