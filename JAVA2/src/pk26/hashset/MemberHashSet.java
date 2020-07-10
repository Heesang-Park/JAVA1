package pk26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk26.Member;

public class MemberHashSet {
	// HashSet 타입의 필드 생성(인스턴스화 됨)
	private HashSet<Member> hashSet; // 인스턴스변수 heap메모리에 들어간다
	
	//생성자 overriding을 통해서 HashSet의 객체생성
	public MemberHashSet() {
		hashSet=new HashSet<Member>();
	}
	// hashSet에 객체 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//HashSet에선  get를 제공하지 않으므로 순회하는 Iterator를 통하여 값을 비교 판단해야함
	public boolean removeMember(int memberid) {
	Iterator<Member> ir= hashSet.iterator(); //get(i)을 제공하지 않음
	while(ir.hasNext()) {// hasNext: 다음 객체 존재를 판단하여 진행하는 메소드 
		Member member= ir.next();
		int tempId= member.getMemberid();
		if(tempId == memberid) {// 멤버아이디가 매개변수와 일치하면
			hashSet.remove(member);// 해당 멤버를 삭제
			return true;// true 반환
		}
	}// while off
	System.out.println(memberid+"아이디가 존재하지 않습니다.");
	return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
