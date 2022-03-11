package learnCollections;
 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LearnList {

	public static void main(String[] args) {

		// Step 1:- Create object for ArrayList class
		
				//Syntax-List<Integer> lst = new ArrayList<Integer>();
				
				//List<Integer> id = new LinkedList<Integer>();
				//List<Integer> id = new ArrayList<Integer>();
				
				List<Integer> id = new LinkedList<Integer>();
				
				id.add(15);
				id.add(10);
				id.add(20);
				id.add(30);
				id.add(444);
				id.add(17);
				id.add(444);
				id.add(5);
				System.out.println(id); //maintain inserting order-see output
				
				System.out.println("...............................................");
				
				System.out.println(id.size());
				
				System.out.println("...............................................");
				
				for (Integer eachId : id) {
					System.out.println(eachId);
				}
				
				//List<String> lst = new ArrayList<String>();
				
			/*	List<String> lst = new ArrayList<String>();
						
						lst.add("Neepa");
						lst.add("Mahbub");
						lst.add("Mahbub");
						lst.add("xyz");
						lst.add("yousuf");
						lst.add("shihab");
						lst.add("Mamun");
						lst.add("emad");
						lst.add("Neepa");

						System.out.println(lst);
						
						//Get the count of list		
						//System.out.println(lst.size());	
						System.out.println(lst.size());
						
						System.out.println("...............................................");
						
						//Add new Item in the List
						lst.add("shihab");
						
						//Get the count of list	
						System.out.println(lst.size());
						
						System.out.println("...............................................");

						//print all items inside the list		
						for (int i = 0; i < lst.size(); i++) {
							System.out.println(lst.get(i));
						}

						System.out.println("...............................................");
			
						// delete particular item from list
						lst.remove(3);

						System.out.println("...............................................");
						
						//System.out.println(lst);
						
						//Verify after remove, print all items inside the list		
					for (int i = 0; i < lst.size(); i++) {
							System.out.println(lst.get(i));
					}

						System.out.println("...............................................");
						
						//Verifing Particular Item in the List-true/false
						System.out.println(lst.contains("Neepa1"));	
						
						System.out.println("...............................................");
						
						//Clear the List
						lst.clear();
						
						System.out.println("...............................................");
						
						//Confirms/Verify the List is Empty-true/false
						System.out.println(lst.isEmpty()); */
			  
				  
				/*  List<String> lst1 = new ArrayList<String>(); 
				  lst1.add("Shamim");
				  lst1.add("Mamun"); 
				  lst1.add("Yousuf");
				  lst1.add("Limon"); 
				  lst1.add("Shihab");
				  lst1.add("Touhid"); 
				  lst1.add("Gopi"); 
				  lst1.add("Jewel"); 
				  lst1.add("Shahnaz");
				  lst1.add("Farah");
				  
				  
				  //Get the count of the list System.out.println(lst.size());
				  System.out.println("...............................................");
				  
				  lst1.add("shihab"); 
				  System.out.println(lst1.size());
				  System.out.println("...............................................");
				  
				  //Print all items inside the list 
				  for(int i = 0; i < lst.size(); i++) {
				  System.out.println(lst1.get(i));
				  
				  }
				  
				  System.out.println("...............................................");
				  //Delete the item from the list lst.remove(0);
				  
				  //again Print all items inside the list
				  
				  for(int i = 0; i <lst.size(); i++) { 
					  System.out.println(lst.get(i));
				  
				  } System.out.println("...............................................");
				  
				  System.out.println(lst.contains("abc"));
				  
				  System.out.println("...............................................");
				  
				  System.out.println(lst.contains("Yousuf"));
				  
				  System.out.println("...............................................");
				  lst.clear();
				  
				  System.out.println(lst.isEmpty());
				  System.out.println("...............................................");
				 
				
				
				List<Integer> lst1 = new ArrayList<Integer>();
				lst1.add(123);
				lst1.add(101112);
				lst1.add(456);
				lst1.add(789);
				lst1.add(123);
				
				
				
				for (Integer eachLst : lst1) {
					System.out.println(eachLst);
				}*/

			}
		
	}


