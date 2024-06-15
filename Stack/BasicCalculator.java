package Leetcode150.Stack;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String operation = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(operation));
    }
    static int calculate(String s){
        int sign =1;
        int current = 0;
        int ans = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                current = s.charAt(i)-'0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
                    current = current*10+s.charAt(i+1)-'0';
                    i++;
                }
                current =current*sign;
                ans = ans +current;
                current = 0;
            }
            else if(s.charAt(i)=='+'){
                sign = 1;
            }
            else if(s.charAt(i)=='-'){
                sign = -1;
            }
            else if(s.charAt(i)=='('){
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i)==')'){
                int prevsign = stack.pop();
                ans = prevsign * ans;
                int prevans = stack.pop();
                ans = ans +prevans;
            }
        }
        return ans;
    }
}
