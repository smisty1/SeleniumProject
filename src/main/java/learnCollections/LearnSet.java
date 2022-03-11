package learnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set; //java.util is package,
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		
//Collection- 1)List 2) Set

//Set  -is an Interface
//Set  -Single Dimention (length/size). Single-dimensional arrays have one dimension — length		
//In Java, we have a Collection framework that provides functionality to store 
//a group of objects.This is called a single-dimensional ArrayList.	

//implement is to recognize and use an element of code or a programming resource 
//that is written into the program.
		
//Implementations are the data objects used to store collections,which implement the interfaces 	
//An interface in the Java programming language is an abstract type that is used to 
//specify a behavior that classes must implement. {} curly base na thakle seta interfce
		
/*implementation classes for Set:
 -HashSet -> Generate Random Output/not maintain order. ex: 4,3,1,7,6..(everytime execute korle different or same ager tao ashte pare)
 -TreeSet -> Maintain Ascending(increasing value from smaller to large) order output.ex: 2,3,4,5
 -LinkedHashSet -> maintains inserting order.ex: jevbe insert korbo sevabe ashbe 2,4,5,1..etc
 
	
Properties of Set:
-Do not allow Duplicates i.e only allow unique value in console. Duplicate thakle last or 
latest one nibe  and console e print korbe last ta.
-order/unorder (based on implementation classes) means sometimes maintain inserting order
and sometimes not maintain insertion order
Random Order (HashSet)
 321
 124
 111
 123
 122

Ascending Order (TreeSet)
 111
 122
 123
 124
 321

Examples of Orders:
Inserting order (LinkedHashSet)
 123
 111
 122
 321
 124

----------------------------------------------------------
Methods of Set Interface:
1. add(item)- Add items in Set
Size()- get(item)- it's not use in Set, get method use hoina.	
2. For each loop- print all items from Set
3. remove(item)- delete particular item from Set
4. Contains (item)- true/false
5.clear(item) - delete all items from Set
6. isempty()- confirm Set is empty or not.

Syntex of Set:

Set<Integer> obj = new HashSet<Integer>();

Set<String> obj = new TreeSet<String>();
etc.

#set is generic. so, what Datatype we put/declare it allow only that datatype, like
Integer, String etc. Integer hole only Integer allow korbe etc. 
But in Set or List we need to put full name of Datatype like "Integer" not "int" or 
"character" not "char" */

		//In short we can say-
//set is not an order base (inserting order) all the time.
//Depending on implementation classes it can be
//random(HashSet),ascending(TreeSet), or inserting order(LinkedHashSet). 
//create obj of Hashset, TreeSet, LinkedHashSet.    
//Set<Integer/String>obj=new HashSet/TreeSet/LinkedHashSet<Integr/String>();

//Set<Integer>obj=new HashSet<Integer>();
//Set<Integer>obj1=new TreeSet<Integer>();//here we can use other name such as id, name etc instead of obj
//Set<Integer>obj2=new LinkedHashSet<Integer>();


//**For class HashSet Type Syntax and create object(obj). here Set is a interface 
		
		System.out.println(".....HashSet.......");
		
		Set<Integer>obj=new HashSet<Integer>();
		
		//after creating obj, follow below rules 1 to 6 for 1.add, 2.size, 
		//3.for each loop(to print all numbers)
		// 4.contains, 5.true/false, 6.remove, then contains fot true/false
		//again print all item from set by for each loop, again check size
		//clear, isEmpty for confirmation that the set is clear or not
//1.add items in Set by using add() method

obj.add(10);
obj.add(20);
obj.add(40);
obj.add(124);
obj.add(101);
obj.add(125);
obj.add(721);
obj.add(123);
obj.add(456);
obj.add(101112);
obj.add(789);
obj.add(123);
obj.add(000); //in console we will get '0' coz its value is null
obj.add(789);

//only i will get size by obj.add and println(obj.size), to print all numbers serially 
//i have to use for each loop
//2.get count of Set(how many obj) by using size() method in sysout(ctrl+space) print
System.out.println(obj.size()); 
System.out.println("......"); // for using space between line for better understanding

//3. print/display all items in the set by using For each loop syntax
for(Integer eachobj:obj) {
	System.out.println(eachobj);}

//4. check particular item from set by using contains() method, output in console will 
//be true or false based on item that is in obj or not.
System.out.println(obj.contains(101113));

//5. delete item from set- use remove(item)
obj.remove(101112);
System.out.println(obj.contains(101112)); // for true or false (checking the item in obj r not)


//After delete-Print all item from set
for(Integer eachInt:obj){
System.out.println(eachInt);
}
		
//after delete item check the size again
System.out.println(obj.size());

//also check i can check other items true or false
//System.out.println(obj.contains(123));
//System.out.println(obj.contains(101112));

//Remove all items from set- use obj.clear();
obj.clear();

//7. confirm set is empty or not- use isEmpty()- output- true/false

System.out.println(obj.isEmpty());

System.out.println("........TreeSet...........");

//**For class TreeSet create type syntax and object(obj1)

Set<String> obj1 =new TreeSet <String>(); //Syntax for TreeSet

obj1.add("Wonderland");
obj1.add("Cruella");
obj1.add("Beauty and Beast");
obj1.add("Raya and the Last Dragon");   // add obj1 of TreeSet
obj1.add("Peter Rabbit 2");
obj1.add("Jungle Cruise");

System.out.println(obj1.size());      // get count of Set(how many obj1)- size() method 

for (String eachobj1:obj1){
	System.out.println(eachobj1);}  // print/display all items in the set- For each loop syntax

System.out.println(obj1.contains("Jungle Book"));//check particular item from 
                                                //set-contains() method. out put- T/F in console


obj1.remove("Wonderland");     //delete item from set- use remove(item)

System.out.println(obj1.contains("Wonderland")); //check contains T/F

for (String eachobj1:obj1) {
	System.out.println(eachobj1);}   //After delete-Print all item from set


System.out.println(obj1.size());     //after delete item check the size again of TreeSet

obj1.clear();                        //Remove all items from set- use obj.clear();

System.out.println(obj1.isEmpty()); //confirm set is empty or not- use isEmpty()
                                     //- output- true/false




//**For class LinkedHashSet create type syntax and object(obj2)		

System.out.println("...............LinkedHashSet.............");

Set <String> obj2 = new LinkedHashSet <String>();

obj2.add("Sparrow");
obj2.add("Humming Bird");
obj2.add("Hawk");
obj2.add("Ostrich");
obj2.add("Peacock");
obj2.add("Goose");

System.out.println(obj2.size()); 

for(String eachobj2:obj2) {
	System.out.println(eachobj2);}
System.out.println(obj2.contains("Duck"));

obj2.remove("Hawk");

System.out.println(obj2.contains("Hawk"));

System.out.println(obj2.contains("Goose"));

for(String eachobj2:obj2){
System.out.println(eachobj2);
}

System.out.println(obj2.size());     //after delete item check the size again of TreeSet

obj2.clear();                        //Remove all items from set- use obj.clear();

System.out.println(obj2.isEmpty());



}

}
