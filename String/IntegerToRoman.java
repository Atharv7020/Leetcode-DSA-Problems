package Leetcode150.String;

public class IntegerToRoman {
    public static void main(String[] args){
        int number = 1994;
        System.out.println(numToStr(number));
    }
    static String numToStr(int num){
        String Roman="";
        int[] numbers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i=0;i<numbers.length;i++){
            while(num>=numbers[i]){
                Roman = Roman+romanLetters[i];
                num-=numbers[i];
            }
        }
        return Roman;
    }
}
