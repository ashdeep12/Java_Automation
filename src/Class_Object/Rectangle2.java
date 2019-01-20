package Class_Object;

public class Rectangle2 {
	int width;
	int height;
	public int area(){
		return width*height;
	}
	    public static void main(String[] args) {
	        Rectangle2 myRect = new Rectangle2();
	        myRect.width = 40;
	        myRect.height = 50;
	        System.out.println("myRect's area is " + myRect.area());
	    }
	}

