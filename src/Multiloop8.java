public class Multiloop8 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(k=10;k>i*2;k--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
