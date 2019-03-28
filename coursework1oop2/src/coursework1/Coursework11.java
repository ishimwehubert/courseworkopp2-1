
package coursework1;

import java.util.Scanner;

public class Coursework11 {

   
    public static void main(String[] args) {
        int mark[] = new int [7];
     int m = 0;
     String grd;
      float sum=0;
     Scanner scan = new Scanner(System.in);
     System.out.println("Input Student Name");
     String  S=scan.next();
     System.out.println(S);
     
     System.out.println("Input 1st Course Unit Name");
     String  H=scan.next();
     System.out.println( H);
     
     System.out.println("Input Marks");
               
      mark[m] = scan.nextInt();
         sum = sum + mark[m];
         
          if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
           else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
           else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
          else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
          else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
    }
           System.out.println("Input 2nd Course Unit Name");
     String  E=scan.next();
     System.out.println(E);
     System.out.println("Input Marks");
     
     mark[m] = scan.nextInt();
         sum = sum + mark[m];
         if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
     else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
         else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
     else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
     else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
    }
         
          System.out.println("Input 3rd Course Unit Name");
     String  G=scan.next();
     System.out.println(G);
     
      System.out.println("Input Marks");
    mark[m] = scan.nextInt();
         sum = sum + mark[m];
         
     if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
     else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
     else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
     else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
     else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
    }
     System.out.println("Input 4th Course Unit Name");
     String  J=scan.next();
     System.out.println(J);
     
      System.out.println("Input Marks");
     mark[m] = scan.nextInt();
         sum = sum + mark[m];
         
     if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
     else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
     else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
     else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
     else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
    }
     System.out.println("Input 5th Course Unit Name");
     String  N=scan.next();
     System.out.println(N);
      System.out.println("Input Marks");
     mark[m] = scan.nextInt();
         sum = sum + mark[m];
         
     if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
     else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
     else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
     else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
     else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
    }
     
      System.out.println("Input 6th Course Unit Name");
     String  Z=scan.next();
     System.out.println(Z);
     
     System.out.println("Input Marks");
    mark[m] = scan.nextInt();
         sum = sum + mark[m];
         
     if(mark[m]>=80 && mark[m]<=100){
         grd="A";
         System.out.println("A");
        }
     else if(mark[m]>70 && mark[m]<=79){
         grd="B";
         System.out.println("B");
     }
     else if(mark[m]>=60 && mark[m]<=69){
         grd="C";
         System.out.println("C");
     }
     else if(mark[m]>=50 && mark[m]<59){
         grd="D";
         System.out.println("D");
     }
     else if(mark[m]>40 && mark[m]<=49){
         System.out.println("F");
     }
     else if(mark[m]<=39){
        System.out.println("Null");
     }
     
    }
    
}
