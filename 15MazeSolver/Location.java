public class Location implements Comparable<Location>{

    private int row, col;
    private int distToGoal;
    private int distToStart;
    private Location previous;
    private boolean aStar;

    public Location(int r, int c, Location p, int d1, int d2, boolean f){
	row = r;
	col = c;
	previous = p;
	distToStart = d1;
	distToGoal = d2;
	aStar = f;
    }

    public int getRow(){
	return row;
    }

    public int getCol(){
	return col;
    }

    public int getGoalG(){
	return distToGoal;
    }

    public int getGoalS(){
	return distToStart;
    }

    public boolean getAStar(){
	return aStar;
    }

    public int compareTo(Location other){
	if (getAStar()){
	    Integer a = new Integer(getGoalG() + getGoalS());
	    Integer b = new Integer(other.getGoalG() + other.getGoalS());
	    return -1 * a.compareTo(b);
        }
	else{
	    Integer a = new Integer(getGoalG());
	    Integer b = new Integer(other.getGoalG());
	    return -1 * a.compareTo(b);
	}
    }
}
