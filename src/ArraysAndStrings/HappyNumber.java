package ArraysAndStrings;

public class HappyNumber {

    public static boolean isHappyNumber(int num){
        int slow = num; int fast = num;
        do{
            slow=findSquareSum(slow);
            fast= findSquareSum(findSquareSum(fast));
        }while(slow != fast);

        return slow == 1;

    }

    private static int findSquareSum(int num){
        int sum =0, digit=0;
        while(num>0){
             digit = num%10;
            sum += digit*digit;
            num= num/10;
        }
        return sum;

    }



    public static void main (String[] args){

        System.out.println(HappyNumber.isHappyNumber(12));
        System.out.println(HappyNumber.isHappyNumber(23));

    }

}
