package Leetcode150.String;

public class FirstOccurenceInString {
    public static void main(String[] args){
       String haystack = "sadbutsad", needle = "but";
       System.out.println(strStr(haystack,needle));
    }
    static int strStr(String haystack,String needle){
        for (int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
