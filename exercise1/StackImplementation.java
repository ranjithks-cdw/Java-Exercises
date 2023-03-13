package exercise1;


/**
 * 
 * Program to implement fixed and static Stack
 */
public class StackImplementation {

	public static void main(String[] args) {
		FixedStack fixedStackObj = new FixedStack(5);
		System.out.println("Stack with fixed size of 5 \nPushing Items");
		for(int i=0;i<6;i++)
			fixedStackObj.push(i);
		System.out.println("Popping Items");
		for(int i=0;i<6;i++)
			System.out.print(fixedStackObj.pop()+" ");
		System.out.println();
		
		DynamicStack dynamicStackObj = new DynamicStack();
		System.out.println("Stack with dynamic size \nPushing Items");
		for(int i=1;i<16;i++)
			dynamicStackObj.push(i);
		System.out.println("Popping Items");
		for(int i=0;i<16;i++)
			System.out.print(dynamicStackObj.pop()+" ");
	}

}

// Stack Interface
interface Stack {
	public void push(int item);
	public int pop();
}

// Fixed Stack
class FixedStack implements Stack {
	int[] stack;
	int top;
	
	//	Initialize Stack
	public FixedStack(int size) {
		this.stack = new int[size];
		this.top = -1;
	}
	
	//	Check if stack is full
	private boolean isFull() {
		return this.top==this.stack.length-1;
	}
	
	//	Check if stack is empty
	private boolean isEmpty() {
		return top==-1;
	}
	
	//	Push item to stack
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is full. Cannot push items.");
			return;
		}
		this.stack[++this.top] = item;
		System.out.println("Pushed successfully");
	}
	
	//	Pop item from stack
	public int pop() {
		if(isEmpty()) {
			System.out.println("\nStack is empty. Cannot pop items.");
			return -1;
		}
		return this.stack[this.top--];
	}
}

// Dynamic Stack
class DynamicStack implements Stack {
	int[] stack;
	int top;
	
	//	Initialize Stack
	public DynamicStack() {
		this.stack = new int[10];
		this.top = -1;
	}
	
	//	Check if stack is full
	private boolean isFull() {
		return this.top==this.stack.length-1;
	}
	
	//	Check if stack is empty
	private boolean isEmpty() {
		return top==-1;
	}
	
	//	Push item to stack
	public void push(int item) {
		if(isFull()) {
			int[] temp = new int[this.stack.length*2];
			for(int i=0;i<this.stack.length;i++)
				temp[i] = this.stack[i];
			this.stack = temp;
		}
		this.stack[++this.top] = item;
		System.out.println("Pushed successfully");
	}
	
	//	Pop item from stack
	public int pop() {
		if(isEmpty()) {
			System.out.println("\nStack is empty. Cannot pop items.");
			int[] temp = new int[10];
			this.stack = temp;
			return -1;
		}
		return this.stack[this.top--];
	}
}