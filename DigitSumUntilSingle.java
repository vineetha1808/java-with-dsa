import java.util.Scanner;

public class DigitSumUntilSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num >= 10) { // Repeat until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Get last digit
                num /= 10;        // Remove last digit
            }
            num = sum;
        }

        System.out.println("Single digit sum is: " + num);
    }
}
