    import java.util.*;
    
    class Main {
        public static void main(String[] args) {
            System.out.println("This is the code for PREFIX to POSTFIX");
    
            String s = "/-AB*+DEF";
            String ans = prefixtopostfix(s);
            System.out.println("Final postfix: " + ans);
        }
    
        public static String prefixtopostfix(String s) {
            Stack<String> st = new Stack<>();
            char[] ch = s.toCharArray();
    
            for (int i = ch.length - 1; i >= 0; i--) {
                if (Character.isLetterOrDigit(ch[i])) {
                    st.push(Character.toString(ch[i]));
                } else {
                    String t1 = st.pop(); // right operand
                    String t2 = st.pop(); // left operand
                    
                    String expr = t1+t2 + ch[i]; // postfix
                                    System.out.println("the value here for expr is "+expr);
    
                    st.push(expr);
                }
            }
    
            return st.isEmpty() ? "" : st.peek();
        }
    }
