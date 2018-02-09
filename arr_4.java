import java.util.Scanner;
public class arr_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				count++;
			}
		}
		System.out.println(count+" ");
	}
}
