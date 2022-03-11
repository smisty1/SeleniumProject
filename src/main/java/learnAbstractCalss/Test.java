package learnAbstractCalss;

public class Test {

public static void main(String[] args) {
		
		//we can't create object of Abstract class; but we can create reference variable of abstract class
		
		//MobileUser mu = new MobileUser();
				
		//Syntax: ClassName(SuperClass) referenceVariable ;
		MobileUser mu; //reference variable of super class
		
		mu= new Karim();
		mu.sendMessage();
		
		mu.call();
		
		mu = new Rahim();
		mu.sendMessage();
		
		mu.call();
	}

	
}
