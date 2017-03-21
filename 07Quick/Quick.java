import java.util.*;
public class Quick{


    public static void quicksort(int[] data){



    }
    public static int quickselect(int[]data, int k){
       

	

    }
    

    public static int part(int[]data, int start, int end){
	Random a = new Random();
        int pivotIndex = start + a.nextInt(end - start + 1);
	int pivot = data[pivotIndex];

	for (int i = start; i <= end; i++){
	    if (((i >= pivotIndex) && (data[i] <= pivot)) || ((i <= pivotIndex) && (data[i] >= pivot))){
		int store = data[i];
		data[i] = pivot;
		data[pivotIndex] = store;
		pivotIndex = i;
	    }
	}
	return pivotIndex;


    }

    public static void swap(int[] data, int one, int two){
	int var = data[one];
	data[one] = data[two];
	data[two] = var;
    }

    public static void main(String[]args){

    }

}
    
    
