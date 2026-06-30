package Linked_list;

class Node  {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class ListNodeClass {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(23);
        Node c = new Node(34);
        Node d = new Node(55);

        a.next = b;
        b.next = c;
        c.next = d;

        print(a);
    }


}
