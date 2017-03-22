import java.util.*;
public class Quick{


    public static void quicksort(int[] data){
	part(data, 0, data.length - 1);


    }
    public static int quickselect(int[]data, int k){
        quicksort(data);
	return data[k];

	

    }
    

    public static void part(int[]data, int start, int end){
        if (end <= start){
	    return;
	}
	int lt = start;
	int gt = end;
	int v = data[start];
	int i = start;
	while (i <= gt){
	    if (data[i] < v){
		swap(data, lt++, i++);
	    }
	    else if(data[i] > v){
		swap(data, i, gt--);
	    }
	    else{
		i++;
	    }
	}
	part(data, start, lt - 1);
	part(data, gt + 1, end);
    }

    public static void swap(int[] data, int one, int two){
	int var = data[one];
	data[one] = data[two];
	data[two] = var;
    }

    public static void main(String[]args){
	int[]a = {5, 5, 5, 5, 1, 5, 8, 2, 10, 16, 39, 0};
	quicksort(a);
	for (int i = 0; i < a.length; i++){
	    System.out.println(a[i]);
	}
	System.out.println(quickselect(a, 7));
    }

}
    
    
