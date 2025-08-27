package Stack_Queue;

import sun.misc.Queue;

import java.util.Stack;

public class stackk_queue {
    public static void main(String[] args) throws InterruptedException {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }


        System.out.println(validBracket());

    }

    private static boolean validBracket() {
        String s = "()[]{}";
        Stack<Character> st = new Stack<>();
        for(char val : s.toCharArray()){
            if(val == '(' || val == '{' || val == '[') st.push(val);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((val == ')' && ch == '(') || (val == '}' && ch == '{') || (val == ']' && ch == ']')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}
