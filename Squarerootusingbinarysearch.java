import java.util.Scanner;
public class Squarerootusingbinarysearch {
    public static void main(String[] args) {
        int num = 16;
        int low = 0, high = num, result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <=num) {
                result = mid;    //valid num
                low = mid + 1;  //searching right for a large valid one
            } else {
                high = mid - 1;//mid too large, go left
            }
        }
        System.out.println("Integer square root of " + num + " is: " +result);
    }
}
