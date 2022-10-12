import java.util.*;
public class matrix21 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the order");
        int n = ob.nextInt();
        int a[][]= new int[n][n];
        System.out.println("enter the elements of matrix 1");
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        a[i][j]= ob.nextInt();
      
        //int b[][]= new int[n][n];
        for(int i = 0;i<n;i++)
        for(int j =0;j<i;j++ )
        {
            int t= a[i][j];
            a[i][j]= a[j][i];
            a[j][i]=t;

        }
        for(int i = 0;i<n;i++)
        {for(int j =0;j<n;j++ )
            System.out.print(a[i][j]+" ");
            System.out.println();}


    }
}
