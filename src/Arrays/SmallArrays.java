package Arrays;

public class SmallArrays {

	private int[] sa;
	//private int sa1[];
	
	//create construcor 
	public SmallArrays(){
		sa = new int[3];
		//sa1 = new int[12];
	}
	
	//create mehod
	
	public void getInfo(){
		for (int i = 0; i < sa.length; ++i,System.out.println( "inside for loop : " + i )){
			System.out.println("sa value of location: " + i + " " + " is - " + sa[i] );
			
			i = i + 1; // i=1
			
			System.out.println("i value inside the body of forloop: "+ i);
			
		}
		
		/*for (int i = 0; i < sa1.length; ++i){
			System.out.println("sa1 value of location: " + i + " " + " is - " + sa1[i] );
		}*/
	}
	public void setInfo(){
		for (int i = 0; i < sa.length; i++){
			sa[i] = i + 1;
			
		}
		
		/*for (int i = 0; i < sa1.length; i++){
			sa1[i] = i + 1;
		}*/
	}
	public static void main(String Orgs[]){
		//create an object
		SmallArrays SA = new SmallArrays();
		SA.setInfo();
		SA.getInfo();
		
	}
}
