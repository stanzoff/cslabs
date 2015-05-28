public class HelloMany {
   	public static void main(String[] args) {
		int count = 0;
		int N = Helper.square(2);
		while (count < N) {
			System.out.println("Hello");
			count = count + 1;
		}
	}
}

private class Helper {
	public static int square(int x) {
		return x * x;
	}
}
