package ArraysAndStrings;

public class NonIncOrNonDec {
    static boolean nonIncreasing = false;
    static boolean nonDecreasing = false;

    public static void main(String[] args) {
        int result = difProblem("543222");
        System.out.println(result);
    }

    static int difProblem(String N) {
        int firstdigit = Character.getNumericValue(N.charAt(0));
        int seconddigit = Character.getNumericValue(N.charAt(1));
        if (firstdigit <= seconddigit) {
            nonIncreasing = true;
        } else {
            nonDecreasing = true;
        }

        for (int i = 1; i < N.length() - 1; i++) {
            if (nonIncreasing && Character.getNumericValue(N.charAt(i)) <= Character.getNumericValue(N.charAt(i + 1))) {
                continue;
            } else if (nonDecreasing
                    && Character.getNumericValue(N.charAt(i)) >= Character.getNumericValue(N.charAt(i + 1))) {
                continue;
            } else {
                return 0;
            }

        }
        return 1;
    }

}
