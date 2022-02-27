package com.blz.Basiccoreprogram;
import java.util.Scanner;

public class Vowels_Consotants {
    boolean isConsonant = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Use Scanner to read letters
        System.out.println("Enter only Lowercase character");
        String inputChar = sc.next();
        Vowels_Consotants char1 = new Vowels_Consotants();
        char1.check(inputChar);
        char1.display();
    }

    private void check(String inputChar) {
        String[] arr = {"a", "e", "i", "o", "u"}; // Create array to list out vowels
        // Check vowel or consonant
        for (String vowel : arr) {
            if (inputChar.equals(vowel)) {
                isConsonant = false;
                break;
            }
        }
    }

    private void display() {
        if (isConsonant == true) {
            System.out.println("It is Consonant");
        } else {
            System.out.println("It is vowel");
        }
    }

}
