package pk12;

public class BookArray {
	public static void main(String[] args) {
		Book[] library=new Book[5];
		
		library[0]=new Book("태백산맥", "조경래");
		library[1]=new Book("데미안", "헤르만헤서");
		library[2]=new Book("어떻게 살 것인가", "유시민");
		library[3]=new Book("토지", "박경리");
		library[4]=new Book("어린왕자", "생텍쥐페릭");
		
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfo();
		}
		System.out.println();
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]); // hashcode만 나온다
		}
		
	}

}
