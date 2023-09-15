package ArraysAndStrings;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if(s== null || s.length()== 0 || s.isEmpty()){
            return true;
        }
        char[] chars = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase().trim().toCharArray();
        int len= chars.length-1;
        for(int i=0;i<=len/2;i++){
            if(chars[i] != chars[len-i]){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeTwoPointer(String s) {
        int start = 0; int end = s.length()-1;
        while(start <  end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome sol = new IsPalindrome();

        // Test case 1: "A man, a plan, a canal, Panama!"
        // Expected output: true
        System.out.println(sol.isPalindromeTwoPointer("A man, a plan, a canal, Panama!"));

        // Test case 2: "race a car"
        // Expected output: false
        System.out.println(sol.isPalindromeTwoPointer("race a car"));

        // Test case 3: "Was it a car or a cat I saw?"
        // Expected output: true
        System.out.println(sol.isPalindromeTwoPointer("Was it a car or a cat I saw?"));

        // Test case 4: "Madam, in Eden, I'm Adam."
        // Expected output: true
        System.out.println(sol.isPalindromeTwoPointer("Madam, in Eden, I'm Adam."));

        // Test case 5: "empty string"
        // Expected output: true
        System.out.println(sol.isPalindromeTwoPointer(""));
    }
}
