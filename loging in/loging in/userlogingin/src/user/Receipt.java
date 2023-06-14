package user;


import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Receipt {

    private ArrayList<String> a = new ArrayList<>();
    private ArrayList<Double> b = new ArrayList<Double>();
    private ArrayList<String> c = new ArrayList<>();
    private ArrayList<Double> d = new ArrayList<Double>();
    private int orderNumber;
    private String User;

    Receipt(ArrayList<String> a, ArrayList<Double> b, ArrayList<String> c, ArrayList<Double> d, String User, int orderNumber) {
        setA(a);
        setB(b);
        setUser(User);
        setC(c);
        setD(d);
        setOrderNumber(orderNumber);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public void setC(ArrayList<String> c) {
        this.c = c;
    }

    public ArrayList<Double> getD() {
        return d;
    }

    public void setD(ArrayList<Double> d) {
        this.d = d;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    public ArrayList<Double> getB() {
        return b;
    }

    public void setB(ArrayList<Double> b) {
        this.b = b;
    }

    public double setSum() {
        double sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = sum + (double) b.get(i);
        }
        for (int i = 0; i < c.size(); i++) {
            sum = sum + (double) d.get(i);
        }
        return sum;
    }

    public void printReceipt() {
        System.out.println("       Object Oriented Burger Resturant               ");
        System.out.println("ORDER #" + orderNumber + "\n"
                + "TELEPHONE: 81-867-632");
        System.out.println("------------------------------------------");
        System.out.println("STAFF : " + User);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Date :" + formatter.format(date));
        System.out.println("------------------------------------------");
        System.out.println(String.format("%-35s" + "%s", "DESCRIPTION", "AMOUNT"));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(String.format("%-35s" + "%s" + "%s", a.get(i), b.get(i), "$"));
        }
        if (c.size() != 0) {
            System.out.println("------------------------------------------");
            System.out.println(String.format("%-35s" + "%s", "TOPPINGD ADDED", "AMOUNT"));
            for (int i = 0; i < c.size(); i++) {
                System.out.println(String.format("%-35s" + "%s" + "%s", c.get(i), d.get(i), "$"));
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("NUMBER OF ITEMS: " + a.size());
        System.out.println("------------------------------------------");
        System.out.println(String.format("%-35s" + "%s" + "%s", "TOTAL:", setSum(), "$"));
        toFile(formatter, date);
    }

    public void toFile(SimpleDateFormat formatter, Date date) {
        String path = System.getProperty("user.dir") + ".\\src\\user\\Receipt.txt";
        String text = "\n\n\n       Object Oriented Burger Resturant                \n"
                + "ORDER #" + orderNumber + "\n"
                + "TELEPHONE: 81-867-632\n"
                + "------------------------------------------\n"
                + "STAFF : " + User + "\n"
                + "Date :" + formatter.format(date) + "\n"
                + "------------------------------------------\n"
                + String.format("%-35s" + "%s", "DESCRIPTION", "AMOUNT") + "\n";

        for (int i = 0; i < a.size(); i++) {
            text += String.format("%-35s" + "%s" + "%s", a.get(i), b.get(i), "$") + "\n";
        }
        text += "------------------------------------------\n";
        if (c.size() != 0) {
            text += String.format("%-35s" + "%s", "TOPPINGD ADDED", "AMOUNT") + "\n";
            for (int i = 0; i < c.size(); i++) {
                text += String.format("%-35s" + "%s" + "%s", c.get(i), d.get(i), "$") + "\n";
            }
            text += "------------------------------------------\n";
        }
        text += "NUMBER OF ITEMS: " + a.size() + "\n"
                + "------------------------------------------\n"
                + String.format("%-35s" + "%s" + "%s", "TOTAL:", setSum(), "$") + "\n";

        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {

        }
    }
}
