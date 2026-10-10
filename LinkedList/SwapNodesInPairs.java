package LinkedList;

import java.util.LinkedList;

public class SwapNodesInPairs {

    static Node swap(Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swap the pair
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to the next pair
            prev = first;
        }

        return dummy.next;
    }

     static Node swap2(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node d1 = new Node(-1);
            Node d2 = new Node(-1);

            Node t1 = d1;
            Node t2 = d2;
            Node temp = head;
            int i = 0;

            while (temp != null) {
                Node nextNode = temp.next;
                temp.next = null;

                if (i % 2 == 0) {
                    t1.next = temp;
                    t1 = t1.next;
                } else {
                    t2.next = temp;
                    t2 = t2.next;
                }

                temp = nextNode;
                i++;
            }

            Node even = d1.next;
            Node odd = d2.next;

            Node dummy = new Node(-1);
            Node tail = dummy;

            while (even != null && odd != null) {
                Node nextEven = even.next;
                Node nextOdd = odd.next;

                tail.next = odd;
                odd.next = even;

                tail = even;
                even = nextEven;
                odd = nextOdd;
            }

            tail.next = even;

            return dummy.next;
        }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        new DisplatList().dis(a);
//        new DisplatList().dis(swap(a));
        new DisplatList().dis(swap2(a));

    }
}