package LinkedList;

public class MiddleofLL {
    //Two pass
    static int getMiddle(Node head){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for (int i = 1; i <= size/2; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    //One Pass
    static int getMiddle2(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
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

        System.out.println(getMiddle2(a));
    }
}
