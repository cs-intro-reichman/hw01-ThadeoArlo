public class Gen3 {
	public static void main(String[] asdf) {
		int a = Integer.parseInt(asdf[0]);
		int b = Integer.parseInt(asdf[1]);
		int x = (int) (Math.random() * (b - a)) + a;
		int y = (int) (Math.random() * (b - a)) + a;
		int z = (int) (Math.random() * (b - a)) + a;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("The minimal generated number was " + Math.min(Math.min(x, y), z));
	}
}