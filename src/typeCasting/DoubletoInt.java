package typeCasting;

public class DoubletoInt {

	public static void main(String orgc[]){
		double d = 2147483647;
		int i = '?';
		//d =i;
		//i =d;
		
		char c;
		//c = i;
		c = (char )(i+2);
		//i = (int )d;
		System.out.println(d);
		System.out.println(i);
		System.out.println(c);
	}
}
