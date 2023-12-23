public class LinearEq {
	public static void main(String[] asdf) {
		double a = Double.parseDouble(asdf[0]);
		double b = Double.parseDouble(asdf[1]);
		double c = Double.parseDouble(asdf[2]);
		
		double x = (c - b) / a;
		
		System.out.println(x);
	}
}