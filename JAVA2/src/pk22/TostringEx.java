package pk22;

class Book{
	String title;
	String author;
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return title +","+ author;
	}
}

public class TostringEx {

	public static void main(String[] args) {
		Book book= new Book("JAVA","ȫ�浿");
		System.out.println(book);
		
		String str=new String("Test");
		System.out.println(str);
		
		
		
	}

}
