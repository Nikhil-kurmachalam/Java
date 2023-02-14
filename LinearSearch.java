public class Main {
    public static void main(String[] args)
    {
       int[] nums = {1,2 ,3,4,44,5,232,654};
       int target = 99 ;
       int ans= LinearSearch(nums, target);
       System.out.println("Element present at index: "+ans);

    }
    //searching the array, return the index if item is found, else return -1
    static int LinearSearch(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        //run a for loop
        for(int i=0;i<arr.length;i++)
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

