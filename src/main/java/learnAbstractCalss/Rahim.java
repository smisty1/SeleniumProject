package learnAbstractCalss;

public class Rahim extends MobileUser{
	
	//both Call(), sendMessage(), methods internally comes here for inheritance concept]
	
	@Override
	void sendMessage() {
		System.out.println("Hi, I am Rahim");
	}

}