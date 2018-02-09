import java.util.Scanner;
public class while_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble(),p=sc.nextDouble(),y=sc.nextDouble();
	    int i = 0;
	    while (x<y) {
	    	x *= (1 + p/100.0);
		    x *= 100;
		    x = (int) x;
		    x /= 100;
		    i++;
		  }
		  System.out.println(i+""); 
	}
}
