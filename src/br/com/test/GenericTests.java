package br.com.test;

public class GenericTests {

	public static void main(String[] args) {
		printMain();
		printB01();
	}
	
	private static void printMain() {
		System.out.println("print main branch method - linha 1");
		System.out.println("print main branch method - linha 2");
	}
	
	private static void printB01() {
		System.out.println("print b01 branch method - linha 1");
		System.out.println("print b01 branch method - linha 2");
		System.out.println("print b01 branch method - linha 3");
	}

}
