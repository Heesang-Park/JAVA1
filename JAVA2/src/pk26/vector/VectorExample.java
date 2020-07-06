package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list=new Vector<Board>();
		
		Board board1=new Board("제목1","제목1","작가1");
		
		list.add(board1);
		list.add(new Board("제목2","내용2","작가2"));
		list.add(new Board("제목3","내용3","작가3"));
		list.add(new Board("제목4","내용4","작가4"));
		list.add(new Board("제목5","내용5","작가5"));
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	
		list.remove(2);
		list.remove(3);
		System.out.println("============================================");
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
	}

}
