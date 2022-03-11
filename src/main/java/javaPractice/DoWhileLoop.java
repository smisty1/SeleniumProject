package javaPractice;

public class DoWhileLoop {

	public static void main(String[] args) {

		//do while Loop- do the statement(s), then increment, if condition is correct.
		//condition stays in outside of body
		
		
//** difference between while loop and do while loop-

//If condition is false while loop will not execute coz it stays inside the body

//do while loop check condition at last and stays outside of body , so if the condition 
//is false at least do while loop execute 1 time
		
		/*initialization;
		 do{
		 Statement(s);
		 increment;
		 }While condition;
		 */
		
		//It will print 1 to 10 by using do while Loop
		
		int i=1; //java r each line sesh hoi semicolon ; diye
		do {
			System.out.println(i);
			i++;
		} while (i<=50);
		
		
	}
	/* do while loop-
	Defination: The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

	initialization;
	do{
	Statement(s);
	increment;
	} while(condition);

	Syntax:
	int i=1;
	do{
	System.out.println(i);
	i++;
	} while(i<=10);  */





	

}
