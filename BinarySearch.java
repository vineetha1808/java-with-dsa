import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        int[] arr1={1,5,10,20,40,80};
        int target=10;
        int low=0;
        int high=arr1.length-1;
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr1[mid]==target){
                System.out.println("target found at index of:"+mid);
                found=true;
                break;
            }
            else if(arr1[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found)
        System.out.println("target not found");
    }
}