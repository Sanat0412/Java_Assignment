/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Mar-21
 *   Time: 7:21 PM
 *   File: Execution.java
 */

package ques2;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store st = new Store();
        int input = 0;
        System.out.print("Enter Your budget : ");
        int budget = sc.nextInt();
        if (budget >= 1) {
            show();
            input = sc.nextInt();
            while (true) {
                switch (input) {
                    case 1:
                        System.out.print("Enter the product : ");
                        String name = sc.next();
                        System.out.print("Enter the quantity : ");
                        int quantity = sc.nextInt();
                        System.out.print("Enter the price : ");
                        int price = sc.nextInt();
                        if ( budget - price>=1) {
                            budget = budget - price;
                            st.addItemInlist(name,price,quantity);
                        }
                        else{
                            System.out.println("Can't Buy the product ###(because budget left is "+budget+ " )");
                        }
                        break;
                    case 2:
                        st.print();
                        System.exit(0);
                        break;
                }
                show();
                input= sc.nextInt();
            }
        } else {
            System.out.println("Budget is low");
            System.exit(0);
        }
    }
    private static void show() {
        System.out.println("1. Add item : ");
        System.out.println("2. Exist : ");
        System.out.print("Enter your choice : ");
    }
}

