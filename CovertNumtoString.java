public class Convert

{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,3,4,45};
        int num = 65432;
        String temp = Integer.toString(num);
        System.out.println(temp);
        System.out.println(temp.getClass().getSimpleName());

    }

}
