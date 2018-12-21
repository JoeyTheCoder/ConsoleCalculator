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

        int val1 = 12;
        int val2 = 8;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(val1 + "/" + val2 + "= " + calculator.Summe(val1, val2) );
        System.out.println("");
    }
}








