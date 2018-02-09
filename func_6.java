import java.util.Scanner;
public class func_6 {
	
	static boolean Prime(int n){               
	   int d = 2;
	   while (d * d <= n && n % d != 0) {
		   d += 1;   
	   }
	   return d*d>n;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(Prime(a)) {
			System.out.println("prime");      
		}else System.out.println("composite");
	}

}
