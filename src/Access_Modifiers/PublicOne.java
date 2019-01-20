package Access_Modifiers;

public class PublicOne {
public int x;
public int y;
private int z;
int p;
protected int q;

public void main(){
	PublicOne p1 = new PublicOne();
	
	
	System.out.println(p1.x + "" + p1.y + "" + p1.z + "" + p1.p + "" + p1.q);
	
	System.out.println(this.x + "" + this.y + "" + this.z + "" + this.p + "" + this.q);
	
	
}

}

class PublicTwo {
	public void main(){
		PublicOne p1 = new PublicOne();
		
		
		System.out.println(p1.x + "" + p1.y + "" + p1.z + "" + p1.p + "" + p1.q);
		
		
		
		
	}
	
}

class PublicThree extends PublicOne{
	public void main(){
		PublicOne p1 = new PublicOne();
		
		
		System.out.println(p1.x + "" + p1.y + "" + p1.z + "" + p1.p + "" + p1.q);
		
		System.out.println(this.x + "" + this.y + "" + this.z + "" + this.p + "" + this.q);
		
		
		
		
	}
}

