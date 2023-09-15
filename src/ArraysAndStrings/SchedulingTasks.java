package ArraysAndStrings;

import java.util.*;

class SchedulingTasks {

    public static int scheduleTasks(char[] tasks, int k) {
        int intervalCount = 0;
        Map<Character,Integer> taskFreq = new HashMap<Character,Integer>();
        for(char ch: tasks){
            taskFreq.put(ch, taskFreq.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<Map.Entry<Character,Integer>>((e1, e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(taskFreq.entrySet());


        while(!maxHeap.isEmpty()){
            List<Map.Entry<Character,Integer>> waitList = new ArrayList<>();
            int n = k + 1;
            for(; n > 0 && !maxHeap.isEmpty(); n--){
                intervalCount++;
                Map.Entry<Character,Integer> currentTask = maxHeap.poll();
                if(currentTask.getValue() > 1){
                    currentTask.setValue(currentTask.getValue()-1);
                    waitList.add(currentTask);
                }
            }
            maxHeap.addAll(waitList);
            if(!maxHeap.isEmpty()){
                intervalCount += n;
            }
        }

        return intervalCount;
    }

    public static void main(String[] args) {
        char[] tasks = new char[] { 'a', 'a', 'a', 'b', 'c', 'c' };
        System.out.println("Minimum intervals needed to execute all tasks: " +
                SchedulingTasks.scheduleTasks(tasks, 2));

        tasks = new char[] { 'a', 'b', 'a' };
        System.out.println("Minimum intervals needed to execute all tasks: " +
                SchedulingTasks.scheduleTasks(tasks, 3));
    }
}
