package Linked_list;

class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;

    }
    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx == size || idx<0){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<=idx-1; i++){
            x = x.next;
        }
        //insertion
        temp.next = x.next;
        x.next = temp;
        size++;

    }
    int get(int idx){
        if(idx>=size || idx<0){
            System.out.println("Invalid Index!!");
            return -1;
        }
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void deleteAtHead(){
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        if(temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
}

public class implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(45);
        list.insertAtEnd(34);
        list.insertAtEnd(60);

        list.insertAtHead(1);
        list.insertAtHead(5);
        list.insertAtHead(9);

        list.insert(2,100);

        list.display();
        System.out.println();
        list.delete(4);
        list.display();

//        System.out.println();
//        System.out.println("At given Position: "+list.get(4));


    }

}
