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
		//Iterator�� �ڹ��� �÷��� �����ӿ����� �÷��ǿ� ����Ǿ� �ִ�
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=memberid;
			if(tempId==memberid) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberid+"���̵� �����ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println(treeSet);
	}
	
	
}
