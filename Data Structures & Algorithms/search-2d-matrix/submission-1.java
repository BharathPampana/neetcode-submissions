class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = (m*n)-1;

        while(low<=high)
        {
            int mid = low + (high  - low)/2;

            int i = mid/n;
            int j = mid%n;

            if(matrix[i][j] == target)return true;
            else if(target < matrix[i][j]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}



// m = 3;
// n = 4

// low = 1, high = 12

// mid = 6

// i = 6/3 = 2;
// j = 6%4 = 2
