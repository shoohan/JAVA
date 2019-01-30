import java.util.Arrays;
import edu.princeton.cs.algs4.Counter;
//import edu.princeton.cs.algs4.StdIn;

public class Practice1 {
	public static void main(String[] args){
		int T = StdIn.readInt();
		int T1 = StdIn.readInt();
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		for (int t = 0; t<T;t++)
		{
			if(StdRandom.bernoulli(0.5))
			{
				heads.increment();
			}else tails.increment();
		}
		StdOut.println(heads);
		StdOut.println(tails);
		int d = heads.tally()-tails.tally();
		StdOut.println("delta: "+Math.abs(d));
		StdOut.println(T1);
	}
}
