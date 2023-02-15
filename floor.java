// greatest number smaller than or equal to target


public class Floor

{
    public static void main(String[] args) {
        int arr[] = {1,2,6,9,11};
        int target= 2;
        System.out.println("Element found at: "+Bsearch(arr, target));
    }


    // return index
    static int Bsearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

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
        return end;

    }

}
