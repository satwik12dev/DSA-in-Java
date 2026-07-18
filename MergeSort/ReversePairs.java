package MergeSort;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        System.out.println(reverse(arr));
    }

    static  int count;
    public static int reverse(int[] arr){
        count =0;
        merge(arr);
        return count;
    }
    public static void merge(int[] arr){
        int n = arr.length;
        if(n==1) return;
        //Step 1 create 2 new empty arr of size n/2 ech
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        //Step 2 copy and paste arr in a and b.
        int idx = 0;
        for(int i =0;i<a.length;i++) a[i] = arr[idx++];
        for(int i =0;i<b.length;i++) b[i] = arr[idx++];

        //Step 3 Magic
        merge(a);
        merge(b);
        inversion(a,b);

        //Step 4 merge a and b into arr
        sort(a,b,arr);
    }
    static void sort(int[] a , int[] b, int[] c){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else {
                c[k++]=b[j++];
            }
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
    }
    public static void inversion(int[] a,int[] b){
        int i=0,j=0;
        while (i<a.length && j<b.length){
            if((long)a[i]>((long)2*(long)b[j])){
                count+=(a.length-i);
                j++;
            }
            else i++;
        }
    }
}

