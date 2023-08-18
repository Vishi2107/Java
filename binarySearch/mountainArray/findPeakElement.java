// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

// You must write an algorithm that runs in O(log n) time.
public class findPeakElement {
    public int findPeakEl(int[] a) {
        int st = 0, end = a.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if(a[mid] > a[mid-1] && a[mid]<  a[mid+1]){
                return mid;
            }
            else if (a[mid] < a[mid + 1]) { //uphill ascending
                st = mid + 1; // Move the start index to mid + 1
            } else {
                end = mid; // Move the end index to mid
            }
        }
        return -1; // Return the index of the peak element
    }
}
