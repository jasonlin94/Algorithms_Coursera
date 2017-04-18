import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Subset {
  public static void main(String[] args){
    int k = Integer.parseInt(args[0]);
    RandomizedQueue<String> queue = new RandomizedQueue<String>();
    while (!StdIn.isEmpty()){
      String str = StdIn.readString();
      queue.enqueue(str);
    }
    for (int i = 0; i < k; i++){
      StdOut.println(queue.dequeue());
    }
  }
}