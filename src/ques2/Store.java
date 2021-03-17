/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Mar-21
 *   Time: 8:50 PM
 *   File: Store.java
 */

package ques2;
import java.util.ArrayList;

public class Store {
    ArrayList<GroceryProduct> groceryList= new ArrayList<>();

    public Store() {
    }

    public void addItemInlist(String name, int price, int quantity) {
        if(!groceryList.isEmpty()){
            for (GroceryProduct o : groceryList) {
                if(o.name.equalsIgnoreCase(name)){
                    o.price=o.price+price;
                    o.quantity=o.quantity+quantity;
                }
                else{
                    groceryList.add(new GroceryProduct(name,price,quantity));
                }
            }
        }
        else{
            groceryList.add(new GroceryProduct(name,price,quantity));
        }
    }

    public void print(){
        if(!groceryList.isEmpty()){
            System.out.printf("%-15s %-15s %-15s\n","Product Name","Qunatity","Price");
            for (GroceryProduct o : groceryList) {
                System.out.printf("%-15s %-15d %-15d\n",o.name,o.quantity,o.price);
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
}

