package pk29.staticex;

public class Student {
	// �ν��Ͻ� ����(heap �޸�)
	public static int serialNum =1000; //������ ������ ������ ���� ����
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
	
	//static �޼ҵ� �����
	public static int getSerialNum() {
		int i=10; //��������(stack�޸� ���): �޼ҵ尡 ������ ��������
		//studentName="aaa"; // (heap�޸�)��� ���Ұ�
		//serialNum++; // (Data�޸�)��� ��밡��
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
	
	
	
	
}
