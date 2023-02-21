public class Main {
    public static void main(String[] args)
    {
        int n= 4;
        PrintPattern(n);
    }
    static void PrintPattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

}
//        ****
//        ****
//        ****
//        ****
