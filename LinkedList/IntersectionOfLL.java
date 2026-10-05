package LinkedList;

public class IntersectionOfLL {
    static Node getList(Node h1, Node h2){
        Node temp1 = h1;
        Node temp2 = h2;

        int len1=0;
        int len2=0;

        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }

        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }

        temp1=h1;
        temp2=h2;

        if(len1>len2){
            for (int i = 1; i <= (len1-len2) ; i++) {
                temp1=temp1.next;
            }
        }
        else{
            for (int i = 1; i <= (len2-len1) ; i++) {
                temp2=temp2.next;
            }
        }

        while (temp1 != temp2) {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println(temp1.val);
        return temp1;


    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=e;
        d.next=e;
        e.next=f;

        System.out.println(getList(a,d));

    }
}
