package pk29.anonymousinner;

class OutClass{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	//�޼ҵ�
	Runnable getRunnable(int i) {// �Ű������� final�� ó�� �Ǿ� �ٸ� Ŭ�������� ���Ұ�
	int num=100; //������������ ���ȭ �Ǿ��ִ� final
	int localnum=10;
	// �͸��� Ŭ����
		return new Runnable() {
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum: "+localnum+"(������ �ν��Ͻ� ����)");
				System.out.println("OutNum: "+outNum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("OutClass-static: "+sNum+"(�ܺ� Ŭ������ ��������)");
			}
		};
	}	
		// ���ο��� �۵����� ��ü
//		Runnable runner new=Runnable(){
//	
//		@Override
//		public void run(){
//			 TODO Auto-generated method stub
//		}
//	};
			
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		OutClass out=new OutClass();
		Runnable runner=out.getRunnable(10);
		runner.run();
		
		
		
	}
	
}
