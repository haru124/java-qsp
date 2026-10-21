import java.util.*;
public class MaxProduct {
    public static int getMaxProd(int[] ar,int n)
    {
        int asum = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int as = ar[i];
            for(int j=i+1;j<n;j++)
            {
                as = as*ar[j];
                if (asum <as)
                    asum = as;
            }
        }

        return asum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the elements:");
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println(getMaxProd(ar,n));
        sc.close();
    }
}
