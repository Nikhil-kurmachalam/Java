import java.net.SocketOption;

public class SearchInString
{
    public static void main(String[] args) {
        String name = "Nikhil";
        char s = 'N';
        boolean ans = SearchString(name, s);
        System.out.println(ans);
    }
    static boolean SearchString(String name, char a )
    {
        if(name.length()==0)
            return false;

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==a)
                return true;
            else
                return false;
        }
        return false;
    }
}
