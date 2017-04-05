import java.util.*;
public class MyLinkedList{
    private LNode start, end;
    private int size;

    private static class LNode{
	private int data;
	private LNode next, prev;
	
        public LNode(int value){
	    data = value;
	}

	public LNode(int value, LNode a, LNode b){
	    data = value;
	    next = a;
	    prev = b;
	}

	public String toString(){
	    return data+"";
	}
    }

    public class MLLI implements Iterator<Integer>{
        private LNode zel;

	public MLLI(MyLinkedList a){
	    zel = a.start;
	}
       
        public boolean hasNext(){
            if ((zel.next == null) || (zel == null)){
		return false;
	    }
	    return true;
	}

	public void remove(){
	    throw new UnsupportedOperationException();
	}

	public int next(){
	    if (hasNext()){
		int karma = zel.data;
		zel = zel.next;
		return karma;
	    }
	    else{
		throw new NoSuchElementException();
	    }
	}
    }

    public MyLinkedList(){
	size = 0;     
    }

    public Iterator<Integer> iterator(){
	return new MLLI(this);
    }

    public boolean add(int value){
        LNode current = new LNode(value, null, end);
        if (end != null){
	    end.next = current;
        }
        end = current;
        if (start == null){
	    start = current;
        }
	size++;
	return true;
    }

    public int size(){
	return size;
    }

    public String toString(){
	int noob = size();
	if (noob <= 0){
	    return "[ ]";
	}
	LNode copy = start;
	String a = "[";
	while (noob > 0){
	    if (noob == 1){
		a += ""+copy+"]";
	    }else{
                a += ""+copy+", ";
	    }
	    copy = copy.next;
	    noob--;
	}
        return a;
    }

    public int get(int index){
	if((start == null) || (index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
       	}
	else{
	int a = index;
	LNode current = start;
	while (a > 0){
	    current = current.next;
	    a--;
	}
	return current.data;
	}
        
    }

    public int set(int index, int newValue){
	if ((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}
	LNode current = start;
	int size1 = 0;
	while (size1 < index){
	    current = current.next;
	    size1++;
	}
	int tmp = current.data;
	current.data = newValue;
	while (current.prev != null){
	    current = current.prev;
	}
	start = current;
	return tmp;
    }

    public int indexOf(int value){
	LNode current = start;
	int size1 = 0;
	while (size1 < size()){
	    if (current.data == value){
		return size1;
	    }
            current = current.next;
	    size1++;
	}
	return -1;
    }

    private void addFirst(int value){
	LNode current = new LNode(value, start, null);
	if(start != null){
	    start.prev = current;
	}
	start = current;
	if (end == null){
	    end = current;
	}
	size++;
    }
    
    public void add(int index, int value){
        if ((index < 0) || (index > size())){
	    throw new IndexOutOfBoundsException();
	}
	if ((size() == 0) || (index == size())){
	    add(value);
	}
	else if (index == 0){
	    addFirst(value);
	}
	else{
	LNode current = start;
	int size1 = 0;
	while (size1 < index){
	    current = current.next;
	    size1++;
	}
        current = new LNode(value, current, current.prev);
	(current.next).prev = current;
	(current.prev).next = current;
	size++;
	while (current.prev != null){
	    current = current.prev;
	}
	start = current;
	}
    }

    public int remove(int index){
        if ((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}
	if (index == 0){
	    int a = start.data;
	    (start.next).prev = null;
	    start = start.next;
	    size--;
	    return a;
	}
        else if (size() == 1){
	    int a = start.data;
	    start = null;
	    size--;
	    return a;
	}
	else if (index == size() - 1){
	    int a = end.data;
	    (end.prev).next = null;
	    end = end.prev;
	    size--;
	    return a;
	}
	else{
        LNode current = start;
	int size1 = 0;
	while (size1 < index){
	    current = current.next;
	    size1++;
	}
	int a = current.data;
	(current.next).prev = current.prev;
	LNode derp = current.next;
	(current.prev).next = current.next;
	while (derp.prev != null){
	    derp = derp.prev;
	}
	start = derp;
	size--;
	return a;
    }
    }


    public static void main(String[]args){
	MyLinkedList a = new MyLinkedList();
	a.add(5);
        a.add(3);
	a.add(6);
	a.add(10);
	a.add(2, 2);
        a.remove(4);
	System.out.println(a);
	System.out.println(a.get(3));
	System.out.println(a.indexOf(2));
 }
}
	











