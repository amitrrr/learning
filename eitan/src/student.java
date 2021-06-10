import java.util.Scanner;
public class student
{
	private int Mathgrade, Siencegrade, Englishgrade;
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	System.out.println("What is your name?");
	String Name = myObj.nextLine();
	System.out.println("Is your age above 18?");
	Boolean Aboveighteen = myObj.nextBoolean();
	grades grd = new grades();
	int m = grd.grade("math");
	int e = grd.grade("English");
	int s = grd.grade("Sience");
	
	float avr = (float) (m+e+s)/3;
	System.out.println("your Name is " + Name);
	System.out.println("your avarage grade is " + avr);
	if (Aboveighteen == true)
	{
		System.out.println("you are not in school");
	}
	else
	{
		System.out.println("you are in school");
	}
	 }
	 
}

class grades
{

	
	static int grade(String s) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("What is you grade in " + s);
		int i = myObj1.nextInt();
		return i;
		
	  }
}