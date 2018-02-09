import java.util.Scanner;
import java.util.Random;
public class for_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,n=sc.nextInt();;
		int countZero=0;
		int countGZ=0;
		int countLZ=0;
		for(int i=1;i<=n;i++) {
			x=sc.nextInt();
			if(x==0) {
				countZero+=1;
			}else if(x>0) {
				countGZ+=1;
			}else if(x<0) {
				countLZ+=1;
			}
		}
		System.out.println(countZero+" "+countGZ+" "+countLZ);
	}
}
