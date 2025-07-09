import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
