// Find first occurrence of given number, when array is sorted, if no occurrence then return -1\
//T(n) = log n
public class FirstOccurrence {
    // Method to find the first occurrence of x in the sorted array
    static int firstOcc(int[] arr, int x) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int fo = -1; // Variable to store the first occurrence index

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == x) {
                fo = mid; // Update the first occurrence index
                end = mid - 1; // Continue searching in the left half
            } else if (x < arr[mid]) {
                end = mid - 1; // x is present in the left half
            } else {
                st = mid + 1; // x is present in the right half
            }
        }
        
        return fo; // Return the first occurrence index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 5, 5, 5, 6, 7, 7};
        int x = 5;
        System.out.println(firstOcc(arr, x));
    }
}
