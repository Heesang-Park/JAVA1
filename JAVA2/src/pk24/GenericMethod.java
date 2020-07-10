package pk24;

public class GenericMethod {
	
	public static<T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left=((Number)p1.getX()).doubleValue(); // 왼쪽 T에서 받음
		double right=((Number)p2.getX()).doubleValue(); // 
		double top=((Number)p1.gety()).doubleValue(); // 
		double bottom=((Number)p2.gety()).doubleValue(); // 
		
		double width=right-left; //10-0
		double height=bottom-top; //10.0-0		
		
		return width*height;
	}
	
public static void main(String[] args) {
	Point<Integer,Double> p1=new Point<Integer,Double>(0,0.0);
	Point<Integer,Double> p2=new Point<>(10,10.0);
	
	double rect=GenericMethod.<Integer, Double>makeRectangle(p1, p2);
	System.out.println("두점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
	
}
}
