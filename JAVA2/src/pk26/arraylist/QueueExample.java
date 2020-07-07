package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		// Queue���� ������ ���� offer
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�Ӳ���"));
		messageQueue.offer(new Message("sendKAKAO","ȫ�α�"));
		
		//empty: �񵿱�ȭ�� �����ϸ鼭 ����ִ� ���� 0���� True�� ��ȯ
		//isEmpty: ����ȭ�� �����Ͽ� null�� ����
		//(�� ��ü�� �� �����Ƿ� ��������� null������ �ʱ�ȭ ��)
		while(!messageQueue.isEmpty()) {
			// Queue���� ���� ���� poll
			Message message=messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+"���� ������ �����ϴ�.");
				break;
				
			case "sendSMS":
				System.out.println(message.to+"���� SMS�� �����ϴ�.");
				break;
				
			case "sendKAKAO":
				System.out.println(message.to+"���� ī���� �����ϴ�.");
				break;

			default:
				break;
			}
		}
			
	}

}
