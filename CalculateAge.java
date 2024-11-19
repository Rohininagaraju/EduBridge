import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

        int age =currentYear-birthYear ;
System.out.println("Your age is " +age);

       }
}