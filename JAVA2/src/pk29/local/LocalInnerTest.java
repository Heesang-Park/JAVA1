package pk29.local;

class OutterClass{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	//�޼ҵ�
	Runnable getRunnable(int i) {// �Ű������� final�� ó�� �Ǿ� �ٸ� Ŭ�������� ���Ұ�
		int num=100; //������������ ���ȭ �Ǿ��ִ� final
		
		//�޼ҵ� ���ο� Ŭ���� ����
		class MyRunnable implements Runnable{// functional interface
			int localnum=10;
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum: "+localnum+"(������ �ν��Ͻ� ����)");
				System.out.println("OutNum: "+outNum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("OutClass-static: "+sNum+"(�ܺ� Ŭ������ ��������)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		OutterClass out=new OutterClass();
		Runnable runner=out.getRunnable(10);
		runner.run();
		
		
		
	}

}
