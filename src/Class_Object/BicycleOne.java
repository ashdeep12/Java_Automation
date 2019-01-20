package Class_Object;

public class BicycleOne {
static int numberOfBicycles = 0;
int y;
static int x = 7;
 public BicycleOne(){
	 numberOfBicycles += 1;
	 
	 
 }
/* public static void main(String orgc[]){
		BicycleOne b1 = new BicycleOne();
		System.out.println(b1.numberOfBicycles);//b1.numberOfBicycles = 1 BicyclOne.numberOfBicycles =
		System.out.println( BicycleOne.numberOfBicycles);
		
		
		BicycleOne b2 = new BicycleOne();	//b2.numberOfBicycles= 1 	
		System.out.println(b1.numberOfBicycles);
	}*/
 
 public static void main(String orgc[]){
	 BicycleOne a = new BicycleOne();
	 BicycleOne b = new BicycleOne();
	 a.y = 5;
	 b.y = 6;
	 a.x = 1;
	 b.x = 2;
	 System.out.println("a.y = " + a.y);
	 System.out.println("b.y = " + b.y);
	 System.out.println("a.x = " + a.x);
	 System.out.println("b.x = " + b.x);
	 System.out.println("BicycleOne.x = " + BicycleOne.x);
 }
 
}
