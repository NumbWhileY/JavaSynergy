package helloapp;


public class Program {
	public static void main(String[] args) {
		double x = 14.26;
		double y = -1.22;
		double z = 3.5 * Math.pow(10,-2);
		
		double s = ((Math.cos(x - 2/3)/0.5) + Math.sin(y*y))*(1+(z*z)/(3-z)/5);
		
		System.out.println(s);
	}
	
	
}

