package LinkedList;

public class DeleteMiddle {
    static Node deleteMid(Node head){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for (int i = 1; i <= size/2-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }

    public static void main(String[] args) {
        DisplatList dl = new DisplatList();

        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        dl.dis(a);
        System.out.println(deleteMid(a));
        dl.dis(a);
    }
}
