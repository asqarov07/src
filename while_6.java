import java.util.Scanner;
public class while_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble(),y=sc.nextDouble();
		int i=1;
		while(x<y) {
			x*=1.1;
			i+=1;
		}
		System.out.println(i+" ");
	}

}
