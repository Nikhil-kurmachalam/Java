import java.util.Arrays;

public class SearchIn2DArray
{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{15,66,433},{54,2,52} };
        int target = 3;
        int[] ans = Findelement(target, arr); // format of return value [row, column];
        System.out.println(Arrays.toString(ans));

    }
    static int[] Findelement(int target, int[][] arr)
    {
        for(int i= 0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
