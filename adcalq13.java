import java.util.*;

public class adcalq13 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
       
       
        
       // Integer k = Integer.valueOf(ar[3]);
        //int t = k.hashCode();
       // System.out.println(t);

         //System.out.println(ar);
       // System.out.println("enter the base address");
       // int bs = ob.nextInt(); 
        System.out.println("enter the word size");
        int w = ob.nextInt();
        System.out.println("enter the array size");
        int n = ob.nextInt();int l = 0;
        int ar[] = new int[5];
        int bs = ar.hashCode();
        System.out.println("enter the array index");
        int i = ob.nextInt();
        int ad= bs+(i-l)*w;
        System.out.println("adress is "+ad);
    }
}
