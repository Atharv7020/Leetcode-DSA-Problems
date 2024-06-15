package Leetcode150.Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args){
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
    static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for(String token:tokens){
            if(operators.indexOf(token)!=-1){
                int b = stack.pop();
                int a = stack.pop();
                int result=0;

                if (token.equals("+")){
                     result = a+b;
                }
                else if (token.equals("-")){
                     result = a-b;
                }
                else if (token.equals("*")){
                     result = a*b;
                }
                else if (token.equals("/")){
                     result = a/b;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
