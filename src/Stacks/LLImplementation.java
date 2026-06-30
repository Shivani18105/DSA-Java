package Stacks;

public class LLImplementation {

    // User-defined Node
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // User-defined Stack
    public static class LLStack {
        private Node head = null;
        private int size = 0;

        // Push
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // Pop
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        // Peek
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.val;
        }

        // Display
        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Size
        int size() {
            return size;
        }

        // isEmpty
        boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {

        LLStack st = new LLStack();

        st.push(4);
        st.push(5);
        st.push(3);
        st.push(1);

        System.out.print("Stack: ");
        st.display();

        System.out.println("Top: " + st.peek());

        System.out.println("Size: " + st.size());

        System.out.println("Popped: " + st.pop());

        System.out.print("After Pop: ");
        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());
    }
}