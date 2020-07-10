package pk24;

public class GenericPrintTest {
	
	public static void main(String[] args) {
		/*T타입의 객체는 모든 클래스에서 상속이 
		 가능하여 자동으로 클래스에 형변환이 가능함 */
		
		GenericPrinter<Powder> powderprint=new GenericPrinter<Powder>();
		powderprint.setMaterial(new Powder());
		Powder powder=powderprint.getMaterial(); // 형 변환 하지 않음
		
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticprint=new GenericPrinter<Plastic>();
		plasticprint.setMaterial(new Plastic());
		Plastic plastic=plasticprint.getMaterial(); // 형 변환 하지 않음
		
		System.out.println(plastic);
		
		// 물의 재료는 허용되서는 안되지만 제네릭의 특성상 허용하는 모순발생
		/*GenericPrinter<Water> waterprint=new GenericPrinter<Water>();
		waterprint.setMaterial(new Water());
		Water water=waterprint.getMaterial();
		
		System.out.println(water);*/
		
		
	}

}
