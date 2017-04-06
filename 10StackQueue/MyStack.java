import java.util.*;
public class MyStack{
    private LinkedList<Integer> a;

    public MyStack(){
	a = new LinkedList<Integer>();
    }

    public void push(int item){
        a.addFirst(item);
    }

    public int pop(){
        return a.remove(0);
    }

    public int peek(){
        return a.get(0);
    }

    public int size(){
	return a.size();
    }

    public boolean isEmpty(){
        return (a.size() == 0);
    }

    public String toString(){
	return a.toString();
    }

}
