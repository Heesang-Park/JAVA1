package pk23;

public class StringBuilderTest {
	public static void main(String[] args) {
		// immutable 불변(원본이다)
		String javastr=new String("java");
		// 처음 객체의 인스턴화시 메모리값
		System.out.println("javastr의 문자열 주소: "+System.identityHashCode(javastr));
		//String으로부터 StringBuilder의 객체를 생성
		StringBuilder buffer=new StringBuilder(javastr);
		// 연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 bufer의 메모리 주소: "+System.identityHashCode(buffer));
		
		buffer.append(" and ");
		buffer.append("Android");
		buffer.append(" Programing is fun!");
		
		System.out.println("연산 후 bufer의 메모리 주소: "+System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("새로 만들어진 javastr의 문자열 주소: "+System.identityHashCode(javastr));
		
		
		
	}

}
