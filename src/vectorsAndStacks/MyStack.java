package vectorsAndStacks;

import linkedlist.GenericLinkedList;
//import linkedlist.MyLinkedList;

//push()  pop()  peek()


public class MyStack<E> {
	
	private GenericLinkedList<E> ll= new GenericLinkedList<>();
	
	void push(E e){
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Empty Stack"); 
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception{
		return ll.getLast();
	}

}
