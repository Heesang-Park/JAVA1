package base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {

		Frame f=new Frame();
		f.setLayout(null);
		
		f.setBounds(500, 100, 500, 500);
		
		//�̹��� �������� �� ������Ʈ�� ����
		ImageIcon img =new ImageIcon("������1.jpg");
		
		JLabel j1=new JLabel(img);// JLabel���� ImageIcon�� �߰��� �� �ִ�.
		j1.setBounds(100,100,252,378); // �����̹����� width, height�� �˾ƾ� ��
		
		f.add(j1);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		

	}

}
