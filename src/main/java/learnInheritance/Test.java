package learnInheritance;

public class Test {

	public static void main(String[] args) { 
		//main method static,static keyword thakle main method.

		//BMW last class and connected with vehicle and other class, so 
		//create obj of BMW class
       //create object of BMW class
	  // BMW obj = new BMW ();
		
		BMW obj = new BMW ();
		
		obj.applyHorn();
		obj.applyBrake();
		obj.applyMirror();  
		obj.applyWheel();
		
		obj.turnAc();
		obj.absBrake();
		
//resuabilty- ak jaigai method likhesi non static e , static e call 
// korte persi run korer jonno. akta class r shathe r akta class connect kore
//ter method or attribute call korte perbo, jokon jeta dorker seta use korte perbo
//atai resuability.
		
	//vehicle e je method ache, seta BMW t thakle method overriding bole
	
	//obj create na korle static r modhe non static run korte parina. 
	
	// je nonsatic  ache ter obj create kore static e call kora jai. 
	//BMW nonstatic and connected with vehicle and car, so BMW object create kore 
	//static r modhe non static methods call koresi
	
	//static theke direct staic call kora jai.
		
//** extends manei connection, connection manei inheritance. 
	}

}
