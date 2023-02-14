public class BSorderAgnostics
{
    public static void main(String[] args)
    {
        int[] arr = {100, 99, 88, 77, 33, 5, 4 , -4};
        int target = 4;
        int ans = OrderAgnostic_array(arr, target);
        System.out.println(ans);

    }
    static int OrderAgnostic_array(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start]<arr[end];

        while(start<=end)
        {
            //find the element
//            int mid = (start+end)/2; might be possible that start+end exceeds range of integer
            int mid = start +(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(asc)
            {
                if(target<arr[mid])
                    end = mid-1;
                else if(target>arr[mid])
                    start = mid+1;
            }
            else
            {
                if(target>arr[mid])
                    end = mid-1;
                else if(target<arr[mid])
                    start = mid+1;
            }

        }
        return -1;

    }
}
