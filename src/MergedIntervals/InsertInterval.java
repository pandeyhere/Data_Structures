package MergedIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {

    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class InsertInterval {

    private static List<Interval> insertInterval(List<Interval> intervals, Interval newInterval){

        if(intervals.isEmpty()|| intervals.size()<2){
            return Arrays.asList(newInterval);
        }

        List<Interval> mergedIntervals = new ArrayList<>();

        int i=0;
        while(i<intervals.size() && intervals.get(i).end<newInterval.start){
            mergedIntervals.add(intervals.get(i++));
        }

        while(i<intervals.size() && intervals.get(i).start < newInterval.end){
            newInterval.start= Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end=Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }

        mergedIntervals.add(newInterval);

        while(i< intervals.size()){
            mergedIntervals.add(intervals.get(i++));
        }

        return mergedIntervals;
    }

    public static void main(String[] args) {

        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : InsertInterval.insertInterval(input, new Interval(4, 6)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : InsertInterval.insertInterval(input, new Interval(4, 10)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(2, 3));
        input.add(new Interval(5, 7));
        System.out.print("Intervals after inserting the new interval: ");
        for (Interval interval : InsertInterval.insertInterval(input, new Interval(1, 4)))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();


    }
}
