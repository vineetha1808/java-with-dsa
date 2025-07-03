import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,5};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    found=true;
                    break;
                }
               
        
            }
             if(found) break;  
            
        }
           if(!found)
            System.out.println(-1);

    }
}
