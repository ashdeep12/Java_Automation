package Class_Object;

public class ThisKeyWord {
	String a = "Shad";
	String b = "Om";
	
	public void setVariables(int a, int b){
		a = a; //this.a is for class variable a and right hand side a is local variable of the set variable method
		b = b;
	}
	
	public void showVariable(){
	System.out.println(a);
	System.out.println(b);
	}
 public static void main(String orgs[]){
	 ThisKeyWord obj1 = new ThisKeyWord();
	 obj1.setVariables(1, 2);
	 obj1.showVariable();
	 obj1.a = "Om";
	 obj1.b = "R";
	obj1.showVariable();
	 
 }
 
 
}
