package ArrayList;

public class MergeTwoSortedArrays {
    // arr = {2,5,6,9}
    // arr2 = {1,3,4,5,7,8}
    // arr3 = {1,2,3,4,5,5,6,7,8,9}

    public static void main(String[] args) {
        int[] a  = {2,5,6,9,20};
        int[] b =  {1,3,4,5,7,8,9};
        int[] c = new int[a.length+b.length];

        for (int ele:c) System.out.print(ele+" ");
        System.out.println();

        merge(c,a,b);
        for (int ele:c) System.out.print(ele+" ");
        System.out.println();

    }
    static void merge(int[] c , int[] a, int[] b){
        int i=0,j=0,k=0;

        while (i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
    }
}