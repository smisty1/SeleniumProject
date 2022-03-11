package javaPractice;

public class ForEachLoop {

	public static void main(String[] args) {
		
/*Loops/Iterator in Java: loops/iterator is one concept in java.
Loops can execute a block of code as long as a specified condition(ex: want to print USA 5 times) is reached. Condition means I want to print USA 5 times, so by loop I write one time and print as much as I want.

Iteration means round---- chokkor or gurnon kore come to same point.

Loops are handy/useful/helpful because they save time, reduce code, reduce errors, and loops make code more readable.

Why loop: A loop statement allows us to execute a statement or group 
of statements multiple times.

for Ex. we want to type/print "USA" five times. So, in Java what we do normally-

We write- 
System.out.println("USA");
System.out.println("USA");
System.out.println("USA");
System.out.println("USA");
System.out.println("USA");

and we need write the same statement five times. Assume we want to write 100 times-
so, we need to write the same statement 100 times.
Loops/iterator are 4 kinds: 
		
1.	for loop/iterator
2.  whileLoop
3.  do while loop
4.  for each loop

Best to use for each loop coz we don't need initialization, increment, condition.  

4. for each loop
Why for each loop: it is recommended to use the Java for-each loop for traversing/navigating the elements of array and collection because it makes the code readable. Normally it uses with arrays and collections. It's very easy to use.
Unlike others loop, no need to write initialization, condition and increment

For (DataType eachCollections : Collection){
Statement (eachCollections);
}

collection means- i r value jotogulu hobe(i=1, i=i+1=2,,,,, segulo store hobe akta 
variable e, seta ke collection bole. 10 ta num thakle collection of 10 numbers bolte pari.

each collection- 1st iteration 1 , 2nd iteration 2, .... upto 10,
jotober iterate korte hobe totober korbe 10 porjonto.

Syntax: (datatype String)-  datatype name hole string hobe
For (String eachName : names){
System.out.println(eachName);
}

Syntax: (datatype int) - datatype num hole int hobe
for (int eachNum: numbers) {
System.out.println(eachNum);
}

How it works?

The Java for-each loop traverses(travel or navigate)/navigate the array or collection 

until the last element. For each element, it stores the element in the

variable((eachNum/eachName) and 

executes(print--System.out.println(eachNum)/System.out.println(eachName)) 

the body of the for-each loop. 


//Now look ex:
  
 //for each loop syntax: 
		for (DataType eachCollections : Collection) {
			Statement(eachCollections);
		}
        */
		
		//print all value from below numbers of Arrays by using for each loop
		
		int[] nums = {10,20,30,40,50,60,70}; //here int datatype, {10,20,,} array, nums is array's name.
		
		
//int/string thakle foreach diye ctrl+space dile structure ashbe for (int j : nums) { }
//only change j to eachNums		
		 
		for (int eachNums : nums) {
			System.out.println(eachNums);
		}
		
		
//note:without datatype i can't declare variable declaration
//note : java any code of line must end with colon
            System.out.println("....................");  
            
         //print all value from below names of Arrays by using for each loop
            
String [] names = {"Fuad", "shohana", "fawzan", "farida", "ataur", "fahim","bushra","shama"};
  
    for ( String eachNames : names ) {
	System.out.println(eachNames);
}


//1.so 1st variable names e store korte hobe string [] names={...}; , 
//2.then foreach ctrl+space, type each Names,
//3.to print - sysout(eachNames); inside the body. 
    
System.out.println("................");

//we can print all values from nums arrays by using for each loop
//array.length e kotogulo index or value ache seta pai. according to name of array it will
//be nums.length
//here index start with 0 and end with 6,
//{10,20,30,40,50,60,70}so length hobe 7 for array- nums. but i<7 likte pari
//instead of nums.length coz i<7 hole 0 to 6 porjonto index print hobe. i don't have 
//to hard coding i<7. so , nums.length liklei hobe for each loop r jonno



//int[] nums = {10,20,30,40,50,60,70}; 
for (int i = 0; i<nums.length; i++) {
	System.out.println(nums[i]);
	
}
		
		//*** I don't hav to use for loop coz for each loop is easy to use

//loop- if else verification e use kori, 
//loop multiple print korte use kori especially collection and arrays e use kori.



	}
} 