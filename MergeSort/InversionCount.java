package MergeSort;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr ={2,4,1,3,5};
        System.out.println(inversion(arr));
    }

    public static int inversion(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }
    static  int count;
    public static int inversion2(int[] arr){
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

        //Step 4 merge a and b into arr
        sort(a,b,arr);
    }
    static void sort(int[] a , int[] b, int[] c){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else {
                count += (a.length-i);
                c[k++]=b[j++];
            }
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
    }
}
