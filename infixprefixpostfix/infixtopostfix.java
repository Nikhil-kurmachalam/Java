
import java.util.Stack;

class Main {
    public static void main(String[] args) 
    {
      System.out.println("This is the code for infix to postfix");
      String s = "a+b*(c^d-e)";// the operators are in middle
      
      String ans = infixtoPostfix(s);
      System.out.println(ans);
    }
    public static String infixtoPostfix(String s)
    {
        
        Stack<Character> st = new Stack<>();
        String ans="";
        
        
        char[] ch = s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z'||ch[i]>='0' && ch[i]<='9')
            {
                ans = ans+ch[i];
            }
            else if(ch[i]=='(')
            st.push(ch[i]);
            else if(ch[i]==')')
           {
               while(!st.empty()&&st.peek()!='(')
               {
                   ans = ans+st.peek();
                   st.pop();
               }
               st.pop();
           }
           else
           {
               while(!st.empty()&&priority(ch[i])<=priority(st.peek()))
               {
                   ans = ans+st.peek();
                   st.pop();
               }
               st.push(ch[i]);
           }
        }
        while(!st.empty())
        {
            ans=ans+st.peek();
            st.pop();
        }
        return ans;
    }
    public static int priority(char c)
    {
        if(c=='^')
        return 3;
        else if(c=='*'||c=='/')
        return 2;
        else if(c=='+'||c=='-')
        {
            return 1;
        }
        
        return -1;
    }
    
}