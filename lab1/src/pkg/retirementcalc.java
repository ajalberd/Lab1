package pkg;
import java.util.Scanner;
public class retirementcalc 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double yearstowork;
		double annualreturn;
		double yearsretired;
		double reqincome;
		double monthlyssi;
		double whatyouneedsaved=1;
		double saveeachmonth=1;
		System.out.println("How many years do you have to work?");
		yearstowork=input.nextDouble();
		System.out.println("What is your annual return?");
		annualreturn=input.nextDouble();
		System.out.println("How many years until retirement?");
		yearsretired=input.nextDouble();
		System.out.println("What is your required income(per year)?");
		reqincome=input.nextDouble();
		System.out.println("what is your monthly SSI(expected Social Security) income?");
		monthlyssi=input.nextDouble();
		//whatyouneedsaved=some formula I can't find on the internet right now
		//saveeachmonth= some formula I can't find on the internet right now
		System.out.printf("You need to save $ %.2f throughout your entire career.",whatyouneedsaved);
		System.out.printf("\nYou need to save $ %.2f from now on until retirement.",saveeachmonth);
	}

}
