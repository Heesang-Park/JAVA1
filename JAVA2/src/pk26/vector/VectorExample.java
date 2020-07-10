package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list=new Vector<Board>();
		
		Board board1=new Board("����1","����1","�۰�1");
		
		list.add(board1);
		list.add(new Board("����2","����2","�۰�2"));
		list.add(new Board("����3","����3","�۰�3"));
		list.add(new Board("����4","����4","�۰�4"));
		list.add(new Board("����5","����5","�۰�5"));
		
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
