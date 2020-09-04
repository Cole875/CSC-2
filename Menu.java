//Cole Tambaro 9/4/2020
//Project 1: Menu
import java.util.Scanner;
public class Menu {

    public static void main(String[] args){
        //Prompt 1: Based off the italian restaurant Bar Pitti NY NY.
        System.out.println("Welcome to Bar Pitti. What would you like to order?\n" +
        "1. Tonno roast loin of pork, rosemary, garlic, lettuce, tomatoes & mayonnaise 9.50\n" +
                "2. Polpettine veal meatballs, mozzarella and tomatoes 9.50\n" +
                "3. Penne Strascicate meat sauce 14.50\n" +
                "4. Fettunta grilled country bread with garlic, olive oil 4.50\n" +
                "5. Gelato Sorbetto 7.00\n" +
                "What item would you like to order?");


        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        float price= 0;
        if(order == 1) {
            System.out.println("Tonno 9.50");
            price =(float) 9.5;
        }
        if(order == 2) {
            System.out.println("Polpettine 9.50");
            price = (float)9.5;
        }
        if(order == 3) {
            System.out.println("Penne Strascicate 14.50");
            price = (float) 14.5;
        }
        if(order == 4) {
            System.out.println("Fettunta 4.50");
           price = (float) 4.5;
        }
        if(order == 5) {
            System.out.println("Gelato Sorbetto 7.00");
            price = (float) 7.0;
        }
        //Prompt 2: Delivery
        System.out.println("Would you like to pickup(1) or have your food be delivered?(2)");
        float tax = (float) (price * .06);
        float total = price + tax;
        int del = sc.nextInt();

        if(del == 1){
            System.out.println("Your total is " + total);
        }
        if(del == 2){

            total+= 4.99;
            System.out.println("Your total is " + total);

        }
        //Prompt 3: Tipping
        System.out.println("Would you like to leave a tip?\n"+
                "(1): tip 0%\n" +
                "(2): tip 10%\n" +
                "(3): tip 15%\n" +
                "(4): tip 20");
        int tip = sc.nextInt();
        float tip_p;
        //Final Totalling
        if(tip == 1){
            System.out.println("Your total is "+ total);
        }
        if(tip == 2){
            tip_p =(float) .1;
            total+=price * tip_p;
            System.out.println("Your tota1 is " + total);
        }
        if(tip == 3){
            tip_p =(float) .15;
            total+=price * tip_p;
            System.out.println("Your total is " + total);
        }
        if(tip == 4){
            tip_p =(float) .2;
            total+=price * tip_p;
            System.out.println("Your total is "+ total);
        }
        //If you are ever in NY I highly suggest going to Bar Pitti.
    }


}
