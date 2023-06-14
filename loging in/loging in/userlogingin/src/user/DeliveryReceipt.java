package user;

import java.util.ArrayList;

public class DeliveryReceipt extends Receipt {

    private double deliverycharge;

    DeliveryReceipt(ArrayList<String> a, ArrayList<Double> b, ArrayList<String> c, ArrayList<Double> d, String User, double deliverycharge, int orderNumber) {
        super(a, b, c, d, User, orderNumber);
        setDeliverycharge(deliverycharge);
    }

    public double getDeliverycharge() {
        return deliverycharge;
    }

    public void setDeliverycharge(double deliverycharge) {
        this.deliverycharge = deliverycharge;
    }

    public void vehicule(int veichle) {
    		if (veichle == 1) {
            setDeliverycharge(5);
        } else if (veichle == 2) {
            setDeliverycharge(10);
        } else if (veichle == 3) {
            setDeliverycharge(20);
        } else {
            System.out.println("Invalid Entry, Delivery charge set to 20$");
            setDeliverycharge(20);
        }
    }

    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println(String.format("%-35s" + "%s" + "%s", "DELIVERY CHARGE:", deliverycharge, "$"));
        System.out.println(String.format("%-35s" + "%s" + "%s", "TOTAL CHARGE WITH DELIVERY:", super.setSum() + deliverycharge ,"$"));

    }
}
