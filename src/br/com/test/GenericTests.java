package br.com.test;

public class GenericTests {

	public static void main(String[] args) {
		printMain();
                
		printNB01();
	}
	
	private static void printMain() {
            
		System.out.println("primeiro commit no branch main local netbeans");
                
        System.out.println("segundo commit no branch main local netbeans");
                
        System.out.println("primeiro commit no branch main apos criação do branch nb01");
                
        System.out.println("segundo commit no branch main apos criação do branch nb01");
        
	}
        
        private static void printNB01(){
            
            NB01.pirntNB01();
            
            NB01.newPrintNB01();
            
        }
	
}
