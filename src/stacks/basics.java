package stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(21);
        st.push(31);
        //peek
        System.out.println(st.peek());
        st.push(65);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size: " + st.size());
        //pop
        st.pop();
        System.out.println(st);


    }


}
