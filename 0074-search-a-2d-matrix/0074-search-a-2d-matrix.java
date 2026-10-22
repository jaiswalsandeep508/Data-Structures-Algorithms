class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
 
        int left = 0;
        int right = rows - 1;
 
        while (left <= right) {
            int midRow = left + (right - left) / 2;
 
            if (target < matrix[midRow][0]) {
                right = midRow - 1;
            } else if (target > matrix[midRow][cols - 1]) {
                left = midRow + 1;
            } else {
                int low = 0;
                int high = cols - 1;
 
                while (low <= high) {
                    int mid = low + (high - low) / 2;
 
                    if (matrix[midRow][mid] == target) {
                        return true;
                    } else if (matrix[midRow][mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
 
                return false;
            }
        }
 
        return false;
    }
}
 