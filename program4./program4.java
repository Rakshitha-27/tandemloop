
import java.util.*;
public class program4 {
    public static void main(String[] args)
    {
        int n,i,j;
        int a[]=new int[5];
        int c[]={0};
        int b[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
    }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<b.length;j++)
            if(a[i]%b[j]==0)
            {
                c[i]++;
                System.out.println(b+","+c[i]);
                j++;
            }
            
        }
    
    }}