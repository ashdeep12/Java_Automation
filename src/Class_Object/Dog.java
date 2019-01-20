package Class_Object;

public class Dog {
	//1. create data members
	private String breed;
	private int size;
	private int age;
	private String color;
	
	//2.create consructor
	public Dog(){
		breed = "";
		size = 0;
		age = 0;
		color = "";
	}
	
	
	//3. create methods 
	public void getInfo(){
		System.out.println("Breed = " + breed);
		System.out.println("Size = " + size);
		System.out.println("Age = " + age);
		System.out.println("Color = " + color);
		
	}
	//4. create main method in public class
	public static void main(String[] args){
		//5.create object of his class
		Dog boxie = new Dog();
		
		//6. assigned values o data members of the object
		boxie.breed = "Doberman";
		boxie.size = 12;
		boxie.age = 7;
		boxie.color = "Black";
	
		//7. get he output of the object through get info method
		boxie.getInfo();
	}
}
