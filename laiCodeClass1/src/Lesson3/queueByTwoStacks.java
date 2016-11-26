package Lesson3;

import java.util.Stack;

public class queueByTwoStacks {

	
	//implement a queue by using two stacks. The queue should provide size(), isEmpty()
	//offer() poll() and peek() operations, when the queue is empty. poll() and peek()
	//should return null
	private Stack<Integer> input = new Stack();
	private Stack<Integer> output = new Stack();
	public static void Solution(){

	}
	
	public Integer poll(){
		if(output.isEmpty()) return null;
		peek();
		return output.pop();
	}
	
	public void offer(int element){
		input.push(element);
	}
	
	public Integer peek(){
		if(output.isEmpty())
			while(!input.empty()){
				output.push(input.pop());
			}
		return output.peek();
	}
	
	public int size(){
		return output.size();
	}
	
	public boolean isEmpty(){
		return input.isEmpty() && output.isEmpty();
	}
}
