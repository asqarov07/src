import java.util.Scanner;
public class func_5 {

	static double pow(int a,int n) {
		double c=0;
		if(n==0) {
			c=1;
		}else if(n<0) {
			c=(int) (1/pow(a,Math.abs(n)));
		}else {
			c=(int) (a*pow(a,n-1));
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(pow(a,n));
	}
}
