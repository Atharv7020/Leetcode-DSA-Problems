package Leetcode150.Stack;

    import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/../";
        System.out.println(simplify(path));
    }
    static String simplify(String path){
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String i:arr){
            if (i.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                stack.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String i:stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}
