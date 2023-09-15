package ArraysAndStrings;

class MissingNumber {

    public static int findMissingNumber(int[] nums){
        int i=0;
        while(i< nums.length){
            int j = nums[i];
            if( j<nums.length && nums[i] != nums[j]){
                swap(nums,i,j);
            }else {
                i++;
            }

        }

        for(i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;

            }
        }
        return nums.length;


    }

    public static void swap (int[] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums [j];
        nums[j] = temp;

    }


    public static void main(String[] args){

        int [] arr = new int[] {3,1,5,4,2};
        System.out.println(MissingNumber.findMissingNumber(arr));




    }


}

