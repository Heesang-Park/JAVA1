package pk22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing : 기본타입의 값을 객체화
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer obj3=new Integer.valueOf("300");
		
		// UnBoxing 객체를 기본 타입으로 변수에 저장
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		
	}

}
