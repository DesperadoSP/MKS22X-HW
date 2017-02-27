import java.util.*;
import java.io.*;
public class Maze{
    private char[][] maze;
    private boolean animate; 
    public Maze(String filename){
	File infile = new File(filename);
	Scanner inf = new Scanner(text);
	int lineNumber = 1;
	while (inf.hasNextLine()){
            char line = inf.nextLine();
	}
    }

    public void setAnimate(boolean b){
	animate = b;
    }

    public void clearTerminal(){
	System.out.println("\033[2J\033[1;1H");
    }

    public boolean solve(){
	int startx, starty;
        for(int r = 0; r < maze.length; r++){
	    for (int c = 0; c < maze[0].length; c++){
		if (maze[r][c].equals('S')){
		    startx = r;
		    starty = c;
		    break;
		}
	    }
	}
	maze[startx][starty] = ' ';
	return solve(startx, starty);
    }

    private boolean solve(int x, int y){
	if (animate){
	    System.out.println("\033[2J\033[1;1H"+this);
	    wait(20);
	}
        if (maze[x][y].equals('E')){
	    return true;
	}
	else{
	    if(maze[x][y].equals(' ')){
		maze[x][y] = '@';
		if (solve(x + 1, y) || solve(x - 1, y) || solve(x, y + 1) || solve(x, y - 1)){
		    return true;
		}
		else{
		    maze[x][y] = '.';
		}
	    }
	}
	return false;
}


    public String toString(){
	String x = "";
	for (int r = 0; r < maze.length; r++){
	    for (int c= 0; c < maze[0].length; c++){
		x += maze[r][c];
		if (c == maze[0].length - 1){
		    x += "\n";
		}
	    }
	}
	return x;
    }

    









}
