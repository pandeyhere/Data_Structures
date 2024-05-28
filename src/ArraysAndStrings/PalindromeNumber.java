package ArraysAndStrings;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(PalindromeNumber.isPalindrome(12321));
    }

    private static boolean isPalindrome(int number){

        int original=number;
        int reverse=0;
        if(number<0){
            return false;
        }
        while(number>0){

            if(reverse == 0){
               reverse=reverse+number%10;
            }else{
                reverse = 10* reverse + number%10;
            }

            number=number/10;
        }
        return reverse==original;
    }
}
