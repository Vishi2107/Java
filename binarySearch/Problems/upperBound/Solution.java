public class Solution {
    public static int upperBound(int []arr, int x, int n){
        int st = 0, end = n - 1;    
        int ans = n;                     // Initialize ans to n, which will act as a fallback value if x is less than all elements
        
        while (st <= end) {
            int mid = st + (end - st) / 2; // Calculate the middle index
            
            if (arr[mid] > x) {      // If the middle element is strictly greater than x
                ans = mid;                  // Update ans with the current middle index
                end = mid - 1;              // Move the 'end' pointer to the left to search for a smaller index with the same property
            } else {
                st = mid + 1;              // If the middle element is less than or equal to x, move the 'start' pointer to the right
            }
        }
        
        return ans;  // Return the upper bound index of x in the array
    }
}
