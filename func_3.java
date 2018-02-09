import java.util.*;
public class func_3 {
	
	static int Xor (int x, int y) {
		int t=0;
		if(x==1 && y==0) {
			t=1;
		}
		else if(x==0 && y==1) {
			t=1;
		}
		else if((x==1 && y==1)||(x==0 && y==0)) {
			t=0;
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(Xor(x,y));
	}

}
