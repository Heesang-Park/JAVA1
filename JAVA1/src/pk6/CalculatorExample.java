package pk6;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		
		myCalc.powerOn();
		
		int result1=myCalc.plus(39, 28);
		System.out.println("x+y: "+result1);
						
		byte x=10;
		byte y =4;
		double result2 = myCalc.divide(x, y);
		System.out.println("x/y: "+result2);
		
		myCalc.powerOff();
		
		
	}

}
