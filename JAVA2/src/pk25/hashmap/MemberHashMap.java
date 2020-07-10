package pk25.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import pk26.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	//construct
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member);
	}
	//containsKey: HashMap에서 제공하는 Key값을 확인하는 메소드
	public boolean removeMember(int memberid) {
		if(hashMap.containsKey(memberid)) {
			hashMap.remove(memberid);
			return true;
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {// 순회하면서 key를 잡아온다
		//Key set(): Key값만 저장하고 있는 메소드
		Iterator<Integer> ir=hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();// key들을 저장
			Member member=hashMap.get(key); // Key꺼내오기
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
