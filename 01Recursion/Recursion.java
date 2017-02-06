public class Recursion{
    public static String name(){
	return "Zhu, Edwin";
    }
    public static double sqrt(double n){
	if (n == 0){
	    return 0.0;
	}
	else if (n < 0){
	    throw new IllegalArgumentException("Cannot take square root of negatives!");}
	    else{
        return helper(n, 1);
	}
	
    }

    public static double helper(double z, double guess){
	if (close((guess * guess), z)){
	    return (double)Math.round(guess * 100) / 100;
	}
	double a = (z / guess + guess) / 2;
        return helper(z, a);
	


    }

    public static boolean close(double a, double b){
	if ((Math.abs(((a - b) / b)) * 100) <= 0.00000001){
	    return true;
	}else{
	    return false;
	}
    }
    public static void main(String[]args){
        System.out.println(sqrt(625));
        
        
    }




}

