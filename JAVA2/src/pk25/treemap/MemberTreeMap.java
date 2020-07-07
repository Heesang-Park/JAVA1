package pk25.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import pk26.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberid(), member);
	}
	public boolean removeMember(int memberid) {
		if(treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);
			return true;
		}
		System.out.println(memberid+"는 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
