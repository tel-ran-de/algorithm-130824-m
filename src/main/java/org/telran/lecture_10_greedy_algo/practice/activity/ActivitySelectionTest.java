package org.telran.lecture_10_greedy_algo.practice.activity;

import java.util.ArrayList;

public class ActivitySelectionTest {
    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("a", 1,3));
        list.add(new Activity("b", 1,7));
        list.add(new Activity("c", 2,4));
        list.add(new Activity("d", 5,9));
        list.add(new Activity("e", 4,6));
        list.add(new Activity("f", 7,8));

        ActivitySelection activities = new ActivitySelection();
        activities.selectActivity(list);
    }
}
