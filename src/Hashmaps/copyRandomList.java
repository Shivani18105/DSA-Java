package Hashmaps;

import java.util.HashMap;

public class copyRandomList {

    public static void main(String[] args) {

        // Create nodes
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // Next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        CopyRandomListSolution obj = new CopyRandomListSolution();

        Node copyHead = obj.copyRandomList(n1);

        printList(copyHead);
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print("Value: " + temp.val);

            if (temp.random != null)
                System.out.print(" Random: " + temp.random.val);
            else
                System.out.print(" Random: null");

            System.out.println();

            temp = temp.next;
        }
    }
}

class Node {

    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyRandomListSolution  {

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        Node head2 = new Node(head.val);

        Node temp2 = head2;
        Node temp = head.next;

        // Create duplicate list
        while (temp != null) {
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = dup;
            temp = temp.next;
        }

        // Store Original -> Copy mapping
        HashMap<Node, Node> map = new HashMap<>();

        temp = head;
        temp2 = head2;

        while (temp != null) {
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }

        // Assign random pointers
        for (Node ori : map.keySet()) {
            Node duplicate = map.get(ori);

            if (ori.random != null)
                duplicate.random = map.get(ori.random);
        }

        return head2;
    }
}