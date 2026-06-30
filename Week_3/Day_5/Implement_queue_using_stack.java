import java.util.Stack;

public class Implement_queue_using_stack {
    public static void main(String[] args) {

        String[] operations = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[][] values = {{}, {1}, {2}, {}, {}, {}};

        MyQueue obj = null;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyQueue":
                    obj = new MyQueue();
                    System.out.print("null ");
                    break;

                case "push":
                    obj.push(values[i][0]);
                    System.out.print("null ");
                    break;

                case "peek":
                    System.out.print(obj.peek() + " ");
                    break;

                case "pop":
                    System.out.print(obj.pop() + " ");
                    break;

                case "empty":
                    System.out.print(obj.empty() + " ");
                    break;
            }
        }
    }
}

class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }  
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */