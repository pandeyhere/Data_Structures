package ArraysAndStrings;

public class checkIfTwoStringsIdential {

    public static void main(String[] args) {
        String s1 = "Aadvik";
        String s2 = "Aadvik";
        boolean identical = checkIfTwoStringsIdentical(s1, s2);
        System.out.println(identical);

    }

    public static boolean checkIfTwoStringsIdentical(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
