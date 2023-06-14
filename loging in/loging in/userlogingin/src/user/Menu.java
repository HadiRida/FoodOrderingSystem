package user;
public class Menu {

    public void printMenu() {
        System.out.println("""
                               Menu:
                               Burgers:                                                        Sandwiches:
                               1. Beef burger...........................2.50$         |         5. Crispy Sandwich.......................7.00$
                               2. Chicken burger........................2.50$         |         6. Fransisco Sandwich....................5.80$
                               3. Cheese burger.........................3.00$         |         7. Chicken Sub Sandwich..................5.10$
                               4. Zinger burger.........................5.00$         |         8. Tawook Sandwich.......................6.50$
                               
                               Cold Beverages:                                                  Hot Beverages:
                               9. Fresh juice...........................8.00$         |         14.Coffee................................2.34$
                               10.Ice tea...............................4.50$         |         15.Espresso..............................2.50$
                               11.Coffee Frappe.........................5.00$         |         16.Cappuccino............................4.35$
                               12.Soft Drinks...........................4.00$         |         17.Hot Chocolate.........................4.00$
                               13.Water.................................1.00$         |         18.Tea...................................2.34$
                               
                               Desserts:                                              |          Offers:
                               19.Brownies..............................7.00$         |         24.Hadi Special........................100.00$
                               20.Tiramisu..............................8.00$         |         25.Nidal Special.......................0.01$
                               21.Cake.................................10.00$         |         26.Fawzi Special.........................15.00$
                               22.Muffins...............................6.00$         |         27.Moaad Special.........................1.00$
                               23.Ice Cream.............................4.00$         |         28.Java Special........................15.00$
                               """);
    }

    public String getfrommenu(int num) {
        return switch (num) {
            case 1 ->
                "Beef burger";
            case 2 ->
                "Chicken burger";
            case 3 ->
                "Cheese burger";
            case 4 ->
                "Zinger burger";
            case 5 ->
                "Crispy Sandwich";
            case 6 ->
                "Fransisco Sandwich";
            case 7 ->
                "Chicken Sub Sandwich";
            case 8 ->
                "Tawook Sandwich";
            case 9 ->
                "Fresh juice";
            case 10 ->
                "Ice tea";
            case 11 ->
                "Coffee Frappe";
            case 12 ->
                "Soft Drinks";
            case 13 ->
                "Water";
            case 14 ->
                "Coffee";
            case 15 ->
                "Espresso";
            case 16 ->
                "Cappuccino";
            case 17 ->
                "Hot Chocolate";
            case 18 ->
                "Tea";
            case 19 ->
                "Brownies";
            case 20 ->
                "Tiramisu";
            case 21 ->
                "Cake";
            case 22 ->
                "Muffins";
            case 23 ->
                "Ice Cream";
            case 24 ->
                "Hadi Special";
            case 25 ->
                "Nidal Special";
            case 26 ->
                "Fawzi Special";
            case 27 ->
                "Moaad Special";
            case 28 ->
                "Java Special";
            default ->
                "INVALID";
        };
    }

    public double getPrice(int num) {
        return switch (num) {
            case 1 ->
                2.50;
            case 2 ->
                2.50;
            case 3 ->
                3.00;
            case 4 ->
                5.00;
            case 5 ->
                7.00;
            case 6 ->
                5.80;
            case 7 ->
                5.10;
            case 8 ->
                6.50;
            case 9 ->
                8.00;
            case 10 ->
                4.50;
            case 11 ->
                5.00;
            case 12 ->
                4.00;
            case 13 ->
                1.00;
            case 14 ->
                2.34;
            case 15 ->
                2.50;
            case 16 ->
                4.35;
            case 17 ->
                4.00;
            case 18 ->
                2.34;
            case 19 ->
                7.00;
            case 20 ->
                8.00;
            case 21 ->
                10.00;
            case 22 ->
                6.00;
            case 23 ->
                4.00;
            case 24 ->
                100.00;
            case 25 ->
                0.01;
            case 26 ->
                15.00;
            case 27 ->
                1.00;
            case 28 ->
                15.00;
            default ->
                0.00;
        };

    }
}
