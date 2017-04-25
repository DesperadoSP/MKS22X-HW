import java.util.*;
public class StackCalc{

    public static double eval(String x){
	Stack<Double> nums = new Stack<Double>();
	Scanner tokens = new Scanner(x);
	while(tokens.hasNext()){
	    if(tokens.hasNextDouble()){
		nums.push(tokens.nextDouble());
	    }else{
		double b = nums.pop();
		double a = nums.pop();
		String zel = tokens.next();
		if (zel.equals("+")){
		    nums.push(a + b);
		}else if (zel.equals("-")){
		    nums.push(a - b);
		}else if (zel.equals("*")){
		    nums.push(a * b);
		}else {
		    nums.push(a / b);
		}
	    }
	}
	return nums.pop();
    }

    public static void main(String[] args){
	System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    }
}
