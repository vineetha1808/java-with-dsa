import java.util.Scanner;
public class Squareroot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double squareroot=Math.sqrt(num);
        System.out.println("the number is:"+(int)squareroot);
    }
}