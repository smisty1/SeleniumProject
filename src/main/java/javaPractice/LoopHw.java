package javaPractice;

public class LoopHw {

	public static void main(String[] args) {

//Hw: 
//1.Print “I am learning Java with Selenium” 15 time by using for loop
for(int i=1; i<=15; i=i+1)	{
			
System.out.println(i + " I am learning Java with Selenium"); }

//2.Write an array of 10 employees names of a company and print all the names by using for loop.
		
String[] employee = {"hasan", "abir","xu","joseph","ruby","john","oliver","kim","xue","james"};
for(int i=0; i<employee.length; i++)	{
System.out.println(employee[i]); }

//3.Print all the even numbers up to 20 starting from 2 by using while loop.

int i=2;      
while(i<=20) {
System.out.println(i);
i=i+2 ; //increment stays inside a body.
		}

//4.Print all the odd numbers up to 25 starting from 3 by using do while loop.
		
int j=3; //java r each line sesh hoi semicolon ; diye
do {
System.out.println(j);
j=j+3;
} while (j<=25);




//5.Create an array of 10 students of Selenium QA class and print all students name 
//on the console by using for each loop.

			
String[] namessqa = {"abir", "rohan","reshma", "roudba", "josh", "marry","joseph", "xu", "rahman", "hasan" };

for (String eachNames : namessqa) {
	System.out.println(eachNames);
	
}

	

//6.Write an array of 20 employees ID numbers of an organization and print all the id of employees on the console 
//by using for each loop.

int[] ID = {101,203,130,740,750,260,670,459,345,456,223,434,745,123,432,876,458,389,962,771 };

for (int eachNums : ID) {
	System.out.println(eachNums);
}


//7. When we use for loop and for each loop?
/*for loop/iterator-
Definition: The Java for loop is used to iterate a part of the program several times. 
If the number of iteration is fixed(means if it mention the condition 
such as 5 times or 10 times etc)  , it is recommended to use for loop. 

for each loop: it is recommended to use the Java for-each loop for traversing/navigating
the elements of array and collection because it makes the code readable. Normally 
it uses with arrays and collections. It's very easy to use.
Unlike others loop, no need to write initialization, condition and increment

How it works?(for each loop)

The Java for-each loop traverses(travel or navigate)/navigate the array or collection 

until the last element. For each element, it stores the element in the

variable((eachNum/eachName) and 

executes(print--System.out.println(eachNum)/System.out.println(eachName)) 

the body of the for-each loop. 

****in short 
*we will us for loop if the iteration is fixed such as condition 5  or 10 times is fixed.
*we will use for each loop where there's no need to write initialization, condition 
and increment.


		
//8. What is the main difference of While loop and Do While loop?
 
Ans: If condition is false while loop will not execute because it stays inside the body

do while loop check condition at last and stays outside of body , so if the condition 
is false at least do while loop execute 1 time . 
		



	*/
}

}
