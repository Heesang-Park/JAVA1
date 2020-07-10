package pk26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		// ÃÑ °´Ã¼¼ö
		int size=list.size();
		System.out.println("°´Ã¼¼ö: "+size);
		System.out.println("ÃÑ °´Ã¼¼ö: "+list.size());
		
		//for -> size, get, 
		for(int i=0;i<list.size();i++) {
			System.out.println(i+": "+list.get(i).toString()+"\t");
		}
		// »èÁ¦
		list.remove(0);
		list.remove(0);
		list.remove("Spring");

		System.out.println();
		// for
		for(int i=0;i<list.size();i++) {
			System.out.println(i+": "+list.get(i).toString()+"\t");
		}
		
	}

}
