package pk23;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ü�� �����ؼ� Ŭ�����̸� ȹ���ϱ�
		Person person=new Person();
		//Object�� getClass()�޼ҵ带 ���
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		//Ŭ������ ���� �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		// Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("pk23.Person");
		System.out.println(pClass3.getName());
		
		
		
	}

}