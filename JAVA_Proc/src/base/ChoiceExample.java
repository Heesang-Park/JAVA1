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
		region.add("지역선택");
		region.add("서울");
		region.add("경기");
		region.add("인천");
		region.add("광주");
		region.add("대구");
		region.add("대전");
		region.add("부산");
		
		region.setSize(150,0);
		region.setLocation(50,100);
		
		region.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(region.getSelectedItem());
				
			}
		});
		// 익명의 클래스 대신에 새로운 클래스를 통해 이벤트 사용가능!
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
