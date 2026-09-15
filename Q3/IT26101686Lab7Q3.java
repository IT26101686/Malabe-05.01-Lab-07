import java.util.Scanner;

public class IT26101686Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char paymentMode = input.next().charAt(0);

            double discount = 0;
            double amountToPay;

            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * 0.05;
                amountToPay = billAmount - discount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to be paid = " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode == 'o') {
                amountToPay = billAmount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to be paid = " + amountToPay);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}