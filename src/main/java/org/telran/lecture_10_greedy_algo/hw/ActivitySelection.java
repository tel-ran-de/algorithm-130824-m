package org.telran.lecture_10_greedy_algo.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparing(Activity::getValue).thenComparing(Activity::getEnd));
        Activity first = list.get(0);

        List<Activity> result = new ArrayList<>();
        result.add(first);

        int endTime = first.getEnd();

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).getStart() >= endTime) {
                Activity current = list.get(i);
                result.add(current);
                endTime = current.getEnd();
            }
        }

        printList(result);
    }

    private void printList(List<Activity> list) {
        int value = 0;
        for(Activity a : list) {
            System.out.println(a.getName());
            value += a.getValue();
        }
        System.out.println("value = " + value);
    }

}
