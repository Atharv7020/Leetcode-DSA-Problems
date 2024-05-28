package Leetcode150.String;

public class ReverseString {
    public static void main(String[] args) {
        String name="Intel";
        System.out.println(reverse(name));
    }
    static String reverse(String s){
        String result="";
        for (int i=s.length()-1;i>=0;i--){
            result=result+s.charAt(i);
        }
        return result;
    }
}
