package pk26.hashset;

import pk26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet();
		
		Member memberLee=new Member(1001,"������");
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1003,"�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		System.out.println();
		// ��ü�߰�(�ߺ����̵�) equals�� hashcode�� ������ �� �� 
		Member memberHong=new Member(1003,"ȫ�浿");// 1003���̵� �ߺ�
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
			
		
	}
}/*HashSet�� ���� ���Ǵ��Ͽ� �Է��ϴµ� equals�� hashcode�� ������ ������ ������ �������� �ߺ� ���θ�
�Ǵ��� �� ���⿡ �ߺ��� ����Ѵ�*/
// String �Ǵ� Integer���� �̹� JDK���� ������ �Ǿ��� JVM(�����Ͻ� �۵�)���� �����ϹǷ� �ߺ��� �����
// ������ comparable�� ���Ͽ� ������ ����� �Ѵ�. (String �Ǵ� Integer���� �̹� �Ǿ�����) 
