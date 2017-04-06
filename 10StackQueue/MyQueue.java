import java.util.*;
public class MyQueue{
    private LinkedList<Integer> zel;

    public MyQueue(){
	zel = new LinkedList<Integer>();
    }

    public void enqueue(int item){
        zel.add(item);
    }

    public int dequeue(){
        return zel.remove(0);
    }

    public int peek(){
	return zel.get(0);
    }

    public int size(){
	return zel.size();
    }

    public boolean isEmpty(){
	return (zel.size() == 0);
    }

    public String toString(){
	return zel.toString();
    }

}

    
