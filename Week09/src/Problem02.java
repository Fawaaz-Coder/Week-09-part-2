import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        double amount, roi;
        int years;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        amount = sc.nextDouble();

        System.out.println("Enter the rate of interest: ");
        roi = sc.nextDouble();

        System.out.println("Enter the number of years");
        years = sc.nextInt();

        System.out.println("Year \t Future Value:");

        for (int i = 1; i<=years; i++) {
            double fv = amount * Math.pow(1 + (roi / 100), i);
            System.out.printf("%2d %.1f%% \t \t  %4.2f \n", i, roi, fv);
        }
    }
}
