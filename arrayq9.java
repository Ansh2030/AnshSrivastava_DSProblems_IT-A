import java.util.*;
public class arrayq9 {
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
        int d[]= new int[n+m];

        //finding intersection
        for(int i = 0;i<n;i++)
        { int ct =0;
            for(int j =0;j<m;j++)
            {
                if(a[i]==b[j])
                ct++;

            }
            if(ct>0)
            {c[count]= a[i];
                
                count++;}
        }
        int p=0;

        for(int i =0;i<n;i++)
        { int ct = 0;
            for(int j = 0;j<count;j++)
            {
                if(a[i] == c[j])
                ct++;
            }
            if(ct==0)
           { d[p]=a[i];p++;}
        }

        for(int i = 0;i<m;i++)
        {
            int ct = 0;
            for(int j = 0;j<count;j++)
            {
                if(b[i]==c[count])
                ct++;
            }
            if(ct==0)
            { d[p]= b[i];p++;}
        }

        //for(int i = 0;i<count;i++)
        //{d[p]=c[i];p++;}
        System.out.println("final array");

        for(int i =0;i<p;i++)
        System.out.print(" "+d[i]);
    }
}
