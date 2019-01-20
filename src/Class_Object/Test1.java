package Class_Object;

public class Test1 {
	 public static void main(String[] args) {
	 int x = 10;
	 int y = 2;
	 try {
	 for (int z = 2; z >= 0; z--) {
	 int ans = x / z;
	System.out.print(ans+ " ");
	 }
	 } catch (Exception e1) {
	 System.out.println("E1");
	 } 
	
	 
	 StringBuilder s1 = new StringBuilder("Java");
	 String s2 = "Love";
	 s1.append(s2);  // s1 = JavaLove
	 s1.substring(4);// Love
	 int foundAt = s1.indexOf(s2); // 4
	System.out.println(foundAt);

	 }
	}

