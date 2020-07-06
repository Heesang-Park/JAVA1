package pk6;

public class CarExam {
	public static void main(String[] args) {
		System.out.println("----------필드 활용1----------");
		Car car1=new Car(); // 멤버변수 초기화된거 사용가능 Ex)car1.company
		// 초기화된 필드지만 변경이 가능하다
		//car1.company="기아자동차"; 
		System.out.println("car1.company : "+ car1.company);
		
		System.out.println("----------필드 활용2----------");
		Car car2=new Car("소나타");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		
		System.out.println("----------필드 활용3----------");
		Car car3=new Car("그랜져","빨강");
		System.out.println("car3.company : "+car1.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		
		System.out.println("----------필드 활용4----------");
		Car car4=new Car("택시","검정",200);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car3.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		
	}

}
