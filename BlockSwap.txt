import java.util.*;
public class BlockSwap {
    public static void blockSwap(int[] ar,int n,int k)
    {
        if(n ==0)
            return ;
        k = k%n;
        if(k>n)
            return;
        int [] temp = new int[k];
        int i;
        for(i=0;i<k;i++)
            temp[i] = ar[i];
        for(i=0;i<n-k;i++)
            ar[i] = ar[i+k];
        for(i = n-k;i<n;i++)
            ar[i] = temp[i-n+k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] ar = {1,2,3,4,5,6,7};
        int k =2;
        blockSwap(ar,n,k);
        for(int x: ar)
        {
            System.out.print(x+" ");
        }

        sc.close();
    }
}
