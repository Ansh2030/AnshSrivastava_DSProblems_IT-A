import java.util.*;
public class arrayq11 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        System.out.println("enter the size of 2nd array");
        int m = ob.nextInt();
        int a[]= new int[n];
        int b[]= new int[m];
        System.out.println("enter the  elements of set 1");
        for( int i = 0;i<n;i++)
        a[i]= ob.nextInt();

        System.out.println("enter the  elements of set 2");
        for( int i = 0;i<m;i++)
        b[i]= ob.nextInt(); 
        int c[]= new int[n+m]; int p =0;

        for(int i = 0;i<n;i++)
        { int ct = 0;
            for(int j = 0;j<m;j++)
            {
                if(a[i]==b[j])
                ct++;
            }
            if(ct==0)
            {
                c[p]= a[i];p++;
            }

        }

        System.out.println("A-B is");
        for(int i = 0;i<p;i++)
        System.out.print(c[i]+" ");

    }
    
}
