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
		
		//이미지 가져놓을 때 프로젝트에 놓기
		ImageIcon img =new ImageIcon("강아지1.jpg");
		
		JLabel j1=new JLabel(img);// JLabel에만 ImageIcon을 추가할 수 있다.
		j1.setBounds(100,100,252,378); // 원본이미지의 width, height을 알아야 함
		
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
