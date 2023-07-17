// Find last occurrence of given number, when array is sorted, if no occurrence then return -1
//T(n) = log n
public class LastOccurrence {
    // Method to find the last occurrence of x in the sorted array
    static int lastOcc(int[] arr, int x) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int lo = -1; // Variable to store the last occurrence index

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == x) {
                lo = mid; // Update the last occurrence index
                st = mid + 1; // Continue searching in the right half
            } else if (x < arr[mid]) {
                end = mid - 1; // x is present in the left half
            } else {
                st = mid + 1; // x is present in the right half
            }
        }
        
        return lo; // Return the last occurrence index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 5, 5, 5, 6, 7, 7};
        int x = 5;
        System.out.println(lastOcc(arr, x));
    }
}
