package queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq=new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(22);
		mq.enqueue(52);
		
		System.out.println(mq.dequeue());
		
//		Queue<Integer> q=new LinkedList<>();
//		
//		q.add(12);
//		q.add(23);
//		q.add(45);
//		
//		System.out.println(q);
//		
//		System.out.println(q.poll());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());
	}

}
