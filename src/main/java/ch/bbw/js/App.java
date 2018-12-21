package ch.bbw.js;

import static javafx.application.Application.launch;

/**
 * App
 * @Author Joel Sahli
 * @Version 1.0
 */

public class App{
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        int val1 = 5;
        int val2 = 10;

        //add
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(val1 + "/" + val2 + "= " + calculator.summe(val1, val2) );
        System.out.println("");

        //subtract
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(val1 + "-" + val2 + "= " + calculator.subtraction(val1, val2) );
        System.out.println("");

        //multiply
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(val1 + "*" + val2 + "= " + calculator.multiplikation(val1, val2) );;
        System.out.println("");

        //divide
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(val1 + "/" + val2 + "= " + calculator.division(val1, val2) );
        System.out.println("");

    }
}








