package ArraysAndStrings;

public class ValidaPalindrome {

    private static boolean isValidPalindrome(String s){
        int i=0;
        int j= s.length()-1;
        while(i<j){
            while(i<j && !Character.isDigit(s.charAt(i))){
                i++;
            }
            while (i<j && !Character.isDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase((s.charAt(j)))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidaPalindrome.isValidPalindrome("A man, a plan, a canal, Panama!"));
    }

}
