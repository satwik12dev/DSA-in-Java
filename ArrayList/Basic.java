package ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));
        System.out.println(arr.set(2,50));
        System.out.println(arr.get(2));
        System.out.println(arr);

        int n = arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for(int ele : arr) System.out.print(ele+" ");
    }
}
