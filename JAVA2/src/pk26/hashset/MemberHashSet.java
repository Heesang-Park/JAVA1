package pk26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk26.Member;

public class MemberHashSet {
	// HashSet Ÿ���� �ʵ� ����(�ν��Ͻ�ȭ ��)
	private HashSet<Member> hashSet; // �ν��Ͻ����� heap�޸𸮿� ����
	
	//������ overriding�� ���ؼ� HashSet�� ��ü����
	public MemberHashSet() {
		hashSet=new HashSet<Member>();
	}
	// hashSet�� ��ü �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//HashSet����  get�� �������� �����Ƿ� ��ȸ�ϴ� Iterator�� ���Ͽ� ���� �� �Ǵ��ؾ���
	public boolean removeMember(int memberid) {
	Iterator<Member> ir= hashSet.iterator(); //get(i)�� �������� ����
	while(ir.hasNext()) {// hasNext: ���� ��ü ���縦 �Ǵ��Ͽ� �����ϴ� �޼ҵ� 
		Member member= ir.next();
		int tempId= member.getMemberid();
		if(tempId == memberid) {// ������̵� �Ű������� ��ġ�ϸ�
			hashSet.remove(member);// �ش� ����� ����
			return true;// true ��ȯ
		}
	}// while off
	System.out.println(memberid+"���̵� �������� �ʽ��ϴ�.");
	return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
