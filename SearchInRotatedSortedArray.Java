class Solution {
    public int search(int[] nums, int target) 
    {
        int pivot = findPivot(nums);
        int ans;
        if(pivot==-1)
        {
            //if pivot is not found, do normal binary search
             ans = Bsearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found:
       else 
       {
            ans =  Bsearch(nums, target, 0, pivot);
           if(ans == -1)
           {
               ans=  Bsearch(nums, target, pivot+1 ,nums.length-1);
           }
       }
      return ans;       
    }
     static int Bsearch(int [] arr, int target, int start, int end)
    {
        boolean asc = arr[start] < arr[end];
        while(start<=end)
        {
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
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+ (end-start)/2;
            //four cases
                if(mid< end && arr[mid]>arr[mid+1])
                {
                    return mid;
                }
                else if(mid> start && arr[mid]<arr[mid-1])
                {
                    return mid-1;
                }
                if(arr[start]>=arr[mid]) {
                    end = mid - 1;
                }else   //if(arr[start]<=arr[mid])
                    start = mid+1;
        }
        return -1;
    }
}
