import java.util.Scanner;
public class while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			i+=1;
			if(n%i==0) {
				System.out.println(i+" ");
				break;
			}
		}
	}
}
