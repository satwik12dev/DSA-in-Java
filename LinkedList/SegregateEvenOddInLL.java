package LinkedList;

public class SegregateEvenOddInLL {

    //gfg
    static Node evenOdd(Node head){
        if(head==null && head.next==null) return head;
        Node dummy1=new Node(-1);
        Node dummy2 = new Node(-1);

        Node even = dummy1;
        Node odd = dummy2;

        Node temp = head;

        while(temp!=null){
            if(temp.val%2==0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = temp.next;
        }

        even.next = dummy2.next;
        odd.next=null;

        return dummy1.next;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(21);
        Node c = new Node(33);
        Node d = new Node(40);
        Node e = new Node(56);
        Node f = new Node(1);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        new DisplatList().dis(a);
        Node res= evenOdd(a);
        new DisplatList().dis(res);
    }

}
