import java.util.ArrayList;


public class Test_ArrayList {
	public static void main(String[] args) {
		  //Creating a generic ArrayList
		  ArrayList arlTest = new ArrayList();
		    char[]  chtest = new char[4];
		    
		    chtest[0] = 'D';
		    chtest[1] = 'U';
		    chtest[2] = 'k';
		    chtest[3] = 'E';
		   // chtest[4] = 'F';
		  //Size of arrayList
		  System.out.println("Size of ArrayList at creation: " + arlTest.size());
		  //Lets add some elements to it
		  arlTest.add("D");
		  arlTest.add("U");
		  arlTest.add("K");
		  arlTest.add("E");
		  
		  arlTest.add("F");

		  //Recheck the size after adding elements
		  System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

		  //Display all contents of ArrayList
		  System.out.println("List of all elements: " + arlTest);

		  //Remove some elements from the list
		  arlTest.remove("D");
		  System.out.println("See contents after removing one element: " + arlTest);

		  //Remove element by index
		  arlTest.remove(2);
		  System.out.println("See contents after removing element by index: " + arlTest);

		  //Check size after removing elements
		  System.out.println("Size of arrayList after removing elements: " + arlTest.size());
		  System.out.println("List of all elements after removing elements: " + arlTest);

		  //Check if the list contains "K"
		  System.out.println(arlTest.contains("K"));

		 }
}
