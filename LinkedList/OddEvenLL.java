package LinkedList;
//leet code
public class OddEvenLL {
    static Node index(Node head){
        Node dumm1 = new Node(-1);
        Node dumm2=new Node(-1);

        Node evenIdx = dumm1;
        Node oddIdx = dumm2;

        Node temp = head;
        int len = 0;

        while(temp!=null){
            if(len%2==0){
                evenIdx.next=temp;
                evenIdx = evenIdx.next;
            }else{
                oddIdx.next = temp;
                oddIdx = oddIdx.next;
            }
            temp = temp.next;
            len++;
        }
        evenIdx.next = dumm2.next;
        oddIdx.next=null;
        return dumm1.next;
    }

    public static void main(String[] args) {
        Node a = new Node(10);//even
        Node b = new Node(17);//odd
        Node c = new Node(20);//even
        Node d = new Node(19);//odd
        Node e = new Node(30);//even
        Node f = new Node(27);//odd

//        10->20->30->17->19->27->null
        //connect karege link karege
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        new DisplatList().dis(a);
        Node res = index(a);
        new DisplatList().dis(res);
    }
}