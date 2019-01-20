package StringSyntax1;

public class StringSyntax1 {
 
	public static void main(String orgs[]){
	 
		//String is an array of characters
		char[] arrSample = {'R', 'O', 'S', 'E'};
		String strSample_1 = new String (arrSample); 
		
		//Representation of String
		String strSample_2 = "ROSE";
		System.out.println(strSample_2);	
	 System.out.println(strSample_1);
	 
	//Method 1 : Using concat
	 String str3 = strSample_1.concat(strSample_2);
	 
	 System.out.println(str3);
	 
	//Method 2 : Using "+" operator
	 String str4 = strSample_1 + strSample_2;
	 System.out.println(str4);
	 
	//Method 3 : Using "+" operator
		 String str5 = strSample_1 + 1;
		 System.out.println(str5);
		 
		 String str_Sample = "RockStar";
		  //Length of a String
		  System.out.println("Length of String: " + str_Sample.length());
	 
		  String str_Sample1 = "RockStar";
		  System.out.println("Character at position 5: " + str_Sample1.charAt(5));
		  //Index of a given character
		  System.out.println("Index of character 'S': " + str_Sample1.indexOf('S'));
		  
		  String str_Sample2 = "RockStar";
		  System.out.println("Compare To 'ROCKSTAR': " + str_Sample2.compareTo("rockstar"));
		  //Compare to - Ignore case
		  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample2.compareToIgnoreCase("ROCKSTAR"));
 
		  String str_Sample3 = "RockStar";
		  System.out.println("Contains sequence 'tar0': " + str_Sample3.contains("tar0"));
		  
		  String str_Sample4 = "RockStar";
		  System.out.println("EndsWith character 'r': " + str_Sample4.endsWith("r"));
		  
		  String str_Sample5 = "RockStar";
		  System.out.println("Replace 'Rock' with 'Duke': " + str_Sample5.replace("Rock", "Duke"));
		  
		  String str_Sample6 = "RockStar";
		  System.out.println("Convert to LowerCase: " + str_Sample6.toLowerCase());
		  //Convert to UpperCase
		  System.out.println("Convert to UpperCase: " + str_Sample6.toUpperCase());
		  
		  String h1 = "HHhello";//will be in memory
          char[] ch1 = new char[7];
          ch1 = h1.toCharArray();
          System.out.println(ch1[4]);
          
      
          
          
		  h1 = "hello"+"world";
		  
		  
		  System.out.println(h1);
		  
		  String S1 ="The number is: "+ "123"+"456";

		  System.out.println(S1);
		  
		  String S2 = "The number is: "+(123+456);

		  System.out.println(S2);
		  
		  
	}
 
}
