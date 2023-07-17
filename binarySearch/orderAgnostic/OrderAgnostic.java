// package orderAgnostic;
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 15;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
    
    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target element found at index mid
            }

            // Adjust the search range based on the order (ascending or descending)
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // Target is in the left half
                } else {
                    start = mid + 1; // Target is in the right half
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1; // Target is in the left half
                } else {
                    start = mid + 1; // Target is in the right half
                }
            }
        }
        
        return -1; // Target element not found in the array
    }
}
