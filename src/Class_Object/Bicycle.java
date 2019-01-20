package Class_Object;

public class Bicycle {
	// the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
      public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
     public Bicycle(){
    	 gear = 0;
    	 cadence = 0;
    	 speed = 0;
     }
     
     public Bicycle(int gear, int cadence){
    	 this.gear = gear;
    	 this.cadence = cadence;
    	 speed = 0;
     }
     
     public Bicycle(int gear){
    	 this.gear = gear;
    	 cadence = 0;
    	 speed = 0;
     }
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    public static void main(String argc[]){
    	Bicycle bCycle = new Bicycle();
    	Bicycle bCycle1 = new Bicycle(5,4);
    	Bicycle bCycle2 = new Bicycle(5);
    	Bicycle bCycle5 = new Bicycle(5,4,3);
    	MountainBike mBike = new MountainBike(7,8,9,5);
    	
    	System.out.println(mBike.gear);
    	System.out.println(mBike.cadence);
    	System.out.println(mBike.speed);
    	System.out.println(mBike.seatHeight);
    	
    	MountainBike mBike1 = new MountainBike(7,8,9);
    	
    	System.out.println(mBike1.gear);
    	System.out.println(mBike1.cadence);
    	System.out.println(mBike1.speed);
    	System.out.println(mBike1.seatHeight);
    }
    
    
}

 class MountainBike extends Bicycle {
    
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }  
    public MountainBike( int startCadence,
            int startSpeed, int startGear) {
super(startCadence, startSpeed, startGear);
seatHeight = 0;
}  
    
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}
