public class GetMax2 {

   	public static int max(int[] m) {
		int i = 0;
		int bigger = m[i];
		if (m.length >= 0) {
			while (i < m.length - 1) {
				bigger = maxOf2(bigger, m[i+1]);
				i += 1;
			}
			return bigger;
		} else {
	       	return 0;
		}
   	}

	public static int maxOf2(int x, int y) {
		if (x > y) {
		    return x;
		}
		return y;
	}

   	public static void main(String[] args) {
		int[] numbers = new int[] {9, 2, 15, 2, 22, 10, 6, 1, 45, 18, 44}; 
		System.out.println(max(numbers));
	}

}

