package LinkedList;

public class  PartitionListGFG {
    static Node partition(Node head, int k){
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-5);
        Node dummy3 = new Node(-6);
        Node t1 = dummy1; // smaller
        Node t2 = dummy2; // larger
        Node t3 = dummy3; // equal to
        Node temp = head;


        while (temp!=null){
            if(temp.val<k){
                t1.next=temp;
                t1 = t1.next;
            }
            else if(temp.val==k){
                t3.next=temp;
                t3=t3.next;
            }else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp=temp.next;
        }
        t1.next=dummy3.next;
        t3.next=dummy2.next;
        t2.next=null;

        return dummy1.next;

    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(1);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        new DisplatList().dis(a);
        Node res = partition(a,3);
        new DisplatList().dis(res);

    }

}
