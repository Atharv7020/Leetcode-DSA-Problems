package Leetcode150.String;

public class CountString {
    public static void main(String[] args){
        String sentence="say my name";
        System.out.println(iterate(sentence));
    }
    static int iterate(String s){
        String str=s.trim();
        System.out.println(str);
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
