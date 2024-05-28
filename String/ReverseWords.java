package Leetcode150.String;

public class ReverseWords {
    public static void main(String[] args){
        String sen="The name is bond";
        System.out.println(reverse(sen));
    }
    static String reverse(String s){
        String[] arr=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
