package base;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		
		Frame f=new Frame("버튼 테스트");
		f.setBounds(200,200,400,400);
		
		f.setLayout(null);// 자동배치를 끈다.
		// 그 순간 frame에 추가되는 각각의 컴포넌트는 고유의 size()와 location()을 갖고 있어야 한다.
		Button btnOk=new Button("확인");
		btnOk.setBounds(70,90,100,50);
		
		Button btnClose=new Button("닫기");
		btnClose.setBounds(btnOk.getBounds());
		
		btnClose.setLocation(btnOk.getWidth()+btnOk.getX()+60, btnOk.getY());
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		
	}

}
