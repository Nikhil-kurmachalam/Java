import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("This is the code for postfix to prefix");

        String s = "AB-DE+F*/";
        String ans = postfixtoprefix(s);
        System.out.println("Final Prefix: " + ans);
    }

    public static String postfixtoprefix(String s) {
        Stack<String> st = new Stack<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])) {
                st.push(Character.toString(ch[i]));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String push = ch[i] + t2 + t1;
                st.push(push);
            }
        }

        return st.isEmpty() ? "" : st.peek();
    }
}
