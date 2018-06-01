package com.company;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class rainfallCalculator {

    public static void main(String[] args) {

        //varialbes to hold length of roof top
        double lengthRoofTop;
        //varible to hold width of the roof top
        double widthRoofTop;
        //varible to hold inches of a rainfall
        double inchesOfRainfall;

        //varible to hold length of roof top in inches
        double lengthRoofTopInInches;;

        //varible to hold width of the roof top in inches
        double widthRoofTopInInches;;

        //varible to hold rainfall in gallon
        double rainfallInGallon;

        // creating scanner object
    Scanner input= new Scanner(System.in);
    System.out.println("please Enter the lengh of the roof in feet");
        lengthRoofTop= input.nextDouble();
    System.out.println("please Enter the width of the roof in feet");
        widthRoofTop= input.nextDouble();
     System.out.println("please Enter the amount of rainfall in inches");
        inchesOfRainfall= input.nextDouble();

        // converting the length and width of the roof top to inches
        lengthRoofTopInInches=lengthRoofTop*12;
        widthRoofTopInInches=widthRoofTop*12;

        rainfallInGallon=(lengthRoofTopInInches*widthRoofTopInInches*inchesOfRainfall)/231;
        System.out.printf("The total amount of runs off from the roof  in Gallon is %f", rainfallInGallon);
    }
}
