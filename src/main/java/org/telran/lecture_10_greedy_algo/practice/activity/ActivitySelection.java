package org.telran.lecture_10_greedy_algo.practice.activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(f -> f.finish));
        List<Activity> res = new ArrayList<>();

        print(list);
        System.out.println("------");
        Activity first = list.get(0);
        int last = first.finish;
        res.add(first);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).start >= last) {
                last = list.get(i).finish;
                res.add(list.get(i));
            }
        }
        print(res);
    }

    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.name);
        }
    }
}
