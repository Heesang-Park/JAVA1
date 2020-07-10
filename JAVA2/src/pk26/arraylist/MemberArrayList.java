package pk26.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;
public class MemberArrayList {
	
	private ArrayList<Member> arrayList; // ArrayList ����

	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();// ����� ������ ArrayList�� �ν��Ͻ�ȭ ��
	}
	
	public void addMember(Member member) {// ArrayList�� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberid) {// ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		for(int i=0;i<arrayList.size();i++) {// �ش� ���̵� ���� ����� ArraList���� ã��
			Member member=arrayList.get(i);
			int tempId=member.getMemberid();
			if(tempId==memberid) {			// ������̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);		// �ش� ����� ����
				return true;				// true ��ȯ
			}
		}
		// Iterator ��� get �޼ҵ尡 ��� hasNext(), next()���
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
		Member member=ir.next();
		int tempId= member.getMemberid();
		if(tempId==memberid) {
			arrayList.remove(member);
			return true;
		}
		}
		
		System.out.println(memberid+"�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllMember() {
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
		System.out.println(arrayList);
	}
	

	
}
