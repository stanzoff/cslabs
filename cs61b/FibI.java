public class FibI {

	public static int fib(int N) {
		int pred = 0;
		int curr = 1;		// First two Fibonacci numbers
		int temp;
		int k = 2;			// Tracks which Fib number is curr
		while (k < N) {
			temp = pred;
		    pred = curr;
			curr = temp + curr;
		    k = k + 1;
			System.out.println(k + " " + pred + " " + curr);
		}
		return curr;
	}

   	public static void main(String[] args) {
		System.out.println(fib(8));
	}

}
