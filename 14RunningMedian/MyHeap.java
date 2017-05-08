import java.util.*;
public class MyHeap{
    private ArrayList<Integer> a;
    private int size;
    private boolean max;
    
    public MyHeap(){
	max = true;
	a = new ArrayList<Integer>(10);
	size = 0;
	a.add(size);
    }

    public MyHeap(boolean f){
	if (f){
	    max = true;
	}else{
	    max = false;
	}
	a = new ArrayList<Integer>(10);
	size = 0;
	a.add(size);
    }
    
    public int getSize(){
	return size;
    }

    private void updateSize(){
	size++;
	a.set(0, size);
    }

    public Integer remove(){
	ArrayList<Integer> sub = a;
	a = new ArrayList<Integer>(sub.size() + 5);
	size = 0;
	a.add(size);
	for (int i = 2; i < sub.size(); i++){
	    this.add(sub.get(i));
	}
	return sub.get(1);
    }
    
    private void pushUp(){
	if (max){
	int index = a.size() - 1;
	while (((a.get(index)).compareTo(a.get(index / 2)) > 0) && (index != 1)){
	    Integer copy = a.get(index / 2);
	    a.set(index / 2, a.get(index));
	    a.set(index, copy);
            index = index / 2;
	}
	}
	else{
	   int index = a.size() - 1;
	while (((a.get(index)).compareTo(a.get(index / 2)) < 0) && (index != 1)){
	    Integer copy = a.get(index / 2);
	    a.set(index / 2, a.get(index));
	    a.set(index, copy);
            index = index / 2;
	}
	}
    }


    public void add(int s){
	a.add(s);
        pushUp();
	updateSize();
    }

   

    public Integer peek(){
	return a.get(1);
    }

    public String toString(){
	return a.toString();
    }

    public static void main(String[]args){
	MyHeap q = new MyHeap(false);
	q.add(1);
	q.add(3);
	q.add(4);
	q.add(9);
	q.add(8);
	q.add(5);
	q.add(2);
        System.out.println(q);
    }
}
    
