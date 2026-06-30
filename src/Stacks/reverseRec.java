package stacks;

import java.util.Stack;

public class reverseRec {
    public static void pushAtBottom(Stack<Integer> st,int top){
        if(st.size()==0) {
            st.push(top);
            return;
        }
        int curr = st.pop();
        pushAtBottom(st,top);
        st.push(curr);

    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverse(st);
        System.out.println(st);
    }
}
