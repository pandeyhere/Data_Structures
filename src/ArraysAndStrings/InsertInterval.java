package ArraysAndStrings;


import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval interval){


        List<Interval> mergedIntervals = new LinkedList<Interval>();
        int i=0;
        while(i< intervals.size() && intervals.get(i).end < interval.start){
            mergedIntervals.add(intervals.get(i++));
        }

        while(i<intervals.size() && intervals.get(i).start <= interval.end){
            interval.start=Math.min(intervals.get(i).start,interval.start);
            interval.end=Math.max(intervals.get(i).end, interval.end);
            i++;
        }

        mergedIntervals.add(interval);

        while(i< intervals.size()){
            mergedIntervals.add(intervals.get(i++));

        }

        return mergedIntervals;

    }

    public static void main(String[] args){

        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(7,9));
        Interval newInterval = new Interval(2,5);
        System.out.println("Inserted & Merged Intervals");
        for(Interval interval: insertInterval(intervals,newInterval)){
            System.out.print("["+ interval.start + "," + interval.end + "]");
            System.out.println();
        }
    }


}
