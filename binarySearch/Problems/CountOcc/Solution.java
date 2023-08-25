public class Solution {

    // Function to find the first occurrence of element k in sorted array arr
    public static int firstOcc(int arr[], int n, int k){
        int low = 0, high = n - 1;
        int first = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == k){
                first = mid; // Update first occurrence and continue searching in the left half
                high = mid - 1;
            } else if(arr[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return first;
    }
    
    // Function to find the last occurrence of element k in sorted array arr
    public static int lastOcc(int arr[], int n, int k){
        int low = 0, high = n - 1;
        int last = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == k){
                last = mid; // Update last occurrence and continue searching in the right half
                low = mid + 1;
            } else if(arr[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return last;
    }
    
    // Function to find both the first and last occurrences of element k in sorted array arr
    public static int[] firstAndLastPosition(int arr[], int n, int k) {
        int first = firstOcc(arr, n, k);
        
        if (first == -1) return new int[] { -1, -1}; // If first occurrence is not found, return [-1, -1]
        
        int last = lastOcc(arr, n, k);
        return new int[] {first, last};
    }
    
    // Function to count the occurrences of element x in sorted array arr
    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        
        if(ans[0] == -1) return 0; // If element x is not found, return 0
        
        return (ans[1] - ans[0]  + 1); // Calculate the count based on first and last occurrences
    }
};
