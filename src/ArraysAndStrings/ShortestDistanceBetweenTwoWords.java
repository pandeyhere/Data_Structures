package ArraysAndStrings;

public class ShortestDistanceBetweenTwoWords {

    public static void main(String[] args) {

        // Test case 1
        String[] words1 = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word11 = "fox";
        String word21 = "dog";
        int expectedOutput1 = 5;
        int actualOutput1 = ShortestDistanceBetweenTwoWords.findShortestDistance(words1, word11, word21);
        System.out.println("Test case 1: " + (expectedOutput1 == actualOutput1));

        // Test case 2
        String[] words2 = { "a", "b", "c", "d", "a", "b" };
        String word12 = "a";
        String word22 = "b";
        int expectedOutput2 = 1;
        int actualOutput2 = ShortestDistanceBetweenTwoWords.findShortestDistance(words2, word12, word22);
        System.out.println("Test case 2: " + (expectedOutput2 == actualOutput2));

        // Test case 3
        String[] words3 = { "a", "c", "d", "b", "a" };
        String word13 = "a";
        String word23 = "b";
        int expectedOutput3 = 1;
        int actualOutput3 = ShortestDistanceBetweenTwoWords.findShortestDistance(words3, word13, word23);
        System.out.println("Test case 3: " + (expectedOutput3 == actualOutput3));

        // Test case 4
        String[] words4 = { "a", "b", "c", "d", "e" };
        String word14 = "a";
        String word24 = "e";
        int expectedOutput4 = 4;
        int actualOutput4 = ShortestDistanceBetweenTwoWords.findShortestDistance(words4, word14, word24);
        System.out.println("Test case 4: " + (expectedOutput4 == actualOutput4));
    }

    private static int findShortestDistance(String[] words, String word1, String word2){
        int index1=-1; int index2=-1;
        int distance= words.length;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.equals(word1)){
                index1=i;
            }
            if(word.equals(word2)){
                index2=i;
            }

            if(index1 != -1 && index2 != -1){
                distance= Math.min(distance,Math.abs(index1-index2));
            }
        }
        return distance;
    }
}
