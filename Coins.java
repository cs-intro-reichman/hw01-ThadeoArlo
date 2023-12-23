public class Coins {
	public static void main(String[] args) {
		int cents = Integer.parseInt(args[0]);
		int quarters = cents / 25;
		int remainder = cents % 25;
		System.out.println("Use " + quarters + " quarters and " + remainder + " cents");
	}
}