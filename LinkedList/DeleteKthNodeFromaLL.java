package LinkedList;

public class DeleteKthNodeFromaLL {

    static void delete(Node head, int k){
        Node temp=head;
        int size =0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if (k == size) {
            temp = temp.next;
            return;
        }
        temp=head;
        int diff = size-k-1;
        if(diff<0){
            System.out.println("Invalid index");
            return;
        }
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }

        DisplatList dl = new DisplatList();
        dl.dis(head);

        temp.next = temp.next.next;

        dl.dis(head);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
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

        delete(a,7);

    }

}
