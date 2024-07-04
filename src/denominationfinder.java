import java.util.HashMap;

public class denominationfinder {
    public int[] convertamounttodenomination(int amount){
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[]  noteCounter = new int[9];
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
     return noteCounter;
    }
   public void  updatecount(HashMap<Integer,Integer> hm,int amount){
       int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
      int a[] = convertamounttodenomination(amount);

   }

}



