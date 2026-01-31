package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        for(int ele : arr){
//            System.out.println(ele+" ");
//        }

        for(int ele : arr){
            ele*=2;
            System.out.println(ele);
        }
        // It is introduced because it used to print elements or to traverse in array and no vahnge in original array

    }
}
