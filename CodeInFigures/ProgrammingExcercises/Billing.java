package ProgrammingExcercises;

public class Billing {
    public static void main(String[]args){
        double price = 10.00;
        int quantity = 5;
        double coupon = 15.00;
        System.out.println("Cost of one book: " + computeBill(price));
        System.out.println("Cost of " + quantity + "books are: " + computeBill(price, quantity));
        System.out.println("Cost of " + quantity + "books are with a discount: " + computeBill(price, quantity, coupon));
    }
    public static double computeBill(double price){
        return price+(price * 0.08);
    }
    public static double computeBill(double price, int quantity){
        double total = price * quantity;
        return total+(total * 0.08);
    }
    public static double computeBill(double price, int quantity, double coupon){
        double total = price * quantity;
        double discount = total * (coupon/100);
        return total + (total*0.08) - discount;
    }
}
