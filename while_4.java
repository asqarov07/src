import java.util.Scanner;
public class while_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i= 0;
		while (n>=1) {
			i += n % 2;
			n /= 2;
		}
		if (i == 1) System.out.println("YES");
		else System.out.println("NO");
	}
}
