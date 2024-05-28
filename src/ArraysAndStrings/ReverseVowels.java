package ArraysAndStrings;

public class ReverseVowels {

        private static String reverseVowels(String s){

            if(s.isEmpty()){
                return s;
            }

            char[]  chars = s.toCharArray();

            int last = chars.length-1;
            int first = 0;

            while(first<last){

                while(first < last && !isVowel(chars[first])){
                    first++;
                }

                while(first < last && !isVowel(chars[last])){
                    last--;
                }

                //swap
                char temp = chars[first];
                chars[first] = chars[last];
                chars[last] = temp;
                first++;
                last--;

            }
            return new String(chars);
        }

        private static boolean isVowel(char ch){
            return ch =='A' || ch =='a' || ch =='E' || ch =='e' || ch =='I' || ch =='i' || ch =='O' || ch =='o' || ch =='U' || ch =='u';
        }

        public static void main(String[] args){

            System.out.println (ReverseVowels.reverseVowels("Aadvik"));

        }


    }

