package pk26;

import java.util.Comparator;
//Comparable<Member>
//Comparator<Member>
public class Member implements Comparable<Member>{
	
	private int memberid;  // ȸ�� ���̵�
	private String membername; // ȸ�� �̸�
	//private Member() {} // ����Ʈ ������(Comparator<Member>) ����ȭ ��
	
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
	public String toString() {
		return membername+"���� ���̵�� : "+memberid+"�Դϴ�";
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
	public int compareTo(Member member ) {
		
		return (this.memberid - member.memberid); // ��������
		//return (this.memberid - member.memberid)* (-1);// ��������
		//return (this.membername.compareTo(member.membername));// �̸� �������� 
		//return (this.membername.compareTo(member.membername))*(-1);// �̸� ��������
	}
	
//	@Override
//	public int compare(Member member1, Member member2) {
//		// TODO Auto-generated method stub
//		return (member1.memberid-member2.memberid);
//	}

	
	
	
	
	
}
