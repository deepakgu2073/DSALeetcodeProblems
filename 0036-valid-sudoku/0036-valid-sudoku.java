import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> row = new ArrayList<>();
        List<Set<Character>> column = new ArrayList<>();
        List<Set<Character>> box = new ArrayList<>();
        for(int i = 0; i<9; i++){
            Set<Character> a = new HashSet<>();
            row.add(a);
            Set<Character> b = new HashSet<>();
            column.add(b);
            Set<Character> c = new HashSet<>();
            box.add(c);

        }
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(row.get(i).contains( board[i][j])) return false;
                    else if(column.get(j).contains(board[i][j])) return false;
                    else if(box.get((i/3)*3 + (j/3)).contains(board[i][j])) return false;
                    else {
                        row.get(i).add(board[i][j]);
                        column.get(j).add(board[i][j]);
                        box.get((i/3)*3 + (j/3)).add(board[i][j]);
                    }
                }
            }
        }
        return true;

    }
}