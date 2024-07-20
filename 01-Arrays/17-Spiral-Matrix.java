//Time Complexity : O(N*M) - [Accepted]
//Space Complexity : O(N*M)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length-1;
        List<Integer> arr = new ArrayList<>();
        while(left<=right && top<=bottom) {
            for(int i = left; i<=right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i>=left; i--) {
                    arr.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right) {
                for(int i = bottom; i>=top; i--) {
                    arr.add(matrix[i][left]);
                }
            }
            left++;
        }
        return arr;
    }
}

