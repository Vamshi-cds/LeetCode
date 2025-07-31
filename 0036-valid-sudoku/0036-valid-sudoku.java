class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows=new HashSet[9];
        HashSet<Integer>[] cols=new HashSet[9];
        HashSet<Integer>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                int b=(r/3)*3+(c/3);
                if(board[r][c]=='.' ) continue;
                if(rows[r].contains(board[r][c]-'0') 
                || cols[c].contains(board[r][c]-'0') || boxes[b].contains(board[r][c]-'0') ){
                    return false;
                }
                rows[r].add(board[r][c]-'0');
                cols[c].add(board[r][c]-'0');
                boxes[b].add(board[r][c]-'0');
            }
        }
        return true;
        
    }
}
