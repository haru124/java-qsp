import java.util.*;
public class Hourglass {
    public static int getHourGlassSum(int[][] ar)
    {
        int size = ar.length;
        if(size < 3)
        {
            System.out.println("Not possible for sum");
            System.exit(0);
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<size-2;i++)
        {
            for(int j=0;j<size-2;j++)
            {
                int sum = ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
                if (sum> max_sum)
                    max_sum = sum;
            }
        }
        return max_sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of squared matrix: ");
        int n = sc.nextInt();
        int ar[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println(getHourGlassSum(ar));
        sc.close();
    }
}
