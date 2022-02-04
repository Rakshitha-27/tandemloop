
package ajay;

import java.util.Scanner;


public class Ajay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n,i;
       System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(i=1;i<=n+2;i++)
       {
           if(i%2!=0 &&i!=2)
           {
               System.out.println(i);
           }
           
               
       }
       
    }
    
}
