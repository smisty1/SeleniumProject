package javaPractice;

public class ArrayPractice {

	public static void main(String[] args) {


		//1. How to store the values into Arrays(Note: Two ways available)

				// first way
				//String [] names = {"Touhid", "Ashraf", "WXYZ", "Doha"}; 	
				
				String [] names = {"Shakil", "Helal", "Morium","Jaki","Nilufar"};

				//String [] name = {"Touhid","Ashraf","WXYZ","Doha"};

				int[] ph = {68220840, 4565555, 7895555, 1 ,2 ,3 ,4};	

				char[] ch1 = {'a', 'b', 'c', 'd'};

				short[] id = {1,2,3,4};
				
				//System.out.println(names.length);
				
				//System.out.println(names.length);
				
				System.out.println(names[0]);
				System.out.println(ph[6]);
				System.out.println(ch1[1]);
				System.out.println(id[2]);
				System.out.println(names.length);

				// Second way		
				//ClassName obj = new ClassName();

				String[] obj = new String[4];
				
				obj[0] = "Touhid";
				obj[1] = "Ashraf";
				obj[2] = "WXYZ";
				obj[3] = "xyz";
				
				System.out.println(obj.length);
				//obj[4] = "abc"; //try to write 5th Arrays through an exception

				//2. How to pick value from Array ---> array[indexNumber]		
				//System.out.println(obj[2]);

				//3. how to get count of Array ---> array.lenght
				System.out.println(obj.length);
	}

}
