package learnAbstractCalss;

public class Karim extends MobileUser {
	
	//both Call(), sendMessage(), methods internally comes here for inheritance concept]
	
	@Override 
	void sendMessage() { //non abstract method coz no abstract keyword
		System.out.println("Hi, I am Karim");
	}

} //(abs or no abs method doesn't matter, same method holei @ovverride hobe)
//mobile user e - abstract void sendMessage(); abst method ache, 
//and karim sub class e non abst method ache void sendMessage() {}
//BUT karim sub class e same method name "sendMessage" use hoyese, 
//so @override use korte hobe.

//cant use  abstract method in non abs class

//Object-oriented programming has four basic concepts: encapsulation, abstraction,
//inheritance, and polymorphism

//We can declare our methods by specifying the method signature that consists of the access modifier (public, private…), the name of a method, and method parameters. If we want our method to have an implementation, it needs to have two curly braces to specify the body of the method. We place our code between those curly brackets. Additionally, we have to include a return value (void, int, double…) for our method to be valid. The return type doesn’t apply as a part of the method signature, but we can’t create a method without it. Thus it injects itself into a signature (or specification).

/*We can declare our methods by specifying the method signature that consists 
of the access modifier (public, private…), the name of a method, and method 
parameters. If we want our method to have an implementation, it needs to have
two curly braces to specify the body of the method. We place our code between
those curly brackets. Additionally, we have to include a return value 
(void, int, double…) for our method to be valid. The return type doesn’t 
apply as a part of the method signature, but we can’t create a method 
without it. Thus it injects itself into a signature (or specification).

A method that returns a value needs to satisfy two conditions. First, 
it needs to specify a return type before the method name. The second, 
it needs to have a return statement within its body (inside curly braces). 
On the other hand, if the method doesn’t return anything, the void keyword 
is used instead of the return keyword. If that’s the case, a method doesn’t
 need to have a return statement inside its body:

*/



































































































































