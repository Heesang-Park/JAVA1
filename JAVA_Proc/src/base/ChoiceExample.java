package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample {

	public static void main(String[] args) {
		Frame f=new Frame("Question");
		
		f.setSize(500,250);
		f.setLocation(400,200);	
		
		f.setLayout(null);
		Choice region=new Choice();
		region.add("��������");
		region.add("����");
		region.add("���");
		region.add("��õ");
		region.add("����");
		region.add("�뱸");
		region.add("����");
		region.add("�λ�");
		
		region.setSize(150,0);
		region.setLocation(50,100);
		
		region.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(region.getSelectedItem());
				
			}
		});
		// �͸��� Ŭ���� ��ſ� ���ο� Ŭ������ ���� �̺�Ʈ ��밡��!
		region.addItemListener(new ChoiceHandler());
		f.add(region);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}

}
