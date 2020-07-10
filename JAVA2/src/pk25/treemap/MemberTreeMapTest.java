package pk25.treemap;

import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		memberTreeMap.addMember(new Member(1011, "ÀÌ±æµ¿"));
		memberTreeMap.addMember(new Member(1012, "´ë¹Î±¹"));
		memberTreeMap.addMember(new Member(1013, "±èµ¿±¸"));
		memberTreeMap.addMember(new Member(1014, "¹ÚÃ¶¼ö"));
		memberTreeMap.showAllMember();
		System.out.println();
		
		
		memberTreeMap.addMember(new Member(1011, "°­±æµ¿"));
		memberTreeMap.removeMember(1011);
		memberTreeMap.showAllMember();
		
	}

}
