package Arrays;

public class WaveArray {

    //Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on.
    //Input: arr[] = [1, 2, 3, 4, 5]
    //Output: [2, 1, 4, 3, 5]
    //Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

    public static void main(String[] args) {

        int[] arr = {2,4,7,8,9,10};
        waveArray(arr);

        for(int ele:arr) System.out.print(ele+" ");
    }

    static void waveArray(int[] arr){
        for (int i = 0; i < arr.length-1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
        }
    }
}
