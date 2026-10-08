package LinkedList;

public class SortLinkedList {

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
    static Node mergeSort(Node head){
        if(head.next==null) return head;
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node head2 = slow.next;
        slow.next=null;

        head= mergeSort(head);
        head2= mergeSort(head2);

        return merge(head, head2);

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(1);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        new DisplatList().dis(a);
        Node res = mergeSort(a);
        new DisplatList().dis(res);
    }
}
