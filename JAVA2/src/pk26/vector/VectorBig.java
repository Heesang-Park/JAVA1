package pk26.vector;

import java.util.Scanner;
import java.util.Vector;

// -1이 입력될 때까지 Vector에 자료(Integer) 저장하고 최대값을 출력하는 알고리즘

public class VectorBig {

	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); // 처음에는 비교대상이 없으므로 첫번째는 무조건 최대값으로 저장됨
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) // 더 큰수를 찾기위해 비교판단
				big=v.get(i);// 큰수를 big변수방에 저장하기
		}
		System.out.println("가장 큰 수는: "+big);
		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		
		//입력
		System.out.print("정수입력(-1이 입력되면 종료): ");
		while(true) {
			int n=sc.nextInt();
			if(n==-1) {
				System.out.println("종료");
				break;
			}
			v.add(n);
		}
		System.out.println("--가장 큰수--");
		printBig(v);
		
		sc.close();
	}

}
