package Inheritance;

class Doctor {
	 void Doctor_Details() {
	  System.out.println("Doctor Details...");
	 }
	}

	class Surgeon extends Doctor {
	 void Doctor_Details() {
		 super.Doctor_Details();
	  System.out.println("Surgen Detail...");
	 }
	}

	public class Hospital {
	 public static void main(String args[]) {
	  Surgeon s = new Surgeon();
	  //s.Doctor_Details();
	 
	  s.Doctor_Details();
	 }
	}