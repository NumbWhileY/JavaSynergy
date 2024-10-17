package laba1;


public class Busco_1 {
	public static double pow(double _double) {
		return Math.pow(_double, 2);
	}
	public static double sinn(double _double) {
		return Math.sin(_double);
	}
	
	public static double coss(double _double) {
		return Math.cos(_double);
	}
	
	
	public static void main(String[] args) {
		double x = 14.26;
		double y = -1.22;
		double z = 3.5 * Math.pow(10, -2);
		double s;
		
		double first = 2*coss(x-2/3);
		double second = 0.5 + pow(sinn(y));
		double third = pow(z) / (3 - (pow(z)/5));
		
		s = (first/second)*(1 + third);
		
	     
		System.out.println(s);
		
	}
}
