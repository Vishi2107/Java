// Find the square root of the given non-negative value x. Round it off to the nearest floor integer value
public class FindSqrt {
    static int sqrt(int x) {
        int st = 0, end = x;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid; // Use long to avoid overflow

             if (val == x) {
                return mid; // Exact square root found
            } else if (val < x) {
                ans = mid; // Update the potential floor square root
                st = mid + 1; // Look for a larger potential square root in the right half
            } else {
                end = mid - 1; // Look for a smaller potential square root in the left half
            }
        }
        
        return ans; // Return the floor square root
    }

    public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));
    }
}
