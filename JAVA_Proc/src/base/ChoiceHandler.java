package base;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		// str안에 Item내용 저장
		String str=(String)e.getItem(); // getItem이 String보다 상위 클래스이므로 다운캐스팅
		System.out.println("지역: "+str);
		
		
		
	}

}
