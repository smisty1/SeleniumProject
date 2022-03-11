package javaPractice;

public class Animal {

	public static void main(String[] args) {
		
		String x = ("Two");
		String y = ("rabbits");
		
		System.out.println(x+y);
	
	             //Syntax of object creation of a class
				// className obj = new calssName();
				
				Animal obj = new Animal();
				
				obj.tail();
				obj.ears();
				
				obj.color();
				obj.eyes();
				
				
			}
         //Class definition in Java:
	    //A class in Java is used to create objects and to define object data types and methods. 
	    //Inside class body, we write methods class body - methods and attributes.
	    
	    //A method is a block of code which only runs when the method is called.
	    //Methods are used to perform certain actions, and they are also known as methods/functions.
	    //we can pass data into a method as arguments, known as parameterized method.

	     
	    //A method have 4 things
		//public- Access Modifier
		//void- return type
		//Tail()- Method name
		//Method body- { System.out.println("Rabbit has a short tail");}
   
		//Method signature is a combination of Access Modifier, return type, Method name, Method body
	    
	    // Two types of Methods: 1) Static (contain static key word), 2 ) Non static (no static key word)
		//**Four types of access modifier:[Method level]- 1.public, 2) private, 3)default, 4) protected.
	    //Two types modifier :[class level]- 1) public, 2) default or no modifier
	
	
	
	   // **4 types of access modifier (method level)
		public void tail(){
			System.out.println("Rabbit has a short tail");
		}

		private void ears() {
			System.out.println("Rabbit has big ears");
		} 

		void color() {
			System.out.println("I like white color rabbit");
		}

		protected void eyes() {
			System.out.println("Rabbit has big eyes");
			
		}
       
		
		//Parameterized method: 
		
		public static String addTwoString(String x, String y) {
			return x+y;} // //parameterized methods, because we pass two arguments in this method
		//System.out.println(x+y); Also an  example of static methods, and don't need to create object of static methods
		
}
