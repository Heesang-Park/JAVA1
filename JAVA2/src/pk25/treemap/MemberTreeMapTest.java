package pk25.treemap;

import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		memberTreeMap.addMember(new Member(1011, "�̱浿"));
		memberTreeMap.addMember(new Member(1012, "��α�"));
		memberTreeMap.addMember(new Member(1013, "�赿��"));
		memberTreeMap.addMember(new Member(1014, "��ö��"));
		memberTreeMap.showAllMember();
		System.out.println();
		
		
		memberTreeMap.addMember(new Member(1011, "���浿"));
		memberTreeMap.removeMember(1011);
		memberTreeMap.showAllMember();
		
	}

}
