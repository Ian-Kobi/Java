//Compound Interest Calculator Project 1
//Ian Kobi
//SFSU ID 922237066
//CSC 210 W 4:00PM-6:40PM

import java.util.Scanner;

public class CompoundInterest {

    double P = 1;
    double r = (1/100.00);
    static double t = 1;
    static double n = 1;
    double baseA = P*(1+(r/n));
    double baseB = (n*t);

    double A = Math.pow(baseA,baseB);




    CompoundInterest(){

    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount deposited this year:");
        double P = input.nextDouble();
        System.out.println("Enter the yearly interest rate:");
        double ir = input.nextDouble();
        System.out.println("Enter the income tax rate:");
        double itx = input.nextDouble();

        double r = ir/100.00;

        double baseA = P*(1+r/n);
        double baseB = (n*t);

        double A = Math.pow(baseA,baseB);
        double Atx = (A-P)*(1-(itx/100.00));



        System.out.println("The amount of interest earned this year is "+Atx);



        // CompoundInterest Calc1 = new CompoundInterest();
        // System.out.println(Calc1.A);
    }
}
