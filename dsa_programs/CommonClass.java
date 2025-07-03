package dsa_programs;

public class CommonClass {

    public void missingnumber(){
        int[] arr={1,2,3,5};
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int arraysum=0;
        for(int num: arr){
            arraysum+=num;
        }
        int missing=totalSum-arraysum;
        System.out.println(missing);
    }
    public void firstRepeatingelement(){
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

