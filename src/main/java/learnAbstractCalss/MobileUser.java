package learnAbstractCalss;


//its a fully abstract class, it has no abstract method
public abstract class MobileUser {//normal class create it , then add abstract key word

	void call() { 	// this is a non abstract method, it has implementation ( curly base thaklei body thake, so implementation thake)
		System.out.println("This is Call method");
	}

	//after adding Call() method,it is not a fully abstract method, it has abstract & non Abstract method

	abstract void sendMessage(); // this is a fully abstract method
     //void means null(0) return value, kono kisu return korbena.
	//here only method declaration (sendMessage) ache, kono implementation or body nei
//argument pass kori () bracket r modhe, then colon diye java method finish kori.
}


//framwork is a sturcture , by using that we dont have to change all things, just only change where it is needed
	//we will learn Bdd cucumber and Page object model(Pom)

//wait concept- implicit and thread.sleep
//Thread.sleep is explicit wait




//java multiple inheritance support korena, 1 child can not claim for 2 diff
//parents, but it can be done by interface through implements not extends. 

/*Abstraction:
In Java Abstraction is a process of hiding the implementation details from user, Only the
functionality will be provided to the user. Abstraction is achieved using Abstract class and Interface. 
Abstraction is one of the four major concepts behind object-oriented programming (OOP).
Hiding the implementation logic---- is called Abstraction

We can Achieve Abstraction by two ways:
1. By Abstract class (partial)-abstract and non abstract method thakbe
2. And Interface (100%)-100% abstract method thakbe

Abstract Class:
-By Abstract class we can achieve partial abstraction.
-When we want to hide partial implementation/business logic or code then we use Abstract class

code/logic/business logic same
implementation means body


1. Abstract class must have "abstract" Keyword. same as static and non static keyword r moto (static thakle static keyword thakbe, static na thakle non static)
2. Abstract class can have both Abstract and non-Abstract method
3. Abstract method has no implementation/method body
4. Abstract class has one or more non-Abstract method
5. So, by the abstract class we can achieve Partial Abstraction not 100% or full
6. Cannot create object of abstract classes. also collection r under e 
(tree,set,map (interface)) interface r object create kora jaina, interface 
class na, so object create kora jai na, so abstract and interface class na, 
object create kora jaina.

Example of Abstract Class:
abstract class Animal {    //abstract class

abstract void eat (); 	//abstract method coz abstract keyword ache and body nei, also non static bolte pari coz static keyword nei
public void play () {      //"play" is non-abstract  method coz abstract keyword nei.
Sysout ("I am playing"); //2 ta abstract r 2 ta non abstract method thakle 50% to 50% hoto, 2 ta abs r 1 ta non abs thakle 66% abst r non abs 33% hoto
		}
}
Interface:
When we want to hide 100% implementation/business logic then we use interface,
Interface has no implementation/body, only method declaration
1. Always define only Abstract methods
2. Interface has no implementation/method body
3. only method declaration
4. we can achieve 100% abstraction through interface
5. cannot create object of interface
6. no need to mention "abstract" Keyword in interface
Note: for Interface we use "implements" keyword
Example of Interface:
interface Animal{ //interface
	void eat(); // abstract method
}
*/