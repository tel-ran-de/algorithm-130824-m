package org.telran.lecture_10_greedy_algo.examples.activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public static List<Activity> selectActivity(List<Activity> allActivities) {
        // TODO: проанализируйте код функции и найдите недостатки реализации
        //  Подсказка: побочные эффекты
        allActivities.sort(Comparator.comparingInt(activity -> activity.finish));
        List<Activity> selectedActivities = new ArrayList<>();
        Activity first = allActivities.get(0);
        int currentEndTime = first.finish;
        selectedActivities.add(first);

        for (int i = 1; i < allActivities.size(); i++) {
            if (allActivities.get(i).start >= currentEndTime) {
                currentEndTime = allActivities.get(i).finish;
                selectedActivities.add(allActivities.get(i));
            }
        }
        return selectedActivities;
    }
}
