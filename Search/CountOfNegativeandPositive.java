package Search;

public class CountOfNegativeandPositive {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        int res = count(arr);
        System.out.println(res);
    }

    static int count(int[] arr) {
        int n = arr.length;

        // first index >= 0
        int low = 0, high = n - 1;
        int firstNonNegative = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                firstNonNegative = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int negative = firstNonNegative;

        // first index > 0
        low = 0;
        high = n - 1;
        int firstPositive = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > 0) {
                firstPositive = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int positive = n - firstPositive;

        return Math.max(negative, positive);
    }
}
