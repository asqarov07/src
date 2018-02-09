import java.util.Scanner;
import java.util.Random;
public class for_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,n=sc.nextInt();;
		int count=0;
		for(int i=1;i<=n;i++) {
			x=sc.nextInt();
			if(x==0) {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
