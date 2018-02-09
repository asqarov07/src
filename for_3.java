import java.util.*;
public class for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
			for(int i=a;i<=b;i++) {
				for(int j=0;j<=b/2;j++) {
					if(i==j*j) {
						System.out.println(i+" ");
					}
				}
			}
	}

}
