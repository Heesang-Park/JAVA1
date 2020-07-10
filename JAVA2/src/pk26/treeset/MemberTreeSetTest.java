package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1005, "±èÃ¶¼ö"));
		memberTreeSet.addMember(new Member(1006, "ÀÌ¼öÃ¶"));
		memberTreeSet.addMember(new Member(1007, "È«±æµ¿"));
		memberTreeSet.addMember(new Member(1008, "¹Úµ¿µ¿"));
		memberTreeSet.showAllMember();
		
		System.out.println();
		
		memberTreeSet.addMember(new Member(1007, "µ¿±æÈ«"));
		memberTreeSet.showAllMember();
		
		
		
	}
	
}
