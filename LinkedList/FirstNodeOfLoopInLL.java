package LinkedList;

public class FirstNodeOfLoopInLL {
    static Node firstNode(Node head){
        Node slow=head;
        Node fast = head;
        Node b = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) return fast;
        }
        return slow;
    }
}
