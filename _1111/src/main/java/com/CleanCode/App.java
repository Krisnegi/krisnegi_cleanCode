package com.CleanCode;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner clientInput=new Scanner(System.in);
        System.out.println( "Enter principle in Rs:" );
        float principle=clientInput.nextFloat();
        System.out.println( "Enter rate per annum:" );
        float ratePerAnnum=clientInput.nextFloat();
        System.out.println( "Enter time in years:" );
        float timeInYears=clientInput.nextFloat();
        System.out.println( "Enter 'SI' to calculate Sam's Simple Interest or,\nEnter 'CI' to calculate Sam's Compound Interest :" );
        String interestType=clientInput.next();
        if(interestType.equals("SI")) {
            SimpleInterest simpleInterestOfSam = new SimpleInterest(principle, ratePerAnnum, timeInYears);
            System.out.printf("Simple Interest : %f",simpleInterestOfSam.calculateSimpleInterest());
        }
        else if(interestType.equals("CI")) {
           CompoundInterest compoundInterestOfSam = new CompoundInterest(principle, ratePerAnnum, timeInYears);
           System.out.println("Enter 1,2 or 3 to calculate Sam's compound interest on yearly/half-yearly/quaterly basis :");
           int compoundInterestPeriod=clientInput.nextInt();
           switch(compoundInterestPeriod)
           {
               case 1:
                   System.out.printf("Compound Interest : %f",compoundInterestOfSam.calculateCompoundInterestYearly());
                   break;
               case 2:
                   System.out.printf("Compound Interest : %f",compoundInterestOfSam.calculateCompoundInterestHalfYearly());
                   break;
               case 3:
                   System.out.printf("Compound Interest : %f",compoundInterestOfSam.calculateCompoundInterestQuaterly());
                   break;
               default:
                   System.out.println("Invalid Input");
           }
        }
        else
            System.out.println("Invalid Input");
    }
}
