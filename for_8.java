import java.util.Scanner;
import java.util.Random;
public class for_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,n=sc.nextInt();;
		int sum=0;
		for(int i=1;i<=n;i++) {
			x=sc.nextInt();
			sum+=x;
		}
		System.out.println(sum);
	}

}
