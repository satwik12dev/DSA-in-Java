package LinkedList;

import java.util.ArrayList;

public class PalindromeLL {
    static boolean isPalindrome(Node head){
        Node temp = head;

        ArrayList<Integer> arr = new ArrayList<>();

        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n = arr.size();
        System.out.println(n);
        int i=0, j =n-1;
        while(i<=j){
            if(!arr.get(i).equals(arr.get(j))) return false;
            i++;
            j--;
        }

        return true;
    }
    static Node reverse(Node head){
        Node curr = head;
        Node forw = null;
        Node prev = null;

        while (curr!=null){
            forw= curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }

    static boolean isPalindrome2(Node head){
        Node slow = head;
        Node fast = head;
        Node temp=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        Node head2 = slow.next;
        slow.next=null;

        head2=reverse(head2);

        Node i = head, j=head2;

        while(j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node a = new Node(375);
        Node b = new Node(961);
        Node c = new Node(677);
        Node d = new Node(596);
        Node e = new Node(1);
        Node f = new Node(1);
        Node g = new Node(596);
        Node h = new Node(677);
        Node i = new Node(961);
        Node j = new Node(375);

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
        j.next=null;

        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome2(a));
    }
}
