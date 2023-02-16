public class RowColSortedMatrix
{
    public static void main(String[] args)
    {
        int[][] arr= {{1,2,3},
                {44,55,66},
                {88,99,100}};
        int target = 100;
        int[] ans = search(arr,target);
        System.out.println(ans[0]+" "+ans[1]);

    }
    static int[] search(int[][] arr, int target)
    {
        int row = 0;
        int col = arr.length-1;
        while(row< arr.length&&col>=0)
        {
            // 3 cases
            if(arr[row][col]==target)
            {
                return new int[] {row, col};
            }
            else if(arr[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;

            }

        }
        return new int[]{-1,-1};
    }

}
