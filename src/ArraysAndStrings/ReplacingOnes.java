package ArraysAndStrings;

public class ReplacingOnes {


    public static void main(String[] args) {
        System.out.println(ReplacingOnes.findMaxOnes(new int[] {0,1,0,0,1,1,0,1,1,0,0,1,1}, 3));
        System.out.println(ReplacingOnes.findMaxOnes(new int[] {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));

    }

    public static int findMaxOnes(int [] arr, int k){

        int windowStart =0, maxNumberOfReplacedZeros =0, maxLength=0;
        for(int windowEnd =0; windowEnd< arr.length;windowEnd++){
            int elem = arr[windowEnd];
            if(elem ==0)
                maxNumberOfReplacedZeros++;

            if(maxNumberOfReplacedZeros > k ){
                if(arr[windowStart] ==0)
                    maxNumberOfReplacedZeros--;
                windowStart++;

            }
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);

        }

        return maxLength;
    }
}
