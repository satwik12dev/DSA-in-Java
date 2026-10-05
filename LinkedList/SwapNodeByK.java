package LinkedList;

public class SwapNodeByK {

    static void swap(int k, Node head) {

        Node first = head;
        Node slow = head;
        Node fast = head;

        // Find kth node from beginning
        for (int i = 1; i < k; i++) {
            if (first == null) return;
            first = first.next;
        }

        // Move fast k nodes ahead
        for (int i = 1; i <= k; i++) {
            if (fast == null) return;
            fast = fast.next;
        }

        // Find kth node from end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Swap values
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        // Display
        DisplatList dl = new DisplatList();
        dl.dis(head);
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        swap(3, a);
    }
}