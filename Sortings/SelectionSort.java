import java.util.Arrays;

public class Selection
{
    public static void main(String[] args)

    {
        int[] arr = {1,9,4,0,7,99,55,6};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int[] arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            int last = arr.length-i-1;
            int findmax = MaxElement(arr, 0,last); // findmax returns maximum element index
                    int temp = arr[findmax];
                    arr[findmax]= arr[last];
                    arr[last]=temp;
        }
    }

    static int MaxElement(int[] arr, int start, int end)
    {
        int max = arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
    }

}
