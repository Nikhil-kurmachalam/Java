import java.util.Arrays;

public class Convert

{
    public static void main(String[] args)
    {

        int num = 65432;
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];

//                System.out.println(temp.length());
        for(int i=0;i<temp.length();i++)
            arr[i] = Character.getNumericValue(temp.charAt(i));
        
        System.out.println(Arrays.toString(arr));
        // output is [6, 5, 4, 3, 2]
        System.out.println(temp.getClass().getSimpleName());

    }

}
