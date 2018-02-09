import java.util.Scanner;
import java.util.Random;
public class for_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int x;
		int sum=0;
		for(int i=1;i<=100;i++) {
			x=r.nextInt();
			sum+=x;
		}
		System.out.println(sum);
	}

}
