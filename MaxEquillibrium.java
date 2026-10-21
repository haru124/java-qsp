import java.util.*;
public class MaxEquillibrium {
    public static int getMaxEqui(int[] ar,int n)
    {
        int asum = Integer.MAX_VALUE;
        int lsum,rsum,idx=-1;
        for(int i =1;i<n-1;i++)
        {
            lsum=0;
            rsum=0;
            for(int j =0;j<i;j++)
                lsum = lsum + ar[j];
            for(int j=i;j<n;j++)
                rsum = rsum+ar[j];
            int diff = Math.abs(lsum-rsum);
            if (asum>diff)
            {
                asum = diff;
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i =0;i<n;i++)
            ar[i] = sc.nextInt();
        System.out.println(getMaxEqui(ar,n));
        sc.close();
    }
}
