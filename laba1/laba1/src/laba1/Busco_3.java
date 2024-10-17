package laba1;

public class Busco_3 {
	public static double pow(double _double) {
		return Math.pow(_double, 2);
	}
	public static double sinn(double _double) {
		return Math.sin(_double);
	}
	public static double coss(double _double) {
		return Math.cos(_double);
	}
	public static double arctg(double _double) {
		return Math.atan(_double);
	}
	public static double abs(double _double) {
		return Math.abs(_double);
	}
	
	public static void main(String[] args) {
		double x = 3.74 * Math.pow(10, -2);
		double y = -0.825;
		double z = 0.16*Math.pow(10, 2);
		double s;
		
		double first = 1 + pow(sinn(x+y));
		double second = abs(x - (2*y/1+pow(x)*pow(y)));
		double xy = Math.pow(x, abs(y));
		double third = pow(coss(arctg(1/z)));
		
		s = (first/second)*xy+third;
		
		System.out.println(s);
	}

}
