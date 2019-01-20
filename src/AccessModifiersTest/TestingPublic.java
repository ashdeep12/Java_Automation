package AccessModifiersTest;

import Access_Modifiers.*;
public class TestingPublic {

	public static void main(String orgc[]){
		PublicOne p1 = new PublicOne();
		System.out.println(p1.x + "" + p1.y + "" + p1.z + "" + p1.p + "" + p1.q);
		
		
	}
	
	
}

class TestingPublicInheritence extends PublicOne{
	public void TestingAccess(){
		TestingPublicInheritence TP1 = new TestingPublicInheritence();
		System.out.println(TP1.x + "" + TP1.y + "" + TP1.z + "" + TP1.p + "" + TP1.q);
	}
}


