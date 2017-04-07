public class Deque extends Queue<String>{
    private int front, back, size;
    private String[] arry;

    public Deque(int x, int y, int z){
	arry = new String[x];
	size = 0;
	front = y;
	back = z;
    }


    public int size(){
	return size;
    }
  
    private void grow(){
	String[] hehe = new String[arry.length * 2];
	front = (front + 1) % hehe.length;
	back = (back + 1) % hehe.length;
	for (int i = front, i <= back; i++){
    }

    public void addFirst(String x){
	if (size == arry.length){
	    grow();
	}
    }

    public void addLast(String x){

    }

    public String removeFirst(){

    }

    public String removeLast(){

    }

    public String getFirst(){

    }

    public String getLast(){

    }















}

