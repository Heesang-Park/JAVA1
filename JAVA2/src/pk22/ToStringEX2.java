package pk22;

class Bk{
	int bookNumber;
	String bookTitle;
	
	Bk(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber+","+bookTitle;
	}
	
}

public class ToStringEX2 {

	public static void main(String[] args) {
		Bk book1=new Bk(200,"°³¹Ì");
		System.out.println(book1);
		System.out.println(book1.toString());
		
	}

}
