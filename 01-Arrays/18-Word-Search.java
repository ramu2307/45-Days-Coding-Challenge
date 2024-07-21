//Time Complexity : O(M*N*4^L) - [Accepted]
//M - No. of Rows
//N - No. of Columns
//L - Length of word
//Space Complexity : O(L)

class Solution {

    public boolean search(int i, int j, int m, int n, char[][] board, String word, int k) {
        if(k == word.length()) return true;
        if(i < 0 || j < 0 || i == m || j == n || board[i][j] != word.charAt(k)) return false;

        char visited = board[i][j];
        board[i][j] = '#';
        boolean opt1 = search(i+1, j, m, n, board, word, k+1);
        boolean opt2 = search(i-1, j, m, n, board, word, k+1);
        boolean opt3 = search(i, j+1, m, n, board, word, k+1);
        boolean opt4 = search(i, j-1, m, n, board, word, k+1);
        board[i][j] = visited;

        return opt1 || opt2 || opt3 || opt4;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(search(i, j, m, n, board, word, 0)) return true;
                }
            }
        }
        return false;
    }
}

