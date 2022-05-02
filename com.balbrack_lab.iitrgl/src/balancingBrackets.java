import java.util.Stack;

public class balancingBrackets {
    public static void main(String[] args) {
        String str = "([[{}]])";
        Stack st = new Stack<>();

        for (int i = 0; i < str.length(); i++);
        if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '[' || str.charAt(i) == '{'){
            st.push(str.charAt(i));
            } else if(! st.empty() && ((str.charAt(i) == '}' && st.peek() == '{') ||
                (str.charAt(i) == '[' && st.peek() == ']') ||
                        (str.charAt(i) == '[' && st.peek() == ']') ||
                                (str.charAt(i) == '(' && st.peek() == ')' ))){
                st.pop();
                } else {
                st.push(str.charAt(i));
        }

    }
boolean ans = st.isEmpty();

    if (ans = true) {
        System.out.println(" The entered String has Balanced Brackets");
    } else {
        System.out.println("The entered String do not contain Balanced Brackets");
    }
}
