package linkedlist;



public class GenericLinkedList<E> {

	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd=new Node<E>(data);
		if(head==null) {
			head=toAdd;
			return;
		}
		
		Node<E> temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;	
	}
	
	public E getLast() throws Exception {
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("Cannot Peek Stack is Empty bruhhh");
		}
		
		while(temp.next !=null) {
			temp=temp.next;
		}
		
		return  temp.data;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public E removeLast() throws Exception {
		
		
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("Stack is Empty bruhhh");
		}
		if(temp.next==null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return  toRemove.data;
	}

	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
		
	}
	
	

}
