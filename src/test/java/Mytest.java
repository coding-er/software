import org.junit.Test;

import java.util.Scanner;


public class Mytest {
    @Test
    public void test() {
        System.out.println(so(100));
        int[]a=new int[1000];
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int cx=scanner.nextInt();
            a[i]=cx;
        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
    public  int so(int n){
           if(n==1)
               return 1;
           else
               return n+so(n-1);
    }
}
