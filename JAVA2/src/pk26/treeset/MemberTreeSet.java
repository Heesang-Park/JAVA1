package pk26.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import pk26.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet=new TreeSet<Member>();
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberid) {
		//Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=memberid;
			if(tempId==memberid) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberid+"아이디가 없습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println(treeSet);
	}
	
	
}
