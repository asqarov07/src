import java.util.*;
public class func_2 {

	static double power (double a, int n) {
		double result=Math.pow(a, n);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		int n=sc.nextInt();
		System.out.println(power(a,n));
	}

}
