// Search the target value in a 2D integer matrix of dimensions n*m and return true if found, else false.
// This matrix has the following properties:
// 1. Integers in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of the previous row.

public class searchMatrix {
    public boolean search(int[][] a, int target) {
        int n = a.length, m = a[0].length;
        int st = 0, end = n * m - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midVal = a[mid / m][mid % m];

            if (midVal == target) {
                return true; // Target value found in the matrix
            } else if (target < midVal) {
                end = mid - 1; // Target is in the left half of the range
            } else {
                st = mid + 1; // Target is in the right half of the range
            }
        }
        
        return false; // Target value not found in the matrix
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        searchMatrix s = new searchMatrix();
        System.out.println(s.search(a, target)); // Print whether the target is found in the matrix
    }
}
