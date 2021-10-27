package vectorsAndStacks;

//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector();
//		
//		v.add(34);
//		v.add(4);
//		v.add(43);
//		
//		System.out.println(v);
		
//		Stack
		
		MyStack<Integer> stack= new MyStack<Integer>();
		
//		stack.push(12);
//		stack.push(2);
//		stack.push(135);
		int popped =stack.pop();
		
		System.out.println(popped);
//		popped =stack.pop();
		System.out.println(stack.peek());
		
//		System.out.println(popped);
//		popped =stack.pop();
//		
//		System.out.println(popped);
//		System.out.println(stack.peek());
		

	}

}
