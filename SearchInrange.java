public class SearchInRange {
    public static void main(String[] args)
    {
        int startindex= 3;
        int lastindex= 10;
        int[] nums = {1,2 ,3,4,44,5,232,654};
        int target = 5 ;
        int ans= LinearSearch(startindex, lastindex, nums, target);
        System.out.println("Element present at index: "+ans);

    }
    //searching the array, return the index if item is found, else return -1
    static int LinearSearch(int startindex, int lastindex, int[] arr, int target)
    {
        if(arr.length==0||lastindex>arr.length)
        {
            return -1;
        }
        //run a for loop
        for(int i=startindex;i<=lastindex;i++)
        {
            //check every index if the value present of not as targer
            int element = arr[i];
            if(element== target)
                return i;
        }
        //this line execute if none of the above return execute, means target not found
        return -1;
    }

}

