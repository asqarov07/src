import java.util.*;
public class rec_1 {
	static int fib(int n) {
		if(n==0) return 0;
		if(n==1)return 1;
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(fib(a));
	}
}
