
package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.Scanner;

public class CalcApp {

    private static final Logger logger = LogManager.getLogger(CalcApp.class);
    private static final Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int exit = 1;
        while(exit != 0){
        System.out.println("Enter first num");
        double i = sc.nextDouble();
        logger.debug("Entered first num " + i);
            System.out.print("Enter operation: ");
            String k = sc.next();
            logger.debug("Entered char " + k);
        System.out.println("Enter second num");
        double j = sc.nextDouble();
        logger.debug("Entered second num " + j);

        switch (k) {
            case "+":
                i = getSum(i, j);
                break;
            case "-":
                i = getSub(i, j);
                break;
            case "*":
                i = getMultiple(i, j);
                break;
            case "/":
                if (j == 0) {
                    logger.error("can't divide by zero");
                    i = 0;
                } else {
                    i = getDivide(i, j);
                }
                break;
        }
        logger.debug("result  " + i);
        System.out.println(i);
            System.out.println("Enter 0 to exit, or 1 to continue");
            exit = sc.nextInt();

            sc.nextLine();

    }}

    public static double getSum(double x, double y) {
        return x + y;
    }

    public static double getDivide(double x, double y) {
        return x / y;
    }

    public static double getMultiple(double x, double y) {
        return x * y;
    }

    public static double getSub(double x, double y) {
        return x - y;
    }

}




