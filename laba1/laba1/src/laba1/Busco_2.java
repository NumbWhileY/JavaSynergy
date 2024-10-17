package laba1;

public class Busco_2 {
	public static double root3(double _double) {
		return Math.pow(_double, 1/3);
	}
	public static double pow(double _double) {
		return Math.pow(_double, 2);
	}
	
	public static double abs(double _double) {
		return Math.abs(_double);
	}
	
	public static double tg(double _double) {
		return Math.tan(_double);
	}

	public static void main(String[] args) {
		double s;
		double x = -4.5;
		double y = 0.75*Math.pow(10, -4);
		double z = -0.845*Math.pow(10, -2);
		double e = Math.E;
		
		double first = root3(9+pow(x-y));
		double second = pow(x) + pow(y) + 2;
		double third = Math.pow(e, abs(x-y))*Math.pow(tg(z),3);
		
		
		
		s = (first/second) - third;
		System.out.println(s);
		
	}
}
