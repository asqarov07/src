import java.util.*;
public class func_1 {
	
	static int min(int a, int b, int c, int d){
		return Math.min(Math.min(a,b), Math.min(c,d));
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    System.out.print(min(a,b,c,d));

	}

}