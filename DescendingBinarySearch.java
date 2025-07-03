import java.util.Scanner;
public class DescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int target = 5;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] > target) {
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }

        System.out.println("Element not found.");
    }
}
