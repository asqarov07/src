import java.util.Scanner;
public class for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
