package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// 람다식을 변수에 대입
		PrintString lamdaStr=(s)->System.out.println(s);
		lamdaStr.showString("Hello lamda_1");
		
		// 함수형 람다 유형1
		showMyString(lamdaStr);// lamdaStr: 람다식 객체
		//(s)->System.out.println(s); 복사되어 lamdaStr에 담겨있음
		
		// 함수형 람다 유형2
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
