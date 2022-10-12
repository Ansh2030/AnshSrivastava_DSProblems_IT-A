import java.util.*;
public class matrix20 {

    static void getcofact(int a[][],int temp[][],int p,int q,int n)
    {
        int i = 0,j=0;
        for(int r = 0;r<n;r++)
        {
            for(int col=0;col<n;col++)
            {
                if(r!=p&&col!=q)
                {
                    temp[i][j++]=a[r][col];
                    if(j==n-1)
                    {
                        i++;j=0;
                    }
                }
            }
        }
    }
// to calculate determinant
    static int det(int mat[][],int n )
    {
         int D=0;
        if(n==1)
        return(mat[0][0]);
        int temp[][]= new int[n][n];
        int s = 1;
        for(int f = 0;f<n;f++)
        {
            getcofact(mat,temp,0,f,n);
            D+=s*mat[0][f]*det(temp,n-1);
        }
        return(D);
    }

    static void display(int b[][],int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }
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
        System.out.println("Determinant of the matrix is :"+ det(a,n));

    }
}
