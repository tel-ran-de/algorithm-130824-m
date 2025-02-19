package org.telran.lecture_10_greedy_algo.hw;

// Дано:
//  Список активностей, каждая из которых характеризуется четырьмя параметрами:
//      Название (строка, уникальное имя активности)
//      Время начала (целое число, например, час начала активности)
//      Время окончания (целое число, например, час окончания активности)
//      Цена (целое число, положительное значение)
//Найти:
// Максимальный по суммарной стоимости набор, непересекающихся по времени активностей.
// Условия:
//  Активности считаются непересекающимися, если время окончания одной активности меньше или равно времени начала другой активности.
//  Необходимо использовать жадный алгоритм.


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class ActivityItem {
    public String name;
    public int start;
    public int end;
    public int cost;

    public ActivityItem(String name, int start, int end, int cost) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}

public class Activity {
    public static void main(String[] args) {
        ActivityItem[] activities = {
                new ActivityItem("drawing", 10, 13, 60),
                new ActivityItem("writing", 10, 17, 40),
                new ActivityItem("eating", 12, 14, 40),
                new ActivityItem("coding", 15, 19, 40),
                new ActivityItem("reading", 13, 16, 100),
                new ActivityItem("dancing", 17, 18, 20)
        };

        Arrays.sort(activities, Comparator.comparingInt(
                (ActivityItem a) -> -a.cost)
                .thenComparingInt((ActivityItem a) -> a.end)
        );
        print(activities);
    }
    public static void print(ActivityItem[] activities) {
        for (ActivityItem activity : activities) {
            System.out.println("name: " + activity.name + " start: " + activity.start + " end: " + activity.end + " cost: " + activity.cost);
        }
    }
}
