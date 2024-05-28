package ArraysAndStrings;

public class FilterArrayByIndex {

    public static void main(String[] args){
        int[] data = new int[]{1,3,4,5,6,7};
        int[] filter = new int[]{2,3};
        int[] result = FilterArrayByIndex.filterByIndex(data,filter);
        for(int i:result){
            System.out.println(i);
        }

    }

    private static int[] filterByIndex(int[] data, int[] filter){
        int[] result = new int[data.length-filter.length];
        int i=0,j=0,counter=0;
        while(i<data.length ){
            if(j<filter.length && i==filter[j]){
                i++;
                j++;
            }else{
                result[counter]=data[i];
                counter++;
                i++;
            }
        }
        return result;

    }
}
