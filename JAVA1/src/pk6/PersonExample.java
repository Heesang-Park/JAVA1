package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1= new Person("123456-123456","홍길동");
		System.out.println(p1.nation+"\n"+p1.ssn+"\n"+p1.name);
		
		p1.name="홍삼원";
		//final : fix되어있으므로 변경 불가
//		p1.nation="USA";
//		p1.ssn="12345-67890";
		System.out.println(p1.name);
		
		
			
	}

}
