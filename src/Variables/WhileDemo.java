package Variables;

public class WhileDemo {
	public static void main(String[] args){
        int count = 11;
        int countdo =11;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
         do {
            System.out.println("Count is: " + count);
            countdo++;
        } while (countdo < 11);
    }
}
