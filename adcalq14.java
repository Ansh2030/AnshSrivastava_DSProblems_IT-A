import java.util.*;
public class adcalq14 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size");
        int m = ob.nextInt();
        int n = ob.nextInt();
        int a[][]= new int[m][n];
        int ba = a.hashCode();
        System.out.println("enter the word size");
        int w= ob.nextInt();
        System.out.println("enter the index");
        int p=ob.nextInt();int q = ob.nextInt();
        int l1=0,l2=0,u1=m-1,u2=n-1;
        int ad= ba+w*((p-l1)*(u2-l2+1)+(q-l2));
        System.out.println("row major address : "+ad);
        ad=ba+w*((p-l1)+(q-l2)*(u1-l1+1));
        System.out.println("column major address : "+ad);
    }
}
