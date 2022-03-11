package javaPractice;

public class WhileLoop {

	public static void main(String[] args) {

//WhileLoop
/*2. while loop-
Definition: The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.
How it works- Start execution > 1st check the condition > if condition is true > enter into the loop body and execute the statement

While loop 1st check korbe initialization, then condition - if condition is true loop e enter korbe, otherwise okhanei kaj kora bondho kore dibe.  

initialization; 
while (condition) {
Statement(s) ;
increment; 
}
1-50
2-50; 2 4 6 8 -50
1-49; 1 3 5 7
Syntax: 
int i=1;
while(i<=10){
System.out.println(i);
i++; 		//[i=i+1]
//1+2=3+2=5+2=7 ---50
}
*/


		
		
/*initialization
 while(condition){
Statement(s);
increment;   -here increment is in body, foreachloop e body r baire silo
  }
	*/
		
//it will print 1 to 10, using While Loop
		int i=1;       //if i=11 and coddition while(i<=10) hoi, then print hobena , 
		               //coz condition thik na, false, i value 11 and condition i<=10
		               //condition false howate loop e dhukbena, end hoye jabe.
//interviw question, so if the condition is false, while loop will not execute , not a single time
		while(i<=10) {
			System.out.println(i);
			i++ ; //increment stays inside a body.
		}
		
int j=11;  //use j coz i double variable hoye jai, aki time 2 ta same variable deya jaina.
while(j<=12) { // j value 11, 1 kore berbe, so upto 12 and two nums will print 11 and 12.
System.out.println(j);
j++ ;
	}
//print all values from below Arrays (obj) by using While Loop

 String[]obj=new String[6]; //here string[6] means 6 ta obj value print korbe, 4 dile 4 ta obj value print korbe

obj[0]= "Abdullah";
obj[1]="Abdur Rahman";
obj[2]="Zayyan";
obj[3]="Ahsan";
obj[4]="xyz";
obj[5]="abc";


int k = 0;  // order maintain kore j r por k diase variable name.
while (k<=5){
	System.out.println(obj[k]);
	k++;
	} 

System.out.println("..............................");

//if i want to use this in For Each Loop
String[]obj1=new String[4]; 
obj1 [0]= "b";
obj1 [1]="Rahman";
obj1 [2]="ayan";
obj1 [3]="san";


for(int m=0; m<=3; m=m+1)	{ 
			
			//System.out.println(m); -----this only print index nums
			System.out.println(obj1[m]); //this sysout print value f obj1
		}
	}		
	}


