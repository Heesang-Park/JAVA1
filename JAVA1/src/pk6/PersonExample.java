package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1= new Person("123456-123456","ȫ�浿");
		System.out.println(p1.nation+"\n"+p1.ssn+"\n"+p1.name);
		
		p1.name="ȫ���";
		//final : fix�Ǿ������Ƿ� ���� �Ұ�
//		p1.nation="USA";
//		p1.ssn="12345-67890";
		System.out.println(p1.name);
		
		
			
	}

}
