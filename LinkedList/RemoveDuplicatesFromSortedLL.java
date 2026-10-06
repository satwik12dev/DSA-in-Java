package LinkedList;

public class RemoveDuplicatesFromSortedLL {
    static Node removeDuplicates(Node head){
        Node i = head;
        Node j = head;

        while(j!=null){
            if(i.val==j.val) {
                j = j.next;
            }
            else{
                i.next = j;
                i=j;
            }
        }
        i.next=j;
        return i;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(4);
        Node i = new Node(5);
        Node j = new Node(5);
        Node k = new Node(5);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;

        new DisplatList().dis(a);

        System.out.println(removeDuplicates(a));
        new DisplatList().dis(a);
    }
}
