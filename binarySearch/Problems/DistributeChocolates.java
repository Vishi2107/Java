// You have 'n'(n<<= 10^5) boxes of chocolate. Each box contains a[i] (a[i] <= 10000) chocolates. You need to distribute these boxes among 'm' students such that the maximum number of chocolates allocated to a student is minimum.
// a) One box will be allocated to exactly one student.
// b) All the boxes should be allocated.
// c) Each student has to be allocated at least one box.
// d) Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3, skipping box 2.
// Calculate and return that minimum possible number.

// minimal maxima T(n) = n log n (N~~10^9 ==> logn  &&  isDivisionPossible() takes O(n) time)

public class DistributeChocolates {

    // Function to check if it's possible to distribute chocolates such that
    // no student gets more than 'maxChocAllowed' chocolates
    static boolean isDivisionPossible(int[] a, int m, int maxChocAllowed) {
        int numStudents = 1;  // Number of students needed to distribute the chocolates
        int choc = 0;         // Number of chocolates the current student has

        for (int i = 0; i < a.length; i++) {
            // If there's a box with more chocolates than allowed, distribution is not possible
            if (a[i] > maxChocAllowed) {
                return false;
            }
            
            // If adding the chocolates from the current box doesn't exceed the limit
            if (choc + a[i] <= maxChocAllowed) {
                choc += a[i];  // Add chocolates to the current student
            } else {
                numStudents++;  // Move on to the next student
                choc = a[i];    // Start the new student with the current box
            }
        }

        // If the required number of students is less than or equal to 'm', distribution is possible
        return numStudents <= m;
    }

    // Function to find the minimum possible maximum chocolates a student can have
    public static int distributeChocolates(int[] a, int m) {
        if (a.length < m) {
            return -1;  // Not enough chocolates to distribute
        }
        int ans = 0;               // Result: minimum possible maximum chocolates
        int st = 1, end = 1000000000;  // Binary search range for maximum chocolates

        // Binary search loop to find the optimal maximum chocolates
        while (st <= end) {
            int mid = st + (end - st) / 2;  // Midpoint for binary search
            if (isDivisionPossible(a, m, mid)) {
                ans = mid;         // Update the result
                end = mid - 1;     // Move towards smaller maximum chocolates
            } else {
                st = mid + 1;      // Move towards larger maximum chocolates
            }
        }
        return ans;  // Return the minimum possible maximum chocolates
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};  // Chocolates in each box
        int m = 3;                  // Number of students
        System.out.println(distributeChocolates(a, m));  // Output the result
    }
}
