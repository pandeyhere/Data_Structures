package ArraysAndStrings;

public class ReverseAString {

    public static void main(String[] args) {

        String s = "Kiaan";
        String result = "";
        result = reverseAString(s, result);

        System.out.println(result);

        char[] old = s.toCharArray();
        reverseAStringSecondRecursion(old, 0);

        System.out.println(old);

        String reversedString = reverseAStringThirdRecursion(s, "");
        System.out.println(reversedString);

    }

    private static String reverseAString(String str, String result) {

        if (str.isEmpty()) {
            return "";
        }

        if ((str == null) || (str.length() <= 1)) {
            result = result + str.charAt(0);
            return result;
        }

        else {
            result = result + str.charAt(str.length() - 1);
            return reverseAString(str.substring(0, str.length() - 1), result);
        }
    }

    private static void reverseAStringSecondRecursion(char[] str, int i) {
        int n = str.length;

        if (i >= n / 2) {
            return;
        }

        char temp = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = temp;

        reverseAStringSecondRecursion(str, i + 1);

    }

    private static String reverseAStringThirdRecursion(String str, String reversedString) {

        if (str.length() < 1) {
            return reversedString;
        }

        return reverseAStringThirdRecursion(str.substring(0, str.length() - 1),
                reversedString + str.charAt(str.length() - 1));

    }

}
