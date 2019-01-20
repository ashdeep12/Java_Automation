package Class_Object;

public class Rectangle1 {
	
	 private int x, y;
	    private int width, height;
	      public static void main(String orgc[]){
	    	  Rectangle1 rectOne = new Rectangle1();
	    	  Rectangle1 recttwo = new Rectangle1(70, 80);
	    	  Rectangle1 rectthree = new Rectangle1(10, 20, 30, 40);
	      }
	    public Rectangle1() {
	        this(20, 30, 41, 31);
	    }
	    public Rectangle1(int width, int height) {
	        this(0, 0, width, height);
	    }
	    public Rectangle1(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }
	   
}
