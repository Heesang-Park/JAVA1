package pk23;

public class StBufferTest {
public static void main(String[] args) {
	String str="";
	StringBuffer buf=new StringBuffer("Nice Day! ");
	
	System.out.println(buf.toString());
	System.out.println(buf.length());
	System.out.println(buf.capacity());
	buf.ensureCapacity(100);
	System.out.println(buf.capacity());
	buf.insert(0, "Hi! ");
	buf.insert(14, "Everybody^^");
	System.out.println(buf);
	buf.delete(0, 4);
	System.out.println(buf);
	
	
	
	
	
}		
}
