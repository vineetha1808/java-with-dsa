public class Subtraction {
    
public static void noReturntype(){
    System.out.println("no return type");

}
public static int returnType(int a){
    return a;
}
public static int sub(int a,int b){
    return a-b;
}
public static void main(String[] a){
    noReturntype();
    int value=returnType(10);
    System.out.println(value);
    int result=sub(20,10);
    System.out.println(result);

}
}
