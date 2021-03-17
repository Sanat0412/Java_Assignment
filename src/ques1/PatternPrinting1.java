/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Mar-21
 *   Time: 3:03 PM
 *   File: PatternPrinting1.java
 */

package ques1;

import java.util.Scanner;

public class PatternPrinting1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines :- ");
        int numberOfLines= sc.nextInt();
        printPattern(numberOfLines);
    }
    private static void printPattern(int numberOfLines) {
        for (int i = 1; i <=numberOfLines; i++) {
            for (int i1 = 0; i1 < numberOfLines - i; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

