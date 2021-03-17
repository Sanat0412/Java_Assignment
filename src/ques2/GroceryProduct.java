/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Mar-21
 *   Time: 7:06 PM
 *   File: GroceryProduct.java
 */

package ques2;

import java.util.ArrayList;

public class GroceryProduct {
    public String name;
    public int price;
    public int quantity;
    ArrayList<GroceryProduct>  groceryList;

    public GroceryProduct(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        addItemInlist(this.name,this.price,this.quantity);
    }

    public void addItemInlist(String name, int price, int quantity) {
        for (Object o : groceryList) {
            if(((GroceryProduct) o).name.equalsIgnoreCase(name)){
                ((GroceryProduct) o).price=((GroceryProduct) o).price+price;
                ((GroceryProduct) o).quantity=((GroceryProduct) o).quantity+quantity;
            }
            else{
                groceryList.add(new GroceryProduct(name,price,quantity));
            }
        }
    }

    public void print(){
        if(!groceryList.isEmpty()){
            for (GroceryProduct groceryProduct : groceryList) {
                System.out.println("Name "+groceryProduct.name);
                System.out.println("Price "+groceryProduct.price);
                System.out.println("Quantity "+groceryProduct.quantity);
            }
        }
    }

}

