package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTestTotal2 {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setBounds(800,100,250,400);
		frame.setBackground(Color.cyan);
		
		//폰트
		Font font=new Font(Font.SANS_SERIF,Font.PLAIN,18);
		
		//북쪽단: 컴포넌트를 하나로 묶는다
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.green);
		
		TextField tf=new TextField(10);
		Button btn=new Button("입력");
		btn.setEnabled(false); // 버튼 죽임
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//중앙
		TextArea ta=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//남쪽단
		Panel pSouth=new Panel();
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave=new Button("저장");
		Button btnClose=new Button("닫기");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta,BorderLayout.CENTER);
		frame.add(pSouth,BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setResizable(false);
		
		//TextField에 값이 들어간 경우에만 입력버튼 활성화
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		// 중앙에 텍스트값을 전달(Enter키)
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TextField에 입력한 값을 TextArea에 내용 추가(Enter키)
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					tf.setText(""); //입력 후 다시 공백으로 초기화
					tf.requestFocus();// 그렇게 맞춰주라
				}
			}
		});
		// 중앙에 텍스트 값을 전달(입력 버튼)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				//텍스트 박스 초기화
				tf.setText("");
				//포거스 이동
				tf.requestFocus();
			}
		});
		// 닫기 버튼
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}
		});
		
		// 저장하기!!
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message=ta.getText();
				
				try {
				//FileDialog: save와 load할 때 필요한 대화상자	
				FileDialog fd=new FileDialog(frame,"저장",FileDialog.SAVE);
				fd.setVisible(true);
				// 저장 경로 만들기 
				String path=fd.getDirectory()+fd.getFile();
				
				if(!message.equals("")) {
					
				// path경로에 텍스트 저장
				FileWriter fw=new FileWriter(path);
				BufferedWriter bw=new BufferedWriter(fw);
				
				bw.write(message);
				
					if(fd.getFile()!=null) {// File이 null값이 아닐 때
						JOptionPane.showMessageDialog(frame, path+"\n경로에 저장되었습니다.");
						bw.close();
					}
				}
				else {// null값일 때
					JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다.");
				}
				
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}
			
		});
		
		
		
	}

}
