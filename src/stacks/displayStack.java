package stacks;

import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack<Integer>st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        displayRec(st);



//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n-1; i>=0; i--) {
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i <n; i++) {
//            System.out.print(arr[i] +" ");
//            st.push(arr[i]);
//        }
    }
}
