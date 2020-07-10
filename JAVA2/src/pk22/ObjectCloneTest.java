package pk22;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle=new Circle(10,20,30);
		Circle copycircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copycircle);
		// hash 값 hashcode 되기 전 값
		System.out.println("실제주소 값: "+System.identityHashCode(circle));
		System.out.println("실제주소 값: "+System.identityHashCode(copycircle));
		
		
		
	}

}
