public class Casting {
	public static void main(String[] args) {
		double a = 1.1;
		
		System.out.println(a);
		
		double b1 = 1;
		double b2 = (double) 1;
		
		System.out.println(b1);
		System.out.println(b2);
		
//		int c = 1.1;
		
		double d = 1.1;
		
		System.out.println(d);
		
		int e = (int) 1.1;
		
		System.out.println(e);
		
		String f = Integer.toString(1);
		
		System.out.println(f.getClass());
	}
}
