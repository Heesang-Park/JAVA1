package pk25.hashmap;

import pk26.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap= new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "이쥐원"));
		memberHashMap.addMember(new Member(1002, "손진국"));
		memberHashMap.addMember(new Member(1003, "박서혼"));
		memberHashMap.addMember(new Member(1004, "홍길이"));
		memberHashMap.showAllMember();
		
		System.out.println();
		
		memberHashMap.addMember(new Member(1004,"길동이"));
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
