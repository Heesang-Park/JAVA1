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
	//containsKey: HashMap���� �����ϴ� Key���� Ȯ���ϴ� �޼ҵ�
	public boolean removeMember(int memberid) {
		if(hashMap.containsKey(memberid)) {
			hashMap.remove(memberid);
			return true;
		}
		System.out.println(memberid+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {// ��ȸ�ϸ鼭 key�� ��ƿ´�
		//Key set(): Key���� �����ϰ� �ִ� �޼ҵ�
		Iterator<Integer> ir=hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();// key���� ����
			Member member=hashMap.get(key); // Key��������
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
