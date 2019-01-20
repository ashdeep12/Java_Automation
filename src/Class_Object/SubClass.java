package Class_Object;

class SuperClass {
	 SuperClass(int x) {
	 System.out.println("Super" + x);
	 }
	}
	public class SubClass extends SuperClass {
	 SubClass() {
	 super(10);
	 System.out.println("Sub 2");
	 }
	 public static void main(String argc[]){
		SubClass sb1 = new SubClass();	 
			 
	 }
	}
