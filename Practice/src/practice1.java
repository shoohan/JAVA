import java.util.Arrays;

public class practice1 {
	
	public static boolean isPrime(int N)
	{
		if(N<2) return false;
		for(int i=2;i*i<=N;i++)
			if(N%i==0) return false;
		return true;
	}
	
    public static void main(String []args) {
      System.out.println(isPrime(104));
    }
}
