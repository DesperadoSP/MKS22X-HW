public class KnightBoard{
    private int[][] board;
    public KnightBoard(int startingRows, int startingCols){
	board = new int[startingRows][startingCols];
	for (int r = 0; r < board.length; r++){
	    for (int c = 0; c < board[0].length; c++){
		board[r][c] = 0;
	    }
	}
    }

    public String toString(){
	String x = "";
	for (int r = 0; r < board.length; r++){
	    for (int c =0; c < board[0].length; c++){
		if (board[r][c] == 0){
		    x += " _ ";
		}
		else {
		    if (board[r][c] < 10){
			x += "  "+board[r][c]+" ";
		    }
			else{
		    x += " "+board[r][c]+" ";
			}
		}
		if (c == board[0].length - 1){
		    x += "\n";
		}
	    
	}
        

    }
	return x;
    }

    public void solve(){
	solveH(0, 0, 1);

    }

    private boolean solveH(int row, int col, int level){
	if (level > (board.length * board[0].length)){
		return true;
	}
	else{
	    if(((row < 0) || (row >= board.length)) || ((col < 0) || (col >= board[0].length))){
		return false;
	    }
	    if (board[row][col] == 0){
		board[row][col] = level;
			if (solveH(row - 1, col - 2, level + 1)  || solveH(row - 2, col -1, level + 1) || solveH(row - 2, col + 1, level + 1) || solveH(row - 1, col + 2, level + 1) || solveH(row + 1, col + 2, level + 1) || solveH(row + 2, col + 1, level + 1) || solveH(row + 2, col - 1, level + 1) || solveH(row + 1, col - 2, level + 1)){
			    return true;
			}
			else{
			    board[row][col] = 0;
			}
		    }
                }
	return false;
	    
	}
    

    public static void main(String[]args){
	KnightBoard a = new KnightBoard(5, 4);
        a.solve();
	System.out.println(a);
    }
			   
		     
            
		

    }

   







