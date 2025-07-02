import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("This is the code for PREFIX to INFIX");

        String s = "*+PQ-MN";
        String ans = prefixtoinfix(s);
        System.out.println("Final Infix: " + ans);
    }

    public static String prefixtoinfix(String s) {
        Stack<String> st = new Stack<>();
        char[] ch = s.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(ch[i])) {
                st.push(Character.toString(ch[i]));
            } else {
                String t1 = st.pop(); // right
                String t2 = st.pop(); // left
                String expr = "(" + t1 + ch[i] + t2 + ")";
                st.push(expr);
            }
        }

        return st.isEmpty() ? "" : st.peek();
    }
}
