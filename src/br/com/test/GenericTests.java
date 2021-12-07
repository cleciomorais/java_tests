package br.com.test;

public class GenericTests {

	public static void main(String[] args) {
		printMain();
                
		printNB01();
		
		EC02Tests.printEC02Tests();
	}
	
	private static void printMain() {
            
		System.out.println("metodo printMain em GenericTests.java");
                
	}
        
        private static void printNB01(){
            
            NB01.newPrintNB01();
            
        }
	
}
