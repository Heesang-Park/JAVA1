package pk29.staticex;


public class Main {

	public static void main(String[] args) {
		A a=new A();
		
		//�ν��Ͻ� ��� BŬ���� ��ü ����
		A.B b=a.new B();
		b.field1=3;
		b.method1();
		// ���� ��� CŬ���� ��ü ����
		A.C c=new A.C();// static�̹Ƿ� ������ �޸� �������� �۵��ϱ⿡ �����ڸ� ������ �� ����.
		c.field1=3;
		c.method1();
		//c.field2=5; // ���� �� �������� Ŭ������ �����ͼ� ����Ѵ�
		//c.method2();
		A.C.field2=3;
		A.C.method2();
		
		//���� Ŭ���� D ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
	}

}
