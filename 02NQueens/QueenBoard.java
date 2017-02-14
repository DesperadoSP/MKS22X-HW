public class QueenBoard{
    private int[][]board;
    private int solutionCount;
    public QueenBoard(int size){
	solutionCount = -1;
	board = new int[size][size];
	for (int r = 0; r < board.length; r++){
	    for (int c = 0; c < board[0].length; c++){
		board[r][c] = 0;
	    }
	}
    }

    public boolean solve(){
	return solveH(0);
    }


    public void countSolutions(){
	solutionCount = 0;
        solveC(0);



    }
    private void solveC(int col){
	if (col == board.length){
	    solutionCount ++;
	    return;
	}
	for (int r = 0; r < board.length; r++){
	    if (board[r][col] == 0) {
		addQueen(r, col);
		solveC(col + 1);
		removeQueen(r, col);
		
	    }
	}
        
    }
    



    


private void clearBoard(){
    for (int r = 0; r < board.length; r++){
	for (int c= 0; c< board.length; c++){
	    board[r][c] = 0;
	}
    }
}
    

    public int getSolutionCount(){
	clearBoard();
	return solutionCount;
        
    }


    public String toString(){
	String x = "";
	for (int r = 0; r < board.length; r++){
	    for (int c = 0; c < board.length; c++){
	        if (board[r][c] == -1){
		    x += " Q ";
		}
		else{
		    x += " _ ";
		}
                if (c == board.length - 1){
		    x += "\n";
		}
	    }
	}
	return x;
    }

        



   

    private boolean solveH(int col){
	if (col >= board.length){
	    return true;
	}
	for (int r = 0; r < board.length; r++){
	    if (board[r][col] == 0) {
		addQueen(r, col);
		if (solveH(col + 1) == true){
		    return true;
		}
		else{
		    removeQueen(r, col);
		}
	    }
	}
	return false;
}



    private void addQueen(int r, int c){
	for (int ro = 0; ro < board.length; ro++){
	    board[ro][c] += 1;
	}
	for (int co = 0; co < board.length; co++){
	    board[r][co] += 1;
	}
        for (int w = 1; ((r - w) >= 0) && ((c + w) < board.length); w++){
	    board[r - w][c + w] += 1;
	}
        for (int w = 1; ((r + w < board.length)) && ((c + w < board.length)); w++){
	    board[r + w][c + w] += 1;
	}
        for (int w = 1; ((r + w < board.length)) && ((c - w) >= 0); w++){
	    board[r + w][c - w] += 1;
	}
        for (int w = 1; ((r - w) >= 0) && ((c - w) >= 0); w++){
	    board[r-w][c-w] += 1;
	}
        board[r][c] = -1;



    }
    
    private void removeQueen(int r, int c){
	for (int ro = 0; ro < board.length; ro++){
	    board[ro][c] -= 1;
	}
	for (int co = 0; co < board.length; co++){
	    board[r][co] -= 1;
	}
        for (int w = 1; ((r - w) >= 0) && ((c + w < board.length)); w++){
	    board[r - w][c + w] -= 1;
	}
        for (int w = 1; ((r + w < board.length)) && ((c + w < board.length)); w++){
	    board[r + w][c + w] -= 1;
	}
        for (int w = 1; ((r + w < board.length)) && ((c - w) >= 0); w++){
	    board[r + w][c - w] -= 1;
	}
        for (int w = 1; ((r - w) >= 0) && ((c - w) >= 0); w++){
	    board[r-w][c-w] -= 1;
	}
        board[r][c] = 0;



    }

    public static void main(String[]args){
	QueenBoard q = new QueenBoard(7);
	q.countSolutions();
	System.out.println(q.getSolutionCount());
	q.solve();
	System.out.println(q);



    }
}
