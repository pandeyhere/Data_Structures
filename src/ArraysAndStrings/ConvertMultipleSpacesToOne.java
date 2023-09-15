package ArraysAndStrings;

public class ConvertMultipleSpacesToOne {

    public static void main(String[] args) {
        String s = "I am         Manish            Pandey,  Would you   be my friend?";
        String result = convertMultipleSpacesToOne(s);
        System.out.println(result);
    }

    public static String convertMultipleSpacesToOne(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            } else {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    continue;
                }
                result.append(' ');
            }
        }

        return result.toString();
    }

}
