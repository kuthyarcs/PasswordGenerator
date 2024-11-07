package pkg1;
public class Test3 {
	public static double convertC2F(double temp) {
		double tempc=temp;
		double tempf=0.0;
		tempf=tempc*(9.0/5.0) + 32.0;
		return tempf;
	}
	public static void main(String[] args) {
		System.out.print("Temp 0C is ");
		System.out.println(convertC2F(0.0));
		
		System.out.print("Temp 100C is ");
		System.out.println(convertC2F(100.0));
		
		
		
		
		
	}
}
