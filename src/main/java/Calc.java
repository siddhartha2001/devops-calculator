import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.lang.Math;
public class Calc {
    private static final Logger logger = LogManager.getLogger(Calc.class);
    public double sqrt(int x) {
        logger.info("Square root of " + x + " "+ Math.sqrt(x));
        return Math.sqrt(x);
    }
    public double fct(int x) {
        double fac = 1;
        for (int i = 2; i <= Math.floor(x); i++) {
            fac = fac * i;
        }
        logger.info("Factorial of " + x + " " + fac);
        return fac;
    }
    public double pwr(int x, int y) {
        logger.info("Power of " + x + ", exponent " + y + Math.pow(x,y));
        return Math.pow(x, y);
    }
    public double log(double x) {
        logger.info("log of " + x + " " + Math.log(x));
        return Math.log(x);
    }
    public void printMenu() {
        System.out.println("Select the desired operation");
        System.out.println("1-Square Root, 2-Factorial, 3-Power, 4-Log, 5-Exit");
    }
}

class Main{
    public static void main(String[] args)
    {
        Calc calc = new Calc();
        Scanner scan = new Scanner(System.in);
        calc.printMenu();

        int menu = scan.nextInt();

        while(menu != 5)
        {
            if(menu == 1)
            {
                System.out.println("Enter no:");
                int n = scan.nextInt();
                System.out.println("Square root of " + n + " is: " + calc.sqrt(n));
            }

            else if(menu == 2)
            {
                System.out.println("Enter no:");
                int n = scan.nextInt();
                System.out.println("Factorial of " + n + " is: " + calc.fct(n));
            }

            else if(menu == 3)
            {
                System.out.println("Enter no:");
                int n = scan.nextInt();
                System.out.println("Enter exponent:");
                int e = scan.nextInt();
                System.out.println("Power of " + n + " with exponent " + e + " is: " + calc.pwr(n, e));
            }

            else if(menu == 4)
            {
                System.out.println("Enter no:");
                double n = scan.nextDouble();
                System.out.println("Logarithm of " + n + " is: " + calc.log(n));
            }

            else if(menu > 5){
                System.out.println("Invalid input. Choose from the numbers given");
            }

            calc.printMenu();
            menu = scan.nextInt();
        }
    }
}