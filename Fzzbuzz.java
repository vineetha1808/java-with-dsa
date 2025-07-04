public class Fzzbuzz {
    public static void main(String[] args){
        for(int i = 1; i <= 15; i++) {
            String result = "";
            result += (i % 3 == 0) ? "Fizz" : "";
            result += (i % 5 == 0) ? "Buzz" : "";
            result += (i % 15 ==0) ? "FizzBuzz" : "";
            System.out.println(result.isEmpty() ? i : result);
        }
    }
}
