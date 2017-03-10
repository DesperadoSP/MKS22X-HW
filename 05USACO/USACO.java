import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class USACO{
    public USACO(){}

    public int bronze(String filename){
	try{
	File a = new File(filename);
	Scanner b = new Scanner(a);
	Scanner d = new Scanner(b.nextLine());
	int r = d.nextInt();
	int c = d.nextInt();
	int elevation = d.nextInt();
	int instructions = d.nextInt();
	int[][]board = new int[r][c];
	for (int i = 0; i < r; i++){
	    Scanner noob = new Scanner(b.nextLine());
	    for (int j = 0; j < c; j++){
	        board[i][j] = (noob.nextInt());
	        
	    }
	    
	}
	
	for (int s = 0; s < instructions; s++){
	    Scanner st = new Scanner(b.nextLine());
	    int derp = st.nextInt();
	    int merp = st.nextInt();
	    int flerp = st.nextInt();
	    stomp(board, derp, merp, flerp);
	}
	int total = 0;
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[0].length; j++){
		if (board[i][j] < elevation){
		    board[i][j] = elevation - board[i][j];
		    total += board[i][j];
		}else{
		    board[i][j] = 0;
		}
	    }
	}
	return (total * 72 * 72);
	}catch (FileNotFoundException e){
	    return 0;
	}
    }


    public void stomp(int[][] board, int row, int col, int stomps){
	int highest = 0;
	for (int i = row - 1; i < board.length && i < row + 2; i++){
	    for (int j = col - 1; j < board[0].length && j < col + 2; j++){
		if (board[i][j] > highest){
		    highest = board[i][j];
		    
		}
	    }
	}

	int base = highest - stomps;
        
	for (int i = row - 1; i < board.length && i < row + 2; i++){
	    for (int j = col - 1; j < board[0].length && j < col + 2; j++){
		if ((board[i][j] > base) && (board[i][j] <= highest)){
		    board[i][j] = base;
		}
	    }
	}
        
	

    }

    public int silver(String filename){
	try{
	    File a = new File(filename);
	    Scanner b = new Scanner(a);
	    Scanner d = new Scanner(b.nextLine());
	    int r = d.nextInt();
	    int c = d.nextInt();
	    int t = d.nextInt();
	    char[][]board = new char[r][c];
	    for (int i = 0; i < r; i++){
	    String noob = b.nextLine();
	    for (int j = 0; j < c; j++){
	        board[i][j] = noob.charAt(j);
        
	        
	    }
	    }
	    d = new Scanner(b.nextLine());
	    int r1 = d.nextInt();
	    int c1 = d.nextInt();
	    int r2 = d.nextInt();
	    int c2 = d.nextInt();
	    return solveH(board, r1 - 1, c1 - 1, r2 - 1, c2 - 1, t);
	    
	
	     
	}catch(FileNotFoundException e){
	    return 0;
	}
    }

    public int solveH(char[][] board, int x, int y, int xNeed, int yNeed, int time){
	int omg = 0;
	if ((x == xNeed) && (y == yNeed) && (time == 0)){
	    omg = 1;
	    return omg;
	}
	if ((0 > time) || (x >= board.length) || (x < 0) || (y >= board[0].length) || (y < 0) || (board[x][y] == ('*'))){
	    return 0;
	}
	else{
	    
        return (omg + solveH(board, x + 1, y, xNeed, yNeed, time - 1) + solveH(board, x - 1, y, xNeed, yNeed, time - 1) + solveH(board, x, y + 1, xNeed, yNeed, time - 1) + solveH(board, x, y - 1, xNeed, yNeed, time - 1));
	}
	    




       
    }
    public static void main(String[]args){
	USACO x = new USACO();
	System.out.println(x.bronze("testfile1.dat"));
    }
}

    


            
        





