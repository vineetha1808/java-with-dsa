public class Addition {
    public static void noReturntype(){
        System.out.println("no return type");
    }
    public static int ReturnType(int a){
        return a;

    }
    public static int Add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        noReturntype();
        int value=ReturnType(10);
        System.out.println(value);
        int result=Add(10,20);
        System.out.println(result);


    }
    
}
