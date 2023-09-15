package ArraysAndStrings;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Interval{

    int start;
    int end;

    public Interval(int start, int end){
        this.start=start;
        this.end=end;
    }

};

public class MergeIntervals {
    public static List<Interval> mergeIntervals(List<Interval> intervals){

        if(intervals.size()<2){
            return intervals;
        }
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start,b.start));

        List<Interval> mergedIntervals = new LinkedList<Interval>();
        Iterator<Interval> intervalItr = intervals.iterator();
        Interval interval = intervalItr.next();
        int start = interval.start;
        int end = interval.end;

        while(intervalItr.hasNext()){
            interval= intervalItr.next();
            if(interval.start<= end){
                end=Math.max(interval.end,end);
            } else {
                mergedIntervals.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }

        }

        mergedIntervals.add(new Interval(start,end));
        return mergedIntervals;

    }

    public static void main(String[] args){

        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(2,5));
        intervals.add(new Interval(7,9));

        System.out.println("Merged Intervals");
        for(Interval interval: mergeIntervals(intervals)){
            System.out.print("["+ interval.start + "," + interval.end + "]");
            System.out.println();
        }
    }



}
