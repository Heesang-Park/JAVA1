package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberid;  // ȸ�� ���̵�
	private String membername; // ȸ�� �̸�
	private Member() {} // ����Ʈ ������(Comparator<Member>)
	
	public Member(int memberid, String membername) { // ������
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
		if(obj instanceof Member) { // ��ü���� Ȯ��
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
		return membername+"���� ���̵�� : "+memberid+"�Դϴ�";
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberid - member2.memberid); // ��������
	}
	
	
	
	
	
}
