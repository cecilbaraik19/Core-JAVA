public class Multiloop6 {
    public static void main(String[] args) {
        int i,j,k,n;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(n=i-1;n>=1;n--)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
