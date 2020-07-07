package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		// Queue에서 저장할 때는 offer
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","임꺽정"));
		messageQueue.offer(new Message("sendKAKAO","홍두깨"));
		
		//empty: 비동기화를 제공하면서 비어있는 공간 0으로 True값 반환
		//isEmpty: 동기화를 제공하여 null값 인지
		//(즉 객체가 들어가 있으므로 비어있으면 null값으로 초기화 됨)
		while(!messageQueue.isEmpty()) {
			// Queue에서 꺼낼 떄는 poll
			Message message=messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+"에게 메일을 보냅니다.");
				break;
				
			case "sendSMS":
				System.out.println(message.to+"에게 SMS을 보냅니다.");
				break;
				
			case "sendKAKAO":
				System.out.println(message.to+"에게 카톡을 보냅니다.");
				break;

			default:
				break;
			}
		}
			
	}

}
