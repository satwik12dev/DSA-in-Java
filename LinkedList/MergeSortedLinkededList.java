package LinkedList;

public class MergeSortedLinkededList {
    static Node merge(Node head1, Node head2){
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;

        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null) k.next=j;
        else k.next=i;

        return dummy.next;

    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node a1 = new Node(15);
        Node b1 = new Node(25);
        Node c1 = new Node(35);
        Node d1 = new Node(45);
        Node e1 = new Node(55);
        Node f1 = new Node(65);
        //connect karege link karege
        a1.next=b1;
        b1.next=c1;
        c1.next=d1;
        d1.next=e1;
        e1.next=f1;
        new DisplatList().dis(a);
        new DisplatList().dis(a1);
        Node res=merge(a,a1);
        new DisplatList().dis(res);
    }

}
