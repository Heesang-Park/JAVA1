package pk6;

public class Computer {
	
	//�޼ҵ�
	
	int sum1(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
			
		}
		return sum;
	}
	// �޼ҵ�
	int sum2(int ...values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
}
