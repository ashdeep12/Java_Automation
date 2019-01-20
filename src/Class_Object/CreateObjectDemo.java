package Class_Object;
class Point{
	int x;
	int y;
	public Point (int x , int y){
		this.x = x;//in the Point method parameter having same name as that of class instance variable 
		this.y = y; //this.x variable the object and x is parameter of the method
	}
}
class Rectangle {
	int height;
	int width;
	Point origin = new Point(0,0);
	public Rectangle(Point origin, int height, int width){
		this.origin = origin;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle (int height, int width){
		this.height = height;
		this.width = width;
		
	}
	
	public int getArea(){
		return height * width;
	}
	public void move(int x, int y){
		origin.x = x;
		origin.y = y;
	}
}

public class CreateObjectDemo {
	 public static void main(String[] args) {
			
	        // Declare and create a point object and two rectangle objects.
	        Point originOne = new Point(23, 94); //originone.x = 23  originone.y = 94
	        Rectangle2 rectOne = new Rectangle2(originOne, 100, 200); //rectOne.origin = originone , rectone.origin.x = 23, rectone.origin.y = 94 
	        //rectone.height = 100 rectone.width = 200
	        Rectangle2 rectTwo = new Rectangle2(50, 100);//recttwo.height = 50 , recttwo.width = 100 
	        //recttwo.origin.x =0 , recttwo.origin.y =0 
			
	        // display rectOne's width, height, and area
	        System.out.println("Width of rectOne: " + rectOne.width); //200
	        System.out.println("Height of rectOne: " + rectOne.height);//100
	        System.out.println("Area of rectOne: " + rectOne.getArea()); //20000
			
	        // set rectTwo's position
	        rectTwo.origin = originOne;
			
	        // display rectTwo's position
	        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
	        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
			
	        // move rectTwo and display its new position
	        rectTwo.move(40, 72);
	        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
	        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
	    }
}
