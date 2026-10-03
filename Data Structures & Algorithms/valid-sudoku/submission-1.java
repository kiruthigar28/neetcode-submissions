class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> row = new HashSet<>();
        Set<String> col = new HashSet<>();
        Set<String> sq = new HashSet<>();

        String rk, ck, sk;

        for(int i=0 ; i<9 ; i++) {
            for(int j=0 ; j<9 ; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                rk = i + "" + board[i][j];
                ck = j + "" + board[i][j];
                sk = i/3 + "" + j/3 + "" + board[i][j];

                if(row.contains(rk) || col.contains(ck) || sq.contains(sk)) {
                    return false;
                }
                row.add(rk);
                col.add(ck);
                sq.add(sk);
            }
        }
        return true;
    }
}
