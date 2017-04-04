public class MyLinkedList{
    private LNode start, end;
    private int size;

    private static class LNode{
	private int data;
	private LNode next, prev;
	
        public LNode(int value){
	    data = value;
	}

	public LNode(int value, LNode nex){
	    next = nex;
	}
    }

    public MyLinkedList(){
	size = 0;
	end = new LNode(null);
	start = new LNode(null, end);
    }

    public boolean add(int value){



    }

    public int size(){
	return size;
    }

    public String toString(){
	int noob = size();
	LNode copy = start;
	String a = "[";
	while (noob > 0){
	    if (noob == 1){
		a += ""+copy.data+"]";
	    }else{
                a += ""+copy.data+", ";
	    }
	    copy = copy.next;
	    noob--;
	}
	System.out.println(a);
    }

    
    public int get(int index){
	try{
	int a = index;
	Lnode current = start;
	while (a > 0){
	    current = current.next;
	    a--;
	}
	return current.data;
	}
	catch (IndexOutOfBoundsException e){
	    System.out.println("Invalid index");
	}
    }

    public int set(int index, int newValue){

    }

    public int indexOf(int value){
	Lnode current = start;
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

    public void add(int index, int value){

    }

    public int remove(int index){

    }

	
 }
	











