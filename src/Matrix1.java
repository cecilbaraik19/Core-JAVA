public class Matrix1 {
    public static void main(String[] args) {
        int i,j,arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Element Matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
