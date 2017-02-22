// CISC181 030L Lab Group 1
//Andrew Alberding, Jason Anderson, Jonathan Barnes
package pkg;
import java.util.Scanner;
import java.lang.Math;
public class retirementcalc 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double yearstowork;
		double annualreturnwork;
		double annualreturnret;
		double yearsretired;
		double reqincome;
		double monthlyssi;
		
		System.out.println("How many years do you have to work?");
		yearstowork=input.nextDouble();
		System.out.println("What is your annual return for work in decimal form?");
		annualreturnwork=input.nextDouble();
		System.out.println("What is your annual return at retirement in decimal form?");
		annualreturnret=input.nextDouble();
		System.out.println("How many years are you planning for your retirment?");
		yearsretired=input.nextDouble();
		System.out.println("What is your required income(per year)?");
		reqincome=input.nextDouble();
		System.out.println("what is your monthly SSI(expected Social Security) income?");
		monthlyssi=input.nextDouble();
		
		//The following two equations are implementations of the annuity calculator formulas. 
		double whatyouneedsaved = ((reqincome-monthlyssi)*12)*((1-(Math.pow(1+annualreturnret,-yearsretired)))/annualreturnret);
		double saveeachmonth = whatyouneedsaved*((annualreturnwork/12)/(Math.pow(1+(annualreturnwork/12),yearstowork*12)-1));
		System.out.printf("You need to save $ %.2f throughout your entire career.",whatyouneedsaved);
		System.out.printf("\nYou need to save $ %.2f every month until retirement.",saveeachmonth);
	}
	
}

