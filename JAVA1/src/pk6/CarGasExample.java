package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCarGas=new CarGas();
		
		// CarGas�� setGas()�޼ҵ� ȣ��
		myCarGas.setGas(20);
		
		// CarGas�� isLesftGas()�޼ҵ� ȣ��
		boolean gasState=myCarGas.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			//CarGas�� run() �޼ҵ� ȣ��
			myCarGas.run();
		}
		//������ �ʿ� ���� �Ǵ�
		if(myCarGas.isLeftGas()) {
			System.out.println("gas �ܿ����� ���� �ֽ��ϴ�.");
		}else {
			System.out.println("������ �ʿ��մϴ�.");
		}
		
	}

}
