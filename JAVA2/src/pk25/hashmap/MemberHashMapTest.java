package pk25.hashmap;

import pk26.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap= new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "�����"));
		memberHashMap.addMember(new Member(1002, "������"));
		memberHashMap.addMember(new Member(1003, "�ڼ�ȥ"));
		memberHashMap.addMember(new Member(1004, "ȫ����"));
		memberHashMap.showAllMember();
		
		System.out.println();
		
		memberHashMap.addMember(new Member(1004,"�浿��"));
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
