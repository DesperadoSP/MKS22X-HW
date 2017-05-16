public class FrontierQueue implements Frontier{
    
   private Queue<Location> frontier;

   public FrontierQueue(){
	frontier = new Queue<Location>();
   }

    public void add(Location x){
	frontier.add(x);
    }

    public Location next(){

    }
