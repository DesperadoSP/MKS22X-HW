public class Merge{

    public static void mergesort(int[]ary){
	if (ary.length > 1){
	    int[] left = leftSplit(ary);
	    int[] right = rightSplit(ary);
	    mergesort(left);
	    mergesort(right);
	    merge(ary, left, right);
	}
    }

    

    public static int[] leftSplit(int[] ary){
	int a = ary.length / 2;
	int[] left = new int[a];
	for (int i = 0; i < a; i++){
	    left[i] = ary[i];
	}
	return left;
    }

    public static int[] rightSplit(int[] ary){
	int a = ary.length / 2;
	int b = ary.length - a;
	int[]right = new int[b];
	for (int i = 0; i < b; i++){
	    right[i] = ary[i + a];
	}
	return right;
    }

    public static void merge(int[] destination, int[] left, int[] right){
	int zel = 0;
	int karma = 0;
	for (int i = 0; i < destination.length; i++){
	    if ((karma >= right.length) || ((zel < left.length && left[zel] <= right[karma]))){
		destination[i] = left[zel];
		zel++;
	    }
	    else {
		destination[i] = right[karma];
		karma++;
	    }
	}
    }

    public static void main(String[] args){
	int[] q = {5, 8, 11, 30, 32};
	int[] k = {1, 3, 5, 9, 11, 16, 20};
        int[] r = new int[12];
	merge(r, q, k);
        for (int i = 0; i < r.length; i++){
	    System.out.println(r[i]);
	}
	System.out.println("-------------");
	int[] boi = {6, 5, 15, 34, 3, 7, 0, 12, 12, 3};
	mergesort(boi);
	for (int j = 0; j < boi.length; j++){
	    System.out.println(boi[j]);
	}
}
}
