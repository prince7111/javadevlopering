package javadevlopering;

public class funTwo {
    //Q.5 Number Pyramid
    public static void numPyramid(int n){
              for(int i =1; i<=n; i++){
            for(int j =n-i; j>=1;j--){
                System.out.print(" ");
            }
            for(int k =1; k<= i; k++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        numPyramid(5);
  
     
        
    }
    
}
