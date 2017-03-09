import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lake{
    private int[][] board, instructions;
    private int elevation, instructionCount;
    public Lake(String filename){
	try{
	File a = new File(filename);
	Scanner b = new Scanner(a);
        String derp = b.nextLine();
	Scanner c = new Scanner(derp);
	int r = c.nextInt();
	int co = c.nextInt();
	elevation = c.nextInt();
	instructionCount = c.nextInt();
	board = new int[r][co];
	instructions = new int[instructionCount][3];
	int r1 = r;

	while(r > 0){
	    String line = b.nextLine();
	    Scanner lines = new Scanner(line);
	    int c1 = 0;
System.out.println(r);
	    while(lines.hasNext()){
		board[r1 - r][c1] = lines.nextInt();
                c1++;
		System.out.println(board[r1 - r][c1 - 1]);
        
	    }
	    r--;
	}
        r = 0;
        /*while (b.hasNext()){
	    co = 0;
	    derp = b.nextLine();
	    c = new Scanner(derp);
	    while(c.hasNext()){
		instructions[r][co] = c.nextInt();
		co++;
	    }
	    r++;
	}
	*/
	}catch (FileNotFoundException e)
	    {
	    }
	System.out.println(Arrays.deepToString(board));
	Arrays.deepToString(instructions);
	
    }
    public static void main(String[]args){
	Lake a = new Lake("1");
    }




}
            
        





