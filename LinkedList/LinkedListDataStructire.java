package LinkedList;


class Linkedlist{
    Node head;
    Node tail;
    int size;
    void dis(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtIdx(int idx,int val){
        if(idx>size || idx<0) {
            System.out.println("Error");
            return;
        }
        if(idx==0) insertAtHead(val);
        else if(idx==size) insertAtTail(val);
        else{
            Node t = new Node(val);
            Node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
//        System.out.println(temp.val);
    }
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null){
            head = tail = temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    }
    void deleteAtIdx(int idx){
        if(idx<0 || idx>=size){System.out.println("Invalid index");return;}
        if(idx==0){ deleteAtHead(); return;}

        Node temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }
    void get(int idx){
        Node temp = head;
        for(int i =1;i<=idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val) return  idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

}

public class LinkedListDataStructire {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

//        ll.deleteAtHead();
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.insertAtTail(40);
//        ll.dis();


        ll.insertAtHead(50);
        ll.insertAtHead(60);
        ll.dis();
//        ll.get(2);
        ll.deleteAtHead();
        ll.dis();
//        System.out.println(ll.size);
//        ll.get(2);
//        System.out.println(ll.search(40));

        ll.insertAtIdx(2,60);
        ll.dis();

        ll.deleteAtIdx(2);
        ll.dis();
    }
}
