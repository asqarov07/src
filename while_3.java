import java.util.Scanner;
public class while_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i+" ");
			i*=2;
		}
	}
}
