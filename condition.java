package javadevlopering;

public class condition {
    public static void main(String args[]){
        // System.out.println("hello world III"); // Chapter 03 =Condions //08-07-2025 july
        // System.out.println("JAVA // CHAPTER 03 : CONDITION \\"); //description or 
        // //Q.1 check fever tempreture simple problem (temp given)
        // double tempreture = 103.5;
        // if(tempreture > 100){
        //     System.out.println("Youe Have To Fever");
        // }else{
        //     System.out.println("You Not Have Fever");
        // }
        // //Q.2 positive or negetive
        // int number =0;
        // if(number>0){
        //     System.out.println("it is positive number");
        // }else if(number < 0){
        //     System.out.println("negetive numbers");
        // }else{
        //     System.out.println("its zero or not defined number-");
        // }
        //Q.3 Switch case day in week
        // int day =5;
        // switch (day) {
        //     case 1:System.out.println("Sunday");
                
        //         break;
        //       case 2:System.out.println("monday");
                
        //         break;
        //           case 3:System.out.println("tuesday");
                
        //         break;
        //           case 4:System.out.println("wednesday");
                
        //         break;
        //           case 5:System.out.println("thursday");
                
        //         break;
        //         case 6: System.out.println("friday");
        //     default:System.out.println("Saturday");
        //         break;
        // }
        //Q.4 Value of X and Y
        // int a =63, b =36;
        // boolean x =(a < b )? true : false;
        // int y = (a > b) ? a:b;
        // System.out.println("x ="+x);
        // System.out.println("y ="+y);
        //Q.5 Cheack leap year (divisible by -4,100,400)
        int y= 2025;
        if((y % 4 ==0)&& (y % 100 !=0)&&(y % 400 !=0)){
            System.out.println("LEAP YEAR");

        }else{
              System.out.println("NOT LEAP YEAR");
             }
    
    }
}
