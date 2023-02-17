import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args)
    {
        int[] arr= {3,4,5,1,2};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct_index =  arr[i]-1;
            if(arr[i]!= arr[correct_index])
            {
                int temp = arr[i];
               arr[i]  = arr[correct_index];
               arr[correct_index]= temp;
            }
            else
            {
                i++;
            }

        }
    }

}
