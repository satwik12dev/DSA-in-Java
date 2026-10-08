package LinkedList;

import java.util.ArrayList;

public class ReverseLinkedList {
    static Node reverse1(Node head){
        ArrayList<Node> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n = arr.size();
        for (int i = n-1; i >= 1 ; i--) {
            Node t1 = arr.get(i);
            Node t2 = arr.get(i-1);
            t1.next=t2;
        }

        arr.get(0).next = null;
        return arr.get(n-1);
    }

    //iterative
    static Node reverse2(Node head){
        Node curr = head;
        Node forw = null;
        Node prev = null;

        while (curr!=null){
            forw= curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }

    //recursive
    static Node reverse3(Node head){
        if(head==null || head.next==null) return head;
        Node a = head.next;
        head.next=null;
        Node b = reverse3(a);
        a.next=head;
        return b;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2 );
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        new DisplatList().dis(a);
        Node res = reverse3(a);
        new DisplatList().dis(res);
    }
}
