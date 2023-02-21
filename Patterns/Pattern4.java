public class Main {
    public static void main(String[] args)
    {
        int n= 9;
        PrintPattern(n);
    }
    static void PrintPattern(int n)
    {

        for(int row=1;row<=n;row++)
        {    int a = 1;
            for(int col=1;col<=row;col++) {
                System.out.print(a);
                a++;
            }
            System.out.print("\n");

        }
    }

}
//          1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789
