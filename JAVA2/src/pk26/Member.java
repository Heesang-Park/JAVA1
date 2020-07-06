package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberid;  // 회원 아이디
	private String membername; // 회원 이름
	private Member() {} // 디폴트 생성자(Comparator<Member>)
	
	public Member(int memberid, String membername) { // 생성자
		this.memberid=memberid;
		this.membername=membername;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	@Override
	public int hashCode() {
		
		return memberid;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 객체여부 확인
			Member member=(Member)obj; // Down casting
			if(this.memberid==member.memberid) {
				return true;
			}else 
				return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return membername+"님의 아이디는 : "+memberid+"입니다";
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberid - member2.memberid); // 오름차순
	}
	
	
	
	
	
}
