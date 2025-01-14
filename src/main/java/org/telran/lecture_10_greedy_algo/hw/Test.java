package org.telran.lecture_10_greedy_algo.hw;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Activity> list = new ArrayList<>();
        list.add(new Activity("a", 10, 14, Utils.determineCost(10, 14)));
        list.add(new Activity("b", 10, 13, Utils.determineCost(10, 13)));
        list.add(new Activity("c", 13, 15, Utils.determineCost(13, 15)));
        list.add(new Activity("d", 12, 16, Utils.determineCost(12, 16)));
        list.add(new Activity("e", 15, 17, Utils.determineCost(15, 17)));

        ActivitySelection activitySelection = new ActivitySelection();
        activitySelection.selectActivity(list);
    }
}
