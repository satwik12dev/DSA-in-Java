package Arrays;

public class MissingElements {
    //I/P
    //int[] arr = {1,2,3,5}
    //n = 5;
    //missing element --> ??;

    //Approach --> first n = arr.length+1
    //             then sum of n natural numbers karege i.e. s = n*(n+1)/2
    //             then sum of arrays
    //             now last sum of arrays mai se sum of n natural number substract karege and we got our missing number.

    //O/P
    //int[] arr = {1,2,3,5}
    //n = 5;
    //missing element --> 4;

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int n = arr.length+1;
        FindMissing(arr,n);
    }

    static void FindMissing(int[] arr, int n){
        int sum = n*(n+1)/2;
        int sumarr = 0;
        for(int i = 0 ;i< arr.length; i++) {
            sumarr += arr[i];
        }

        int missing = sum -= sumarr;
        System.out.println("Missing number is : "+missing);
    }
}
