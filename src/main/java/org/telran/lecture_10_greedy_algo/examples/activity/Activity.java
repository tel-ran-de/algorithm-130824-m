package org.telran.lecture_10_greedy_algo.examples.activity;

public class Activity {
    String name;
    int start;
    int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return name + " " + start + " " + finish;
    }
}
