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
    // Q.4 Diomond pattern 
    public static void DiomondPat(int n){
        //firs half
        for(int i =1; i<=n; i++){
            for( int j =n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k =1; k<= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i =n; i>=1; i--){
                        for( int j =n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k =1; k<= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    //Q.3 Hollow Rhombus 
    public static void holRhomb(int n){
    for(int i =1; i<=n; i++){
        for(int j =n-i; j>=1;j--){
            System.out.print(" ");
        }
        for(int k =1; k<=n; k++){
            if(i==1 ||i==n || k ==n||k==1){ 
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    // Q.2 SOLID RHOMBUS 

    public static void soliddRho(int n){
           
    for(int i =1; i<=n; i++){
        for(int j =n-i; j>=1;j--){
            System.out.print("  ");
        }
        for(int k =1; k<=n; k++){
          
            System.out.print(" *");
          
        }
        System.out.println();
    }
    }


    
    public static void main(String args[]){
        soliddRho(5);
    
  
     
        
    }
    
}
