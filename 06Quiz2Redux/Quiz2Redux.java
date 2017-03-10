import java.util.*;
public class Quiz2Redux{  
  public static ArrayList<String> combinations(String s){
      ArrayList<String>words = new ArrayList<String>();
      help(words, s, "", 0);
      Collections.sort(words);
      return words;
  }
  
    private static void help(ArrayList<String> words, String x, String y, int index){
	if (index >= x.length()){
	    words.add(y);
	    return;
	}
	String noob = y;
	y += (x.charAt(index));
	help(words, x, y, index + 1);
	help(words, x, noob, index + 1);
  
  }

    public static void main(String[]args){
	System.out.println(combinations("abcd"));
    }
}
