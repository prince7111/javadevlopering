package javadevlopering;
public class paternjava {
    public static void main(String args[]){
        // pattern part I /Ch-05
        System.out.println("Hello World (V)");
        System.out.println("||JAVA programing || Chapter 05 || Pattern Basics||");
        //Q,1 hollow ractangle pattern ***
        // int n =4;
        // for(int i =1; i<=n; i++){
        //     for(int j =1; j<=n ; j++){
        //         if(i==1 || j==1 || i==n || j==n){
        //         System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();

        // }
        //Q.2 INVERTED AND ROATATE HALF PYRAMID PATTERN
        int n =4;
        for(int i=1; i<=n; i++){
            for(int space =n-i; space>=1; space--){ //spaces print 3,2,1,0time
                System.out.print("  ");
           }
           for(int j =1;j<=i;j++){                  //coloumn me star parinting
            System.out.print("* ");
           }
           System.out.println();//next Line
        }
      

    }
    
}
