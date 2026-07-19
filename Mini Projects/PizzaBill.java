import java.util.*;
public class PizzaBill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE PIZZA PLACE:");
        System.out.println("Menu:");
        System.out.println("======== PIZZA MENU ========\n" +
                "\n" +
                "1. Small   - ₹199\n" +
                "2. Medium  - ₹299\n" +
                "3. Large   - ₹399");
        System.out.println();
        System.out.println("Extra Cheese      +₹50\n" +
                "Extra Toppings    +₹80\n" +
                "Garlic Bread      +₹120\n" +
                "Cold Drink        +₹60");
        System.out.println();

        System.out.print("Which size do you want: ");
        String pizza = sc.next().toLowerCase();
        System.out.print("Extra Cheese? (Y/N): ");
        String cheese=sc.next();
        System.out.print("Extra Toppings? (Y/N): ");
        String toppings= sc.next();
        int bill=0;
        switch(pizza){
            case "small":
                bill+=199;
                break;
            case "medium":
                bill+=299;
                break;
            case "large":
                bill+=399;
                break;
            default:
                System.out.println("Invalid Pizza Size!");
                return;
        }

        if (cheese.equalsIgnoreCase("y")) {
            bill += 50;
        }
        if (toppings.equalsIgnoreCase("y")) {
            bill += 80;
        }
        System.out.println("Your total bill is: "+bill);
    }

}
