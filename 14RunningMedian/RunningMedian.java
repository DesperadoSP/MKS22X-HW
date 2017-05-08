public class RunningMedian{
    private MyHeap max, min;
    
    public RunningMedian(){
    max = new MyHeap();
    min = new MyHeap(false);
    }

    public void add(int x){
	if (max.getSize() == 0 && min.getSize() == 0){
	    max.add(x);
	}
	else if ((max.getSize() == 1 && min.getSize() == 0)){
	    if (max.peek() > x){
		min.add(max.remove());
		max.add(x);
	    }
	}else if ((max.getSize() == 0 && min.getSize() == 1)){
	    if (min.peek() < x){
		max.add(min.remove());
		min.add(x);
	    }
	}
	else{
	    if (max.peek() >= x){
		max.add(x);
	    }
	    else{
		min.add(x);
	    }
	    if (max.getSize() - min.getSize() >= 2){
		min.add(max.remove());
	    }
	    else if (min.getSize() - max.getSize() >= 2){
		max.add(min.remove());
	    }
	}
    }

    public double getMedian(){
	if (max.getSize() > min.getSize()){
	    return max.peek();
	}
	else if (min.getSize() > max.getSize()){
	    return min.peek();
	}
	else{
	    return (min.peek() + max.peek()) / 2;
	}
    }

}
