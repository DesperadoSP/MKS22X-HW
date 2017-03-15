import java.util.*;
public class Quick{

    public static int quickselect(int[]data, int k){
	int i = 0;
	while (i == 0){
	    if(part(data, 0, data.length - 1) == k){
		return data[k];
	    }
	}
	return 0;

	

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

    public static void main(String[]args){
	int[] z = {6, 3, 10, 2, 8, 1, 9};
        System.out.println(quickselect(z, 6));
    }

}
    
    
