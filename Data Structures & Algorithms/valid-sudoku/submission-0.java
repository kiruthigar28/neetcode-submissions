class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> row = new HashSet<>();
        Set<String> col = new HashSet<>();
        Set<String> sq = new HashSet<>();

        String rKey, cKey, sKey;

        for(int i=0 ; i<board.length ; i++) {
            for (int j=0 ; j<board[i].length ; j++) {
                if(board[i][j] == '.') {
                    continue;
                }

                rKey = i + "" + board[i][j] ;
                cKey = j + "" + board[i][j] ;

                sKey = i/3 + "" + j/3 + "" +board[i][j];
                if (row.contains(rKey)) {
                    System.out.println("rKey : " + rKey);
                    return false;
                }
                
                if (col.contains(cKey)) {
                    System.out.println("cKey : " + cKey);
                    return false;
                }
                
                if (sq.contains(sKey)) {
                    System.out.println("sKey : " + sKey);
                    return false;
                }

                row.add(rKey);
                col.add(cKey);
                sq.add(sKey);
                
            }
        }
        return true;
    }
}
