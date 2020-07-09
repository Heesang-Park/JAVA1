package pk26.vector;

import java.util.Scanner;
import java.util.Vector;

// -1�� �Էµ� ������ Vector�� �ڷ�(Integer) �����ϰ� �ִ밪�� ����ϴ� �˰���

public class VectorBig {

	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); // ó������ �񱳴���� �����Ƿ� ù��°�� ������ �ִ밪���� �����
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) // �� ū���� ã������ ���Ǵ�
				big=v.get(i);// ū���� big�����濡 �����ϱ�
		}
		System.out.println("���� ū ����: "+big);
		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		
		//�Է�
		System.out.print("�����Է�(-1�� �ԷµǸ� ����): ");
		while(true) {
			int n=sc.nextInt();
			if(n==-1) {
				System.out.println("����");
				break;
			}
			v.add(n);
		}
		System.out.println("--���� ū��--");
		printBig(v);
		
		sc.close();
	}

}
