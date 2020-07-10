package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// ���ٽ��� ������ ����
		PrintString lamdaStr=(s)->System.out.println(s);
		lamdaStr.showString("Hello lamda_1");
		
		// �Լ��� ���� ����1
		showMyString(lamdaStr);// lamdaStr: ���ٽ� ��ü
		//(s)->System.out.println(s); ����Ǿ� lamdaStr�� �������
		
		// �Լ��� ���� ����2
		PrintString reStr=returnString();
		reStr.showString("Hi");
			
	}
	public static void showMyString(PrintString p) {
		p.showString("Hello lamda_2");
	}
	public static PrintString returnString() {
		return (s)->System.out.println(s+" World");
	}
	

}
