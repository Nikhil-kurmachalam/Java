import java.util.Arrays;

public class Maxin2DArray
{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{15,66,433},{54,2,592} };
        int ans = FindMax(arr); // format of return value [row, column];
        System.out.println(ans);

    }
    static int FindMax(int[][] arr)
    {
        int max= Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
       return max;
    }
}
