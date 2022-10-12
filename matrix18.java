import java.util.*;
public class matrix18 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the order");
        int n = ob.nextInt();
        int a[][]= new int[n][n];
        int b[][]= new int[n][n];
        System.out.println("enter the elements of matrix 1");
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        a[i][j]= ob.nextInt();
        System.out.println("enter the elements of matrix 2");
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        b[i][j]= ob.nextInt();

        int c[][]= new int[n][n];
        for(int i= 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                c[i][j]=0;
                for(int k = 0;k<n;k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }
                
            }
        }
        // printing 
        for(int i = 0;i<n;i++)
        {for(int  j = 0;j<n;j++)
        System.out.print(" "+c[i][j]);
        System.out.println();}

    }
}
