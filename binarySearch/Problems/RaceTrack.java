//A new racing track for kids is being built in New York with 'n' starting spots. 
//The spots are located along a straight line at positions x1, x2... xn(xi <-10^9). 
//For each 'i', xi+1 > xi. At a time only 'm' children are allowed to enter the race. 
//Since the race track is for kids, they may run into each other while running. 
//To prevent this, we want to choose the starting spots such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance

//maxical minima T(n)= nlogn

public class RaceTrack {

    // Function to check if it's possible to place 'k' kids on the track with minimum distance 'dist'
    static boolean isPossible(int[] a, int k, int dist) {
        int kidsPlaced = 1;  // Number of kids already placed on the track
        int lastKid = a[0];  // Position of the last placed kid

        for (int i = 0; i < a.length; i++) {
            // If the distance between the current kid's position and the last kid's position is at least 'dist'
            if (a[i] - lastKid >= dist) {
                kidsPlaced++;    // Place a kid on the track
                lastKid = a[i];  // Update the position of the last placed kid
            }
        }

        // If the number of kids placed on the track is greater than or equal to 'k', it's possible
        return kidsPlaced >= k;
    }

    // Function to find the maximum minimum distance needed to place 'k' kids on the track
    public static int raceTrack(int[] a, int k) {
        if (a.length < k) {
            return -1;  // Not enough positions on the track
        }
        int ans = 0;               // Result: maximum minimum distance
        int st = 1, end = 1000000000;  // Binary search range for the minimum distance

        // Binary search loop to find the optimal minimum distance
        while (st <= end) {
            int mid = st + (end - st) / 2;  // Midpoint for binary search
            if (isPossible(a, k, mid)) {
                ans = mid;         // Update the result
                st = mid + 1;      // Move towards larger minimum distance
            } else {
                end = mid - 1;     // Move towards smaller minimum distance
            }
        }
        return ans;  // Return the maximum minimum distance
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 9};  // Positions on the track
        int k = 2;                  // Number of kids to be placed
        System.out.println(raceTrack(a, k));  // Output the result
    }
}
