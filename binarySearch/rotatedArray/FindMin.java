// A rotated sorted array, on which rotation operation has been performed some no. of times.
// Find the index of the minimum element in the array.
// Follows 0-based indexing and assumes all elements are unique.

public class FindMin {
    static int findMin(int[] a) {
        int n = a.length;
        int st = 0, end = n - 1;
        int ans = -1;

        // Perform binary search
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] <= a[n - 1]) {
                ans = mid; // Update ans as a potential minimum index
                end = mid - 1; // Search in the left half
            } else {
                st = mid + 1; //Search in the right half
            }
        }

        return ans; // Return the index of the minimum element
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 1, 2};
        System.out.println(findMin(a)); // Print the index of the minimum element
    }
}


