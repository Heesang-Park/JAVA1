package pk30.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee=new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim=new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong=new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		Stream<TravelCustomer> stream=customerList.stream();  
		
		System.out.println("== �� ��ܿ� �߰��� ������� ���==");
		stream.map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("== �� ���� ��� ���==");
		int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� ���: "+total);
		
		System.out.println("== 20�� �̻� ����� �����Ͽ� ���==");
		//�ڷ�
		customerList.stream().filter(c->c.getAge()>=20).
		map(c->c.getName()).sorted().forEach(s->System.out.println(s));//����
		
	}

}
