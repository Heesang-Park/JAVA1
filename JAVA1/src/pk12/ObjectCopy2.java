package pk12;

public class ObjectCopy2 {
// 깊은 복사
	public static void main(String[] args) {
		Book[] bookArray1= new Book[3];	
		Book[] bookArray2= new Book[3];	
		
		bookArray1[0]=new Book("태백산맥", "조정래");
		bookArray1[1]=new Book("데미안", "헤르만 헤세");
		bookArray1[2]=new Book("어린왕자", "생텍쥐페릭");
		
		bookArray2[0]=new Book(); //객체 직접 생성
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		
		for(int i=0;i<bookArray1.length;i++){ // 각각의 요소 복사
		bookArray2[i].setBookname((bookArray1[i].getBookname()));
		bookArray2[i].setAuthor((bookArray1[i].getAuthor()));
		}
		
		for(int i=0;i<bookArray2.length;i++){
			bookArray2[i].showBookinfo();
		}
		
		bookArray1[0].setBookname("나목"); // bookArray1의 내용수정
		bookArray1[0].setAuthor("박완서");
		System.out.println("====bookArray1======");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		System.out.println("====bookArray2======");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo(); // 다른 내용으로 출력됨
		}
		
		
		
		
	}

}
