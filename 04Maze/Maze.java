import java.util.*;
import java.io.*;

public class Maze{
    private char[][] maze;
    private boolean animate; 
    public Maze(String filename){
	try{
	animate = false;
	File zel = new File(filename);
	Scanner karma = new Scanner(zel);
        int r = 1;
	String derp = karma.nextLine();
	int c = derp.length();
	while(karma.hasNextLine()){
	    karma.nextLine();
	    r++;
	}
	maze = new char[r][c];
	karma = new Scanner(zel);
	int zz= 0;
	while(karma.hasNextLine()){
	    String line = karma.nextLine();
	    for (int xx = 0; xx < line.length(); xx++){
		maze[zz][xx] = line.charAt(xx);
	    }
	    zz++;
	}
	
	
	}catch (FileNotFoundException e){

	}
    }

    public void setAnimate(boolean b){
	animate = b;
    }

    private void wait(int millis){ //ADDED SORRY!
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }

    public void clearTerminal(){
	System.out.println("\033[2J\033[1;1H");
    }

    public boolean solve(){
	int startx = -1,  starty = -1;
        for(int r = 0; r < maze.length; r++){
	    for (int c = 0; c < maze[0].length; c++){
		if (maze[r][c] == 'S'){
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
        if (maze[x][y] == 'E'){
	    return true;
	}
	else{
	    if(maze[x][y] == ' '){
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
