package pk29.staticex;


public class Main {

	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 멤버 B클래스 객체 생성
		A.B b=a.new B();
		b.field1=3;
		b.method1();
		// 정적 멤버 C클래스 객체 생성
		A.C c=new A.C();// static이므로 독립된 메모리 공간에서 작동하기에 생성자를 공유할 수 없다.
		c.field1=3;
		c.method1();
		//c.field2=5; // 이제 곧 없어진다 클래스로 가져와서 사용한다
		//c.method2();
		A.C.field2=3;
		A.C.method2();
		
		//로컬 클래스 D 객체 생성를 위한 메소드 호출
		a.method();
		
	}

}
