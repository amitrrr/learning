	import java.util.Scanner;
public class targil {
	public static int Number(int x) 
	{
		int sum=0;
		while(x>0) 
		{
			if(x%2==1) {
				sum++;
			}
			x/=2;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter 1 number");
	int x = sc.nextInt();
	System.out.println(Number(x));
	}
}
