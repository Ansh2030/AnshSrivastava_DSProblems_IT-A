import java.util.*;
public class arrayq8 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        System.out.println("enter the size of 2nd array");
        int m = ob.nextInt();
        int a[]= new int[n];
        int b[]= new int[m];
        System.out.println("enter the  elements of arraay 1");
        for( int i = 0;i<n;i++)
        a[i]= ob.nextInt();

        System.out.println("enter the  elements of arraay 2");
        for( int i = 0;i<m;i++)
        b[i]= ob.nextInt(); 
        int count = 0;

        int c[]= new int[m+n];
        for(int i = 0;i<n;i++)
        {c[i]=a[i];
            count++;}

        for(int i = 0;i<m;i++)
        {c[count]=b[i];
            count++;}

        System.out.println("final array");

        for(int i =0;i<n+m;i++)
        System.out.print(" "+c[i]);
    }




    
}
