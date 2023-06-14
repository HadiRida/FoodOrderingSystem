package user;


	public class Toppings {

	    private Menu menu;
	    private double topping;

	    Toppings(Menu menu, double topping) {
	        setMenu(menu);
	        setTopping(topping);
	    }

	    public Menu getMenu() {
	        return menu;
	    }

	    public void setMenu(Menu menu) {
	        this.menu = menu;
	    }

	    public double getTopping() {
	        return topping;
	    }

	    public void setTopping(double topping) {
	        this.topping = topping;
	    }

	    public void printtoppings() {
	        System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s" + "%s", menu.getfrommenu((int) topping), "||", +menu.getPrice((int) topping), "$"));
	        System.out.println("\t\t\t--------------------------------------------");
	        if (topping >= 1 && topping <= 4) {
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "1- Mozzarella", "||", "2$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "2- Cheddar", "||", "1.5$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "3- Extra Beef", "||", "3$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "4- Beef bacon", "||", "2$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "5- Coleslow", "||", "1$"));
	        }
	        if (topping > 4 && topping <= 8) {
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "6- Avocado sauce", "||", "2$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "7- Mozzarella", "||", "1.5$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "8- Hot sauce", "||", "3$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "9- garlic sauce", "||", "2$"));
	            System.out.println(String.format("\t\t\t%-15s" + "%10s" + "%10s", "10- bbq sauce", "||", "1$"));
	        }
	    }

	    public double getToppingPrice(int num) {
	        return switch (num) {
	            case 1 ->
	                2.0;
	            case 2 ->
	                1.5;
	            case 3 ->
	                3.0;
	            case 4 ->
	                2.0;
	            case 5 ->
	                1.0;
	            case 6 ->
	                2.0;
	            case 7 ->
	                1.5;
	            case 8 ->
	                3.0;
	            case 9 ->
	                2.0;
	            case 10 ->
	                1.0;
	            default ->
	                0.0;
	        };
	    }

	    public String getToppingName(int num) {
	        return switch (num) {
	            case 1 ->
	                "MOZZARELLA";
	            case 2 ->
	                "CHEDDAR";
	            case 3 ->
	                "BEEF";
	            case 4 ->
	                "BACON";
	            case 5 ->
	                "COLESLAW";
	            case 6 ->
	                "AVOCADO SAUCE";
	            case 7 ->
	                "MOZARELLA";
	            case 8 ->
	                "HOT SAUCE";
	            case 9 ->
	                "GARLIC SAUCE";
	            case 10 ->
	                "BBQ SAUCE";
	            default ->
	                "INVALID";
	        };
	    }
	}

