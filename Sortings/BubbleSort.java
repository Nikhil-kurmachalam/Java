import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
     int[] arr= {1,2,43,6,0,3};
     bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr)
    {
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap =false;
            for(int j=1;j<arr.length;j++)
            {
                int temp;
                if(arr[j-1]>arr[j])
                {
                    // swap if item is smaller the previous element
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap=true;
                }
            }
            //if no swapping is done for particular value of i, array is sorted, break the execution
            if(!swap)  // !swap = !false = true
                break;


        }
    }

}
