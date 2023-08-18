// An array arr a mountain if the following properties hold:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// You must solve it in O(log(arr.length)) time complexity.
public class peakIndex {
    public int peakIndexInMountainArray(int[] a) {
        int st = 0, end = a.length - 1;
        int ans = -1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (a[mid] < a[mid + 1]) {
                ans = mid + 1; // Update the answer to the index of the next element
                st = mid + 1; // Move the start index to mid + 1
            } else {
                end = mid - 1; // Move the end index to mid - 1
            }
        }
        return ans; // Return the index of the peak element
    }
}

