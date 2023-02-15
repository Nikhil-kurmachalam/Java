public class InfiniteSortedArray

{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,44,55,66,88,99,100, 199, 777,888,999,1000};
        int target= 777;
        findIndex(arr,target );
        System.out.println( findIndex(arr,target));
    }

     static int findIndex(int[] arr, int target)

    {
        int start = 0;
        int end = 1;
        while(target> arr[end])
        {
            int temp = end+1;
             end = end+(end-start+1)*2;
             start = temp;

        }
        return(Bsearch(arr,target, start, end));
    }


    static int Bsearch(int[] arr, int target,int  start, int end)
    {
//        int start = 0;
//        int end = arr.length-1;

        while(start<=end)
        {
            //find the element
//            int mid = (start+end)/2; might be possible that start+end exceeds range of integer
            int mid = start +(end-start)/2;

            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start = mid+1;
            else
            {
                return mid;
            }
            
        }
        return -1;

    }
}
