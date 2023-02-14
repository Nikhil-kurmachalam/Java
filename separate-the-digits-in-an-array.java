//Seperate given numbers in array to single digits in array
//Example: input = {127,43,51, 19, 29 ,29,5,5};
             output = [1, 2, 7, 4, 3, 5, 1, 1, 9, 2, 9, 2, 9, 5, 5]
             
             
             //code
             
             
             import java.util.ArrayList;
import java.util.Arrays;

public class Seperate

{
    public static void main(String[] args)
    {
        int[] nums = {127,43,51, 19, 29 ,29,5,5};

        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
//            System.out.println("for number:"+num);
            while (num > 0) {
                temp.add(num % 10);
//                System.out.println("number added to temp is: "+num % 10);
                num /= 10;
//                System.out.println("num became: "+num);
            }
//            System.out.println("Printing temp");
//            for (int j=0;j< temp.size(); j++) {
//                System.out.println(temp.get(j));
////                ans.add(temp.get(j));
//            }
//            System.out.println("Printing temp: reverse");
            for (int j = temp.size() - 1; j >= 0; j--) {
                ans.add(temp.get(j));
//                System.out.println(temp.get(j));
            }

        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);

        }
////
//        System.out.println("");
//        for(int i=0;i<ans.size();i++)
            System.out.println(Arrays.toString(result));


    }

}
