package stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void pushRecurr(Stack<Integer> st){
        if(st.size()==0) {
            st.push(6);
            return;
        }
        int top = st.pop();
        pushRecurr(st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        pushRecurr(st);
        System.out.println(st);
    }

}
