public class FindMin
{
    public static void main(String[] args) {
        int[] arr= {13,1,4,7,33,65,100};
        System.out.println(min(arr));
    }
    static int min(int arr[])
    {
        int minvalue = arr[0];
        for(int i=1;i<arr.length;i++)
        {

            if(minvalue>arr[i])
                minvalue= arr[i];

        }
        return minvalue;
    }

}
