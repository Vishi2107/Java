// Write an efficient algorithm that searches for a value `target` in an m x n integer matrix `matrix`.
// This matrix has the following properties:
// - Integers in each row are sorted in ascending order from left to right.
// - Integers in each column are sorted in ascending order from top to bottom.
//T(n) = O(n+m)
public class searchMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1;
        
        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true; // Target value found in the matrix
            } else if (target < matrix[i][j]) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        
        return false; // Target value not found in the matrix
    }
    
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        searchMatrix2 s = new searchMatrix2();
        System.out.println(s.searchMatrix(a, target)); // Print whether the target is found in the matrix
    }
}
