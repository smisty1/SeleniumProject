package javaPractice;

public class ForLoop {

	public static void main(String[] args) {
		
//Loops/iterator are 4 kinds: 
/*Loops/iterator are 4 kinds-
 			
1.	for loop/iterator-
Definition: The Java for loop is used to iterate a part of the program several times. 
If the number of iteration is fixed(means if it mention the condition 
such as 5 times or 10 times etc)  , it is recommended to use for loop. 
-For loop start with "for" keyword

for loop syntax: 
initialization is start, starting point where count is start-koto theke start korbo ex 
1 want to print 1 to 10 then 2 theke start korte chai, 2 is my starting point
i=1 or i=2 etc, 
condition: how many times I want to execute(will run) or iterate, i< or i> or i<=,
or i>= or whatever likbo seta condition, akhane je number thakbe ex:  i=20 thakle maximum number porjonto jabe depending on condition.
increment: ratio or kototuku kore berbe in each iteration e. Ex: starting point i=1 hole and  increment 1 kore berle i++ or i=i+1 hobe, or starting point i=2 hole and 1 kore berle i=2+1 hobe
for (initialization; condition; increment) {
statement(s) 
normally for loops is integer base, so ‘I’ use hoyese, int i=1, also I stands for iterator, index(start  with 0 or 1 whatever) &  increment. I is a variable. Int datatype likhesi variable declaretion i=1 r jonno.

Here variable name i=1, 1 is value of variable i.
Int i=1 is initialization,
 i<=10, 10 times iterate korte chai, here this is condition. the code in the loop will run, over and over again, as long as a variable (i) is less than or equal 10 i.e. satisfied the condition.


i=i+1 is increment, 1 kore berbe i=1, i=1+1=2, i=2+1=3, i=3+1=4……..i=9+1=10
note: i=i+1 OR  i=i++ same thing , 1 kore berbe. 1 kore berle i=++ liklei hobe
Initial i=2 thakle 2 kore berbe, so i=2, i=2+2=4, i=4+2=6…...upto condition satisfied.
for(int i=1; i<=10; i=i+1){ 
System.out.println(i);
}
Note: In the above example, the code in the loop will run, over and over again, as long as a variable (i) is less than or equal 10 i.e. satisfied the condition.

 //i++ =i=i+1;
2+2=4
4+2=6

i=2
i=i+2;
i=2+2=4+2=6+2=8

	i=1+1=2
	i=2+1=3
	i=3+1=4
	i=4+1=5
	........
	i=99+1=100

					} 
					*/

		for(int i=1; i<10; i++)	{ //i<10 in condition, it will print upto 9 by sysout. 
			
			System.out.println(i);
		}
			
		for(int i=2; i<=20;i++) { //here initialization i=2 , so 2 diye start and 1 kore 
			//berbe coz increment 1 kore i++ and print korbe upto 20, coz codition i<=20
			System.out.println(i);
		}
		
	for(int i=2; i<20; i=i+2)	{ //i<=20 in condition, it will print upto 18 by sysout.
	//coz 2 kore berbe and 19 bejor number, jor number nibe 2 kore berbe, and condition i<20
			
			System.out.println(i);
		}


	//now i want to print 1 to 50 only odd number, then i have to select initialization i=1
	//and i=i+2, so 1st 1 print hobe, then 3,,,,,,,
	for(int i=1; i<=50; i=i+2)	{ 
		
		System.out.println(i);
	}
	//now print all even numbers 1 to 50, select initialization i=2, then increment i=i+2
	for(int i=2; i<=50; i=i+2)	{ 
		
		System.out.println(i);
	}
	//now 3 kore bersle akta even r akta odd num hobe, start hobe 2 theke coz start or 
	//initialization i=2, print hobe upto 29 coz condition can not exceed 30. 
	for(int i=2; i<=30; i=i+3)	{
		
		System.out.println(i);
	}
	//now i want to print United States of America 15 times. 
	//then add i+"United States of America" in sysout, this is called constatation in java language.
	//two string ke add kora ke constatation bole. 

	for(int i=1; i<=15; i=i+1)	{
		
		System.out.println(i + " United States of America"); 
		// " r por space dite hobe
		//coz nicely print hobe, so double code r modhe space diye 
		//start hobe " Uni
	}
		}

	}

	


