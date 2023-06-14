package user;

import java.util.ArrayList;
import java.util.Scanner;

public class UserAuthenticator {
    public static void main(String[] args) {

    	
    
        Scanner input = new Scanner(System.in);
        int orderNumber = 0;
        int i;
        String User = "INVALID";
        ArrayList<String> order = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<Double> toppingprice = new ArrayList<Double>();
        ArrayList<String> toppingname = new ArrayList<String>();
        Menu menu = new Menu();
        int option = 0;
        int enter;
        
        System.out.println("---------------------------------------------FOOD ORDERING SYSTEM----------------------------------------------\n");
       
        System.out.println("----------------------------------------Object Oriented Burger Resturant---------------------------------------\n");


        
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter 'R' to register a new user, or 'A' to authenticate an existing user: ");
        String choice = input1.nextLine();
        if (choice.equalsIgnoreCase("R")) {
            System.out.print("Enter username: ");
            String username = input1.nextLine();
            System.out.print("Enter password: ");
            String password = input1.nextLine();
            UserRegistration registration = new UserRegistration(username, password);
            registration.registerUser();
        } else if (choice.equalsIgnoreCase("A")) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
            UserAuthentication authentication = new UserAuthentication(username, password);
            authentication.authenticateUser();
        } else {
            System.out.println("Invalid choice. Please enter 'R' to register or 'A' to authenticate.");
        }
        
        
     
        int newOrder = 0;
        while (newOrder != -1) {
            orderNumber++;
            while (option != -1) {
                System.out.print("To add an item from the menu press 1, to delete an item from the order press 2: ");
                i = input1.nextInt();

                if (i == 1) {
                    menu.printMenu();
                    System.out.print("Enter a number availble in the menu: ");
                    enter = input1.nextInt();
                    while ("INVALID".equals(menu.getfrommenu(enter))) {
                        System.out.print("INVALID ENTRY, PLESE TRY AGAIN: ");
                        enter = input1.nextInt();

                    }
                    order.add(menu.getfrommenu(enter));
                    price.add(menu.getPrice(enter));
                    if (enter >= 1 && enter <= 8) {
                        System.out.print("Do you want any extra toppings?(-1 for no): ");
                        int topchoice = input1.nextInt();
                        if (topchoice != -1) {
                            int topoption = 0;
                            while (topoption != -1) {
                                Toppings top = new Toppings(menu, enter);
                                top.printtoppings();
                                System.out.print("Enter what do you want: ");
                                int topinput = input1.nextInt();

                                if (topinput < 1 && topinput > 8) {
                                    System.out.print("INVALID,PLEASE TRY AGAIN: ");
                                    topinput = input1.nextInt();
                                } else {
                                    toppingprice.add(top.getToppingPrice(topinput));
                                    toppingname.add(top.getToppingName(topinput));
                                    System.out.print("Do you want more toppings?(-1 for no): ");
                                    topoption = input1.nextInt();
                                }

                            }

                        }
                    }

                    System.out.print("Do you want to continue? (-1 for no): ");
                    option = input1.nextInt();
                } else if (i == 2) {
                    if (order.isEmpty()) {
                        System.out.println("YOU DID NOT ORDER ANYTHING.");
                        i = 1;
                    } else {
                        System.out.println(String.format("%-15s" + "%s" + "%20s" + "%18s" + "%10s", "Number", "||", "Food", "||", "Cost"));
                        System.out.println("-------------------------------------------------------------------------");
                        for (int d = 0; d < order.size(); d++) {
                            System.out.println(String.format("%-15s" + "%s" + "%25s" + "%13s" + "%10s" + "%s", d, "||", order.get(d), "||", price.get(d), "$"));
                        }
                        System.out.print("Which Item would you like to remove ?: ");
                        int r = input1.nextInt();
                        while (r >= order.size()) {
                            System.out.print("INVALID NUMBER, TRY AGAIN: ");
                            r = input1.nextInt();
                        }
                        if (r <= order.size()) {
                            order.remove(r);
                            price.remove(r);
                        }
                        System.out.print("Do you want to continue? (-1 for no): ");
                        option = input1.nextInt();
                    }
                }
            }
            System.out.print("DO YOU WANT THE ORDER DINE IN OR DELIVERY?(1 FOR DINE IN,2 FOR DELIVERY):");
            int dord = input1.nextInt();
            while (dord != 1 && dord != 2) {
                System.out.print("INVALID,TRY AGAIN: ");
                dord = input1.nextInt();
            }
            if (dord == 1) {
                Receipt receipt = new Receipt(order, price, toppingname, toppingprice, User, orderNumber);
                receipt.printReceipt();
            } else if (dord == 2) {
                System.out.println("WHERE DO YOU WANT THE ORDER TO BE DELIVERED:\n1)BEIRUT\n2)NEAR BEIRUT\n3)OUTSIDE BEIRUT");
                int place = input1.nextInt();
                if (place == 1) {
                    DeliveryReceipt delivery = new DeliveryReceipt(order, price, toppingname, toppingprice, User, 5, orderNumber);
                    delivery.printReceipt();
                } else if (place == 2) {
                    DeliveryReceipt delivery = new DeliveryReceipt(order, price, toppingname, toppingprice, User, 10, orderNumber);
                    delivery.printReceipt();
                } else if (place == 3) {
                    DeliveryReceipt delivery = new DeliveryReceipt(order, price, toppingname, toppingprice, User, 20, orderNumber);
                    delivery.printReceipt();
                } else {
                    System.out.print("INVALID ENTRY,TRY AGAIN: ");
                    place = input1.nextInt();
                }
            }
            option = 0;
            order.clear();
            price.clear();
            toppingprice.clear();
            toppingname.clear();
            System.out.println("Do you want a new order? (-1 for NO)");
            newOrder = input1.nextInt();
        }
    }

        
 }
