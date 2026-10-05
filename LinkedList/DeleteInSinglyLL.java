package LinkedList;

public class DeleteInSinglyLL {
    public static void deleteNode( Node target){
        target.val = target.next.val;
        target.next = target.next.next;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        DisplatList dl = new DisplatList();
        dl.dis(a);

        deleteNode(c);

        dl.dis(a);

    }
}
