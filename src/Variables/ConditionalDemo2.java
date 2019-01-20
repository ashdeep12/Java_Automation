package Variables;

public class ConditionalDemo2 {
	public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int opt1 = 20;
        int opt2 = 20;
        
        int result;
        boolean someCondition = false;
        result = (opt1 != opt2) ? value1 : value2;

        System.out.println(result);
    }
}
