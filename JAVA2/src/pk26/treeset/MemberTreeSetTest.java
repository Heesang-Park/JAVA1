package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1005, "��ö��"));
		memberTreeSet.addMember(new Member(1006, "�̼�ö"));
		memberTreeSet.addMember(new Member(1007, "ȫ�浿"));
		memberTreeSet.addMember(new Member(1008, "�ڵ���"));
		memberTreeSet.showAllMember();
		
		System.out.println();
		
		memberTreeSet.addMember(new Member(1007, "����ȫ"));
		memberTreeSet.showAllMember();
		
		
		
	}
	
}
