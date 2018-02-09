import java.util.Scanner;
public class arr_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        String s = "NO";
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n-1; i++){
            if((arr[i]>0&&arr[i+1]>0)||(arr[i]<0&&arr[i+1]<0)){
                s="YES";
            }
        }
        System.out.print(s);
	}
}

