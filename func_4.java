import java.util.Scanner;
public class func_4 {
	
	static int Election (int x, int y, int z) {
		int t=0;
		if((x==0 && y==0 && z==0)||(x==1 && y==0 && z==0)||(x==0 && y==1 && z==0)||(x==0 && y==0 && z==1)) {
			t=0;
		}
		else if((x==1 && y==1 && z==1)||(x==1 && y==1 && z==0)||(x==0 && y==1 && z==1)||(x==1 && y==0 && z==1)) {
			t=1;
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(Election(x,y,z));
	}

}
