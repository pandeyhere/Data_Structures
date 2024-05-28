package ArraysAndStrings;

public class ProductOfAllNumbersinArrayExceptAtPosition {


    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
//        int[] result = findProduct(input);
        int[] newResult = findProductOptimal(input);
        for(int i: newResult){
            System.out.println(i);
        }
    }

    private static int[] findProductOptimal(int[] input){
        int n = input.length;
        int[] product = new int[input.length];
        int[] left = new int[input.length];
        int[] right = new int[input.length];

        left[0] = 1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=input[i-1]*left[i-1];
        }

        for(int i=n-2;i>=0;i--){
            right[i]=input[i+1]*right[i+1];
        }

        for(int i=0;i<n;i++){
            product[i]=left[i]*right[i];
        }

        return product;


    }

    private static int[] findProduct(int[] input){
        int[] product = new int[input.length];
        int end=input.length-1;
        for(int i=0;i<=end;i++){
            product[i]=1;
            for(int j=0;j<=end;j++){
                if(i != j){
                    product[i]= product[i]*input[j];
                }
            }
        }
        return product;
    }

}
