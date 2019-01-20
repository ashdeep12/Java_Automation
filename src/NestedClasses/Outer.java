package NestedClasses;

public class Outer {
	public int x = 0;

    class FirstLevelInner {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + Outer.this.x);
        }
        
        class SecondLevelInner{
        	public int x = 2;
        	
        	void methodInSecondLevel (int x){
        		System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("ShadowTest.this.x = " + FirstLevelInner.this.x);
                System.out.println("ShadowTest.this.x = " + Outer.this.x);
        	}
        }
    }

    public static void main(String... args) {
    	Outer st = new Outer();
    	Outer.FirstLevelInner fl = st.new FirstLevelInner();
    	Outer.FirstLevelInner.SecondLevelInner S1 = fl.new SecondLevelInner();
        fl.methodInFirstLevel(23);
        S1.methodInSecondLevel(30);
        
        
    }
}
