
public class ReverseString {
	public static void main(String orgs[]){
		
		String p1 = "HEAH"; // reverse and true or false
		
		char[] chReverse = p1.toCharArray();
		// chReverse[0] = H
		// chReverse[1] = E
		// chReverse[2] = A
		// chReverse[3] = H
		int length = p1.length();
		//length = 4
		boolean reverse = true;
		
		for(int i=0, j = length - 1; i<length/2; i++, j--){//i = 0 and j = 4-1 = 3
			//i = 1 and j = 3-1 = 2 and chReverse is 
			if (chReverse[i]!= chReverse[j]){ // i = E and J=E therefore, come out
				reverse = false;
				break;
			}
			
	}
		if (reverse){
			System.out.println("The string " + p1 + " is palandrom");
		}
		else {
			System.out.println("The string " + p1 + " is not palandrom");
		}
	}
}
