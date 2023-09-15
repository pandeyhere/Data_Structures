package BitManipulation;

public class BitwiseComplement {
    public static int bitwiseComplement (int num){

        int n = num;
        int bitCount = 0;
            while(n>0){
                bitCount++;
                n= n>>1;

            }

            int allBitsSet = (int) Math.pow(2,bitCount) -1;

            return num ^ allBitsSet;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(BitwiseComplement.bitwiseComplement(8));
    }

}
