package base;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		// str�ȿ� Item���� ����
		String str=(String)e.getItem(); // getItem�� String���� ���� Ŭ�����̹Ƿ� �ٿ�ĳ����
		System.out.println("����: "+str);
		
		
		
	}

}
