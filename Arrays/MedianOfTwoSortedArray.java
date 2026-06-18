package Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(nums1.length);
        double res = findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        double sum2 = 0;
        for(int i =0;i<nums1.length;i++){
            sum += nums1[i];
        }
        double med1= sum/nums1.length;
        for(int i =0;i<nums2.length;i++){
            sum2 += nums2[i];
        }
        double med2 = sum2/nums2.length;
        double res = (med1+med2)/2;
        return res;
    }
}
