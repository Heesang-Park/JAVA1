package base;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtoneTest2 {

	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setBounds(800, 100, 1000, 500);
		f.setLayout(new FlowLayout());
		
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		
		// FlowLayout������ ��ư ũ�� ������ btn1.setSize(200,100)�δ� �ȵ�
		// btn1.setPreferredSize���� ���氡��
		// DimensionŬ������ ��ü�� �����Ͽ� �ʺ�� ���̸� ����

		btn1.setPreferredSize(new Dimension(200,100));
		btn2.setPreferredSize(new Dimension(200,100));
		btn3.setPreferredSize(new Dimension(200,100));
		btn4.setPreferredSize(new Dimension(200,100));
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		
		// Button�� ������ comand�� ���� �� �� �ְ�
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		//�����̺�Ʈ 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		static ActionListener al=new ActionListener() {
			// �͸��� Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ư�� �����Ǿ� �ִ� ������ ����
				System.out.println(e.getActionCommand());
				
				if(e.getActionCommand().equals("1")) {
					System.out.println("1�� ������");
				}
				else if(e.getActionCommand().equals("2")) {
					System.out.println("2�� ������");
				}
				else if(e.getActionCommand().equals("3")) {
					System.out.println("3�� ������");
				}
				else if(e.getActionCommand().equals("4")) {
					System.out.println("4�� ������");
				}
				System.out.println("---------------------------");
			}
		};
		
		
		
	}

