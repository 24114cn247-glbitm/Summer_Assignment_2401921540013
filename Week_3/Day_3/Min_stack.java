import java.util.*;
public class Min_stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin()); // -3

        minStack.pop();

        System.out.println(minStack.top());    // 0
        System.out.println(minStack.getMin()); // -2
    }
}

class MinStack {

    Stack<Integer> st;
    Stack<Integer> s2;

    public MinStack() {
        st = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int val) {
        if (s2.isEmpty() || val <= s2.peek()) {
            s2.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (st.peek().equals(s2.peek())) {
            s2.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return s2.peek();
    }

}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


