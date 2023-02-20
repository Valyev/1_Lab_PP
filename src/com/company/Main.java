package com.company;
import java.util.Scanner;

/**Main class of program*/
public class Main {

    public static void main(String[] args) {


        Scanner SuperScan3000 = new Scanner(System.in);  /* Create a Scanner object*/
        boolean tries = false; /* checker for a valid variable */
        System.out.println("Enter length");
        String len = SuperScan3000.nextLine();  /* Read user input for length*/


        try { /* checks valid numbers*/
            Integer.parseInt(len);
            tries = true;
        } catch (NumberFormatException e) {
            System.out.println("Enter valid numbers");
        }


        if(tries&&Integer.parseInt(len)<0)/* if number below 0*/
        {
            System.out.print("Length must be bigger than zero");
        }
        else if(tries&&Integer.parseInt(len)>=0)/* if all ok*/
        {

           Lucas_numbers l = new Lucas_numbers(Integer.parseInt(len));

        }


    }

}
