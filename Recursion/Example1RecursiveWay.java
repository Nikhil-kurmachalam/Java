public class Recursiveway
{
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        if(n==4)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
