import java.util.*;
public class matrix16 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the order");
        int n = ob.nextInt();
        int a1[][]= new int[n][n];
        int a2[][]= new int[n][n];
        System.out.println("enter the elements of matrix 1");
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        a1[i][j]= ob.nextInt();
        System.out.println("enter the elements of matrix 2");
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        a2[i][j]= ob.nextInt();

        int b[][]= new int[n][n];
        for(int i = 0;i<n;i++)
        for(int j =0;j<n;j++ )
        b[i][j]= a1[i][j]+a2[i][j];

        for(int i = 0;i<n;i++)
        {for(int j =0;j<n;j++ )
            System.out.print(b[i][j]+" ");
            System.out.println();}



    }
}
