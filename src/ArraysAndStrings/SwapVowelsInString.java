package ArraysAndStrings;

public class SwapVowelsInString {
    static final String vowels = "aeiouAEIOU";

    private static String swapVowels(String s){

        int last=s.length()-1;
        int first=0;
        char[] array = s.toCharArray();
        while(first<last){
            while(first<last && vowels.indexOf(array[first]) == -1){
                first++;
            }
            while(first<last && vowels.indexOf(array[last]) == -1){
                last--;
            }
            char temp = array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }

        return new String(array);

    }
    public static void main(String[] args) {
        System.out.println(SwapVowelsInString.swapVowels("Aadvik"));

    }
}
