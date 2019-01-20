package Variables;

public class Access_Variables {
	static int anArray[];
	static int[] anArray1;//staic or class variable
	int[] anArray2;/*non static also called as instance variable*/
	
	public static void main(String argc[]){//parameter
		anArray = new int[10];
		anArray1 = new int[10];
		int[] anArray3;//local variable
		 // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        /*anArray[10] = 1100;*/
		Access_Variables acv = new Access_Variables();
		Access_Variables.show();
	}
	
	public static  void show(){
		
		for(int i=0; i < anArray.length; i++ ) {
			System.out.println(anArray[i]);
		}
		
		
	}
}
