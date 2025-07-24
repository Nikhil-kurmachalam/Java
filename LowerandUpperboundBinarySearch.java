public class BoundSearch {

    // Lower Bound: First index where arr[i] >= target
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1; // go left to find earlier occurrence
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Upper Bound: First index where arr[i] > target
    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1; // go left to find smaller upper bound
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 7};
        int target = 3;

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        System.out.println("Array: [1, 3, 3, 5, 7]");
        System.out.println("Target: " + target);

        if (lb != -1)
            System.out.println("Lower Bound Index: " + lb + ", Value: " + arr[lb]);
        else
            System.out.println("Lower Bound: Not found");

        if (ub != -1)
            System.out.println("Upper Bound Index: " + ub + ", Value: " + arr[ub]);
        else
            System.out.println("Upper Bound: Not found");
    }
}
