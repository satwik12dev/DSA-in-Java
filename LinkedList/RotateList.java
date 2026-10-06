package LinkedList;

public class RotateList {
    static int len(Node head){

        int len =0;

        Node temp = head;

        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    static Node rotate(Node head, int k){
        if(head==null || head.next==null) return null;
        Node slow = head;
        Node fast = head;
        int size=len(head);
        k%=size;
        if(k==0) return head;

        for (int i = 1; i <=k+1 ; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node a = slow.next;
        slow.next=null;

        Node temp =a;
        while (temp.next!=null){
            temp = temp.next;
        }

        temp.next=head;

        return a;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        //connect karege link karege
        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;

        new DisplatList().dis(a);

        new DisplatList().dis(rotate(a,7));
    }
}
