public class FibR {

	public static int fib2(int n, int k, int f0, int f1) {
		int fn = 0;
		while (k < n) {
			fn = f0 + f1 + fib2(n-1, k+1, 0, 1);
			System.out.println(n + " " + k + " " + fn);
		}
		return fn;
	}

   	public static void main(String[] args) {
		System.out.println(fib2(8, 2, 0, 1));
	}

}
