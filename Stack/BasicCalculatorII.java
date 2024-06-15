package Leetcode150.Stack;
import java.util.Stack;
public class BasicCalculatorII {
    public static void main(String[] args){
        String operation = "3+2*2";
        System.out.println(calculate(operation));
    }
    static int calculate(String s){
        if(s==null || s.isEmpty()) return 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        char op = '+';
        char[] ch = s.toCharArray();
        for (int i = 0; i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                current = current *10+ch[i] -'0';
            }
            if (!Character.isDigit(ch[i]) && ch[i]!=' ' || i == ch.length-1) {
                if (op == '+') {
                    stack.push(current);
                } else if (op == '-') {
                    stack.push(-current);
                } else if (op == '*') {
                    stack.push(stack.pop() * current);
                } else if (op == '/') {
                    stack.push(stack.pop() / current);
                }
                op = ch[i];
                current = 0;
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
