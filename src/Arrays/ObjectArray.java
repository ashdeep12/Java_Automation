package Arrays;

public class ObjectArray {
	
	int i=0, j=0;
	
	public void setValues(int x, int y){
		i = x;
		j = y;
		x = 100;
		y=200;
	}
	public static void main(String orgs[]){
		int i=5, j=6;
		ObjectArray[] obj = new ObjectArray[2];
		obj[0] = new ObjectArray();
		obj[0].setValues(i,j);
		System.out.println("i is "+i+"  j is "+j);
		
	}
	

}


