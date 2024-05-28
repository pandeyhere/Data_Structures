package ArraysAndStrings;

public class CompareStringsWithBackspaces {

    private static boolean areIdentical(String s1, String s2){
        int index1=s1.length()-1;
        int index2=s2.length()-1;

        while(index1>=0 && index2>=0){
            int i1=getNextIndex(s1,index1);
            int i2=getNextIndex(s2,index2);

            if(i1<0 && i2 <0){
                return true;
            }
            if(i1<0 || i2 <0){
                return false;
            }

            if(s1.charAt(i1) != s2.charAt(i2)){
                return false;
            }

            index1=i1-1;
            index2=i2-1;
        }
        return true;
    }

    private static int getNextIndex(String s, int index){
        int backspace=0;
        while(index>=0){
            if(s.charAt(index) == '#'){
                backspace++;
            } else if(backspace>0){
                backspace--;
            } else{
                break;
            }
            index--;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(CompareStringsWithBackspaces.areIdentical("xy#z", "xzz#"));
        System.out.println(CompareStringsWithBackspaces.areIdentical("xy#z", "xyz#"));
        System.out.println(CompareStringsWithBackspaces.areIdentical("xp#", "xyz##"));
        System.out.println(CompareStringsWithBackspaces.areIdentical("xywrrmp", "xywrrmu#p"));
    }

}
