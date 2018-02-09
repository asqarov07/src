import java.util.*;
public class for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%d==c) {
				System.out.println(i+" ");
			}
		}
	}

}
