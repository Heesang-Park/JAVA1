package pk29.staticex;

public class Student {
	// 인스턴스 변수(heap 메모리)
	public static int serialNum =1000; //데이터 영역에 별도로 생성 저장
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum++;
		studentID=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	
	//static 메소드 만들기
	public static int getSerialNum() {
		int i=10; //지역변수(stack메모리 사용): 메소드가 끝나면 없어진다
		//studentName="aaa"; // (heap메모리)얘는 사용불가
		//serialNum++; // (Data메모리)얘는 사용가능
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
	
	
	
	
}
