

/* one of most important object oriented programming concept in java is inheritance, 
 there are 4 concept in java
 1. Inheritance
 2.Encapsulation
 3.Polymorphism
 4.Abstraction 
 for these 4 concepts java is called object oriented programming
 
 Mainly we use Inheritance and Abstraction in selenium
  
  Inheritance concept in Java----one of the most imp component OOP concept in java
  
  OOP=object oriented programming
  
  In java, It is possible to inherit attributes and methods from one class to another.
  
  We can group the "inheritance concept" into two categories. 
  a) Superclass (Base/Parent)- the class being inherited from. 
  Means other classes inherited from super/parent class
  b) Subclass (child)- the class that inherits from another class
  
  ## Through sub class we can call any methods from super class
  
  To inherit from a class, use the "extends" keyword in lower case. 
  Extends refers connection of classes. 
  
 ** Types of inheritance 
  
  1) Single level Inheritance : One Base/Parent class and One sub/child class
 Ex: public class B (sub/child) extends A {} -> Public class A Super class {} (super or base/parent)
  2) Multi level Inheritance  : Base class extends many sub classes
 Ex: Public class c extends B { } -> Public class B extends A {}->public class A {}
  3)Multiple Inheritance      : Exist multiple Base class and multiple sub class
  EX: 2 parents such as two fathers and 1 child, 2 fathers cannot claim for 1 child.
 
  Public class A parent class>
                                not possible-  public class c child 
  Public class B parent class>
  
  ##Inheritance concept does not support multiple , only allow single level and Multi level
  only multiple possible in extraction, we will learn it later.
  
  
   Why do we need Inheritance?
  -code reusability i.e. one code use multiple times.
  -implement parent-child relationship i.e. we can create parent-child relationship.
  -method overwriting - we will learn it later. 
  
  why does not Java provide multiple inheritance
  
  when one class extends more than one classes then this is called multiple inheritance
  Ex: Class C extends class A and B then this type of inheritance is known as multiple
  inheritance. Java doesn't allow/support multiple inheritance
  
 Let us imagine a situation where there are three classes: A, B and C. 
 The C class inherits A and B classes. In case, class A and class B have
 a method with same name and type, and as a programmer, you have to call 
 that method from child class's (C) object, there-there will be ambiguity 
 as which method will be called either of A or B class.
 
 So Java reduces this hectic/busy/rush situation by the use of interfaces(one of two extraction concept) which 
 implements/creates this concept and reduce this problem; as compile-time errors
 are tolerable than runtime faults in the program.

 Example: 
 Vehicle	- super class
 Car	- sub class	
 BMW	-sub class
  
  sub class can use attributes(vehicle's common features such as wheels, horn etc)
  of super class. 
  
 
 */


package learnInheritance;

public class Vehicle { //Base / Super Class  
	
//public class main method use korbona akhane, 

	//*** why we use main method to create class? we use for execution purposes. 

//	we are not executing (run) a class from here coz we told these methods from here 
//sub class will use. so we don't use main method in here. 
	
	public void applyHorn() {    // public void .... - method, sysout- mesg that i want to print
		System.out.println("Apply Horn");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake");
	
	}
	
	public void applyMirror() {
		System.out.println("Apply Mirror");
	}
	public void applyWheel() {
		System.out.println("Apply Wheel");
	}
    public void Van () {
		
		System.out.println("Van");
	}
    public void taxi () {
		
		System.out.println("taxi");
	}
    
    public void Ambulence () {
		
		System.out.println("Ambulence");
	}
    
    
    
    
}

