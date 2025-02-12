package org.telran.lecture_10_greedy_algo.examples.activity;

import java.util.ArrayList;
import java.util.List;

public class ActivitySelectionTest {
    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity("drawing", 10, 13));
        activities.add(new Activity("writing", 10, 17));
        activities.add(new Activity("eating", 12, 14));
        activities.add(new Activity("coding", 15, 19));
        activities.add(new Activity("reading", 13, 16));
        activities.add(new Activity("dancing", 17, 18));

        print(activities);
        System.out.println("------");

        List<Activity> selectedActivities = ActivitySelection.selectActivity(activities);
        print(selectedActivities);
    }

    public static void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e);
        }
    }
}
