import java.util.Arrays;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of lines: ");
        a = sc.nextInt();


        for (int i = 1; i <= a; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.print(" ");
            for (int j = i-1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

