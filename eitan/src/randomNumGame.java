import java.util.Random;
import java.util.Scanner;
public class randomNumGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int a,lives=3,guess,round=1,n=10;
		
		while(round<4) {
			a=r.nextInt(n*round);
			System.out.println("please guess a number beetween 0 to "+(n*round));
			while(lives>0) 
			{
				if((guess=s.nextInt())==a) 
				{
					System.out.println("you won!");
					lives=0;
				}
				else if(guess>a) {
					if(lives==1) 
					{
						System.out.println("you lost");
						return;
					}
					else
						System.out.println("the number is too high, guess again");
					lives--;
				}
				else  {
					if(lives==1) 
					{
						System.out.println("you lost");
						return;
					}
					else
						System.out.println("the number is too low, guess again");
					lives--;
				}
			}
			round++;
			lives=3;
		}
		
		
	}
}
