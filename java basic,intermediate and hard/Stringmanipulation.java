import java.util.Scanner;
public class Stringmanipulation{
    public static void main(String[] args){
        String s1="my name is bannu";
        String[] a=s1.split(" ");
        String rev=" ";
        for(int i=0;i<a.length;i++){
            rev=a[i]+" "+rev;
        }
        System.out.println(rev);
    }
}