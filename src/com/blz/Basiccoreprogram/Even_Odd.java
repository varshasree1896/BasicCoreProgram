package com.blz.Basiccoreprogram;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args){
        //scanner class declaration
        Scanner sc = new Scanner (System.in);
        // input from the user
        System.out.println("enter a number");
        int numb = sc.nextInt();
        //condition for even
        if (numb % 2 == 0)
            System.out.println("even Number");
            //condition for odd
        else
            System.out.println("Odd number");
        //closing scanner class (not compulsory but good practise)
        sc.close();
    }
}
