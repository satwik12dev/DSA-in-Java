package LinkedList;

public class RemoveDuplicates2fromSortedListInLL {
    //leet code
    static Node remove(Node head){
        Node d = new Node(-1);
        Node t = d;
        Node i = head;

        while(i!=null){
            if(i.next==null || i.val!=i.next.val){
                t.next=i;
                t=i;
                i=i.next;
            }else {
                Node j =i.next;
                while(j!=null && j.val==i.val){
                    j = j.next;
                }
                i=j;
            }
        }
        t.next=i;
        return d.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(2);
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
        d.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;

        new DisplatList().dis(a);
//        Node result = remove(a);
        new DisplatList().dis(remove(a));
    }
}
