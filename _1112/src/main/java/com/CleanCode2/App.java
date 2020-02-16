package com.CleanCode2;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner clientInput=new Scanner(System.in);
        System.out.println( "Enter material standard between :- standard/above standard/high standard/high standard and fully automated" );
        String materialStandard=clientInput.nextLine();
        System.out.println("Enter total area of house: ");
        float totalAreaOfHouse=clientInput.nextFloat();
        House houseConstructionCost=new House(materialStandard,totalAreaOfHouse);
        float totalConstructionCost=houseConstructionCost.estimateHouseConstructionCost();
        if(totalConstructionCost<0)
            System.out.println("Invalid material standard input");
        else
            System.out.printf("Total Construction Cost : %f",totalConstructionCost);
    }
}
