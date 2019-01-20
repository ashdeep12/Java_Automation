package Class_Object;

public class Static{
	   public static void main(String args[]){
	     Student1 s1 = new Student1();
	     
	     Student1 s2 = new Student1();
	     s1.showData();
	     Student1 s3 = new Student1();
	     Student1.b++;
	     s2.showData();
	     
	     Student1.b++;
	     s1.showData();
	  }
	   
	   
	}

class Student1 {
int a; //initialized to zero
static int b = 7; //initialized to zero only when class is loaded not for each object created.

static{
	b = 3; //overriding initial value
	
}


  Student1(){
   //Constructor incrementing static variable b
   b++;
  }

   public void showData(){
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
   }
//public static void increment(){
//a++;
//}

}