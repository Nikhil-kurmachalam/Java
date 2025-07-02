import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("This is the code for postfix to infix");

        String s = "AB-DE+F*/";
        String ans = postfixtoinfix(s);
        System.out.println("Final Infix: " + ans);
    }

    public static String postfixtoinfix(String s) {
        Stack<String> st = new Stack<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || 
                (ch[i] >= 'a' && ch[i] <= 'z') || 
                (ch[i] >= '0' && ch[i] <= '9')) {
                st.push(Character.toString(ch[i]));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String push = "(" + t2 + ch[i] + t1 + ")";
                st.push(push);
            }
        }

        return st.isEmpty() ? "" : st.peek();
    }
}
