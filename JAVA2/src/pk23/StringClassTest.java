package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons=strClass.getConstructors();
		for(Constructor c :cons) {
			System.out.println(c+" ");
		}
		System.out.println();
		
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		System.out.println();
		
		Field[] fields=strClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		System.out.println();
		
		Class perClass=Class.forName("pk23.Person");
		Constructor[] con2=perClass.getConstructors();
		for(Constructor c2:con2) {
			System.out.println(c2);
		}
		
		
		
	
		
		
	}

}
