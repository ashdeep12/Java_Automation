package Arrays;

public class TwoDim {

	
	public static void main(String orgs[]){
	int[][] twoDimension = new int[4][4];
	int[][] twoDimension1 = {{0,1,2,3}, {4,5,6,7} , {8,9,10,11},{12,13,14,15}};
	
	for(int i = 0; i<4 ; i++){ //i = 0 i=1 i== 2 i = 3
		for (int j = 0; j<4; j++){ //j = 0,1,2,3 j=0,1,2,3 j = 0,1,2,3 j = 0,1,2,3 
			
			twoDimension[i][j] = i + j; // twoDimension[0][0] = 0+0 == 0  
			
		
		}
	}
 for(int i = 0; i<4; i++){
	 for(int j = 0; j<4; j++){
		 System.out.println(twoDimension[i][j]);
		
	 }
 }
 for(int i = 0; i<4; i++){
	 for(int j = 0; j<4; j++){
 System.out.println(twoDimension1[i][j]); 
	 }
 }
}
}
