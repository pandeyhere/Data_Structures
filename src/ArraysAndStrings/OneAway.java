package ArraysAndStrings;

public class OneAway {

    public static void main(String[] args) {
        String s1 = "Manish";
        String s2 = "Mnish";

        boolean result = oneOrZeroEditAway(s1, s2);
        System.out.println(result);
    }

    private static boolean oneOrZeroEditAway(String s1, String s2) {
        if (s1.length() > s2.length()) {
            int diff = s1.length() - s2.length();
            if (diff > 1) {
                return false;
            }
            return oneEditInsert(s2, s1);

        }

        if (s2.length() > s1.length()) {
            int diff = s2.length() - s1.length();
            if (diff > 1) {
                return false;
            }
            return oneEditInsert(s1, s2);

        }

        if (s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        }

        return false;
    }

    private static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++; // increment index of longer string

            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDiff = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }

}
