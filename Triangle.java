public class Triangle {
	public static void main(String[] asdf) {
		int a = Integer.parseInt(asdf[0]);
		int b = Integer.parseInt(asdf[1]);
		int c = Integer.parseInt(asdf[2]);

	 if (a+b>c && a+c>b && b+c>a) {
			System.out.println( a + ", " + b + ", " + c + ": true");
		} else {
			System.out.println( a + ", " + b + ", " + c + ": false");
		}
	}
}
