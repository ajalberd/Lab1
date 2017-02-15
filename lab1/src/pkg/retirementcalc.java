// CISC181 030L Lab Group 1
package pkg;
import java.util.Scanner;
public class retirementcalc 
{
	public static void main(String[] args) 
	{
		askquestions();
		System.out.printf("You need to save $ %.2f throughout your entire career.",whatyouneedsaved);
		System.out.printf("\nYou need to save $ %.2f from now on until retirement.",saveeachmonth);
	}
	public static double askquestions()
	{
		Scanner input = new Scanner(System.in);
		double yearstowork;
		double annualreturn;
		double yearsretired;
		double reqincome;
		double monthlyssi;
		System.out.println("How many years do you have to work?");
		yearstowork=input.nextDouble();
		System.out.println("What is your annual return?");
		annualreturn=input.nextDouble();
		System.out.println("How many years are you planning for your retirment?");
		yearsretired=input.nextDouble();
		System.out.println("What is your required income(per year)?");
		reqincome=input.nextDouble();
		System.out.println("what is your monthly SSI(expected Social Security) income?");
		monthlyssi=input.nextDouble();
		whatyouneedtosave(yearstowork,annualreturn,reqincome,monthlyssi);
	}

	public static double whatyouneedtosave(double yearstowork,double annualreturn,double requincome,double monthlyssi){
		double whatyouneedsaved= 1;
		saveeachmonth(whatyouneedsaved);
		return whatyouneedsaved;
	}
	public static double saveeachmonth(double whatyouneedsaved){
		double saveeachmonth=1;
		return saveeachmonth;
		}
	}

