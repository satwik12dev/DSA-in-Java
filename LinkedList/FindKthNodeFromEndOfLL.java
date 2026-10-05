package LinkedList;

public class FindKthNodeFromEndOfLL {

    static int KthEndEle(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i =1;i<=k;i++){
            if(fast==null) return -1;
            fast=fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
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

        System.out.println(KthEndEle(a,4));
    }

}
