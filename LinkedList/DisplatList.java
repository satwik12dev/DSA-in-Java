package LinkedList;

public class DisplatList {
    public  static void disrecursive(Node head){
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.val+" ");
        disrecursive(temp.next);
    }
    public static void dis(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public  static void Revdisrecursive(Node head){
        Node temp = head;
        if(temp==null) return;
        Revdisrecursive(temp.next);
        System.out.print(temp.val+" ");
    }
    public static int get(Node head, int idx){
        Node temp = head;
        for(int i =1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
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
        c.next=d;
        d.next=e;
        e.next=f;

//        dis(a);
//        disrecursive(a);
//        System.out.println();
//        Revdisrecursive(a);

        System.out.println(get(a,2));
//        Node n = null;
//        System.out.println(n.val);
//        System.out.println(n.next);


    }
}
