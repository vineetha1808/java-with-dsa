import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        String s1="hello world";
        String rev=" ";
        for(int i=s1.length()-1;i>=0;i--){
            rev+=s1.charAt(i);
        }
        System.out.println(rev);
    }
}


