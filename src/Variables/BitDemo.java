package Variables;

public class BitDemo {
	public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x000F;
        // prints "2"
        //0000 0000 0000 1111 
        //0010 0010 0010 0010
        //0000 0000 0000 0010
        
        //0010 0010 0010 1111
        System.out.println(val == 0x000F  || bitmask == 0x000F);
        
        boolean b =true;
        System.out.println(b);
        System.out.println(!b);
        
        
        int i = 10;
        int n = (i++)%5;
        
        System.out.println(n);
        System.out.println(i);
    }
}
