import java.util.Scanner;
public class while_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int k=0;
		while(i<n) {
			i*=2;
			k+=1;
		}
		System.out.println(k+" ");
	}
}
