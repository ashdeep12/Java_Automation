package Variables;

public class PrePostDemo {
	public static void main(String[] args){
        int i = 3;
        
        System.out.println(i++); 
        System.out.println(i);    // "4"
        System.out.println(++i);                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
        
    }
}
