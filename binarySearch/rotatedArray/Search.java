// Given the rotated sorted array of integers, which contains distinct elements,
// and an integer target, return the index of target if it is in the array,
// otherwise return -1.

// public class Search {
//     static int searchEl(int[] a, int target) {
//         int st = 0, end = a.length - 1;
        
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
            
//             if (a[mid] == target) {
//                 return mid; // Target element found at index mid
//             } else if (a[mid] < a[end]) { // mid to end is sorted
//                 if (target > a[mid] && target <= a[end]) {
//                     st = mid + 1; // Target is in the right half
//                 } else {
//                     end = mid - 1; // Target is in the left half
//                 }
//             } else { // st to mid is sorted
//                 if (target >= a[st] && target < a[mid]) {
//                     end = mid - 1; // Target is in the left half
//                 } else {
//                     st = mid + 1; // Target is in the right half
//                 }
//             }
//         }
        
//         return -1; // Target element not found in the array
//     }
    
//     public static void main(String[] args) {
//         int[] a = {3, 4, 5, 1, 2};
//         int target = 2;
//         System.out.println(searchEl(a, target));
//     }
// }

//for duplicate elements

public class Search {
    static int searchEl(int[] a, int target) {
        int st = 0, end = a.length - 1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (a[mid] == target) {
                return mid; 
            } 
            else if(a[mid]==a[st] && a[mid]==a[end]){
                st++;
                end--;
            }
            else if (a[mid] <= a[end]) { // mid to end is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            } else { // st to mid is sorted
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1; 
                }
            }
        }
        
        return -1; // Target element not found in the array
    }
    
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2, 2, 3, 1};
        int target = 2;
        System.out.println(searchEl(a, target));
    }
}
