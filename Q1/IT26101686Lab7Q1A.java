import java.util.Scanner;

public class IT26101686Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4;
        double average;

        System.out.print("Enter marks for Subject 1: ");
        mark1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = input.nextDouble();

        System.out.print("Enter marks for Subject 4: ");
        mark4 = input.nextDouble();

        average = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Average = " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Grade = Distinction");
        } else if (average >= 50) {
            System.out.println("Grade = Credit");
        } else {
            System.out.println("Grade = Fail");
        }

        input.close();
    }
}