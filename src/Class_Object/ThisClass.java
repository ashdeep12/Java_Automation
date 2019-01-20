package Class_Object;

public class ThisClass {
int a;
int b;
int c;

public ThisClass(int a, int b, int c){
	this(a,b);
	this.c = c;
}

public ThisClass(int a, int b){
	this(a);
	this.b= b;
}


public ThisClass(int a){
	this.a= a;
}

public void  showVariables(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}

public static void main( String strr[]){
	ThisClass obj1 = new ThisClass(2,3,4);
	obj1.showVariables();
}


}
