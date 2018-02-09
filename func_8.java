import java.util.*;
public class func_8 {

	static int fib(int n)
	{
	  if (n <= 2) return 1;
	  int x = 1;
	  int y = 1;
	  int ans = 0;
	  for (int i = 2; i <= n; i++){
	    ans = x + y;
	    x = y;
	    y = ans;
	  }
	  return ans;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}

}
