package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив целых чисел размера n.
// Элементы массива – это высоты некоторых сооружений.
// Необходимо определить сколько таких сооружений, можно увидеть из начальной точки 0.

// Пример 1:
// Input: [8, 2, 3, 11, 11, 10]
// Output: 2
// Пояснение: Нам видно первое здание высотой 8, за ним следуют 11 (2 и 3 не видно, так как они меньше 8),
//    последние два элемента (11 и 10) также не видны так как 11 находится на том же уровне, что и 4 элемент (тоже 11),
//    а 10 – еще ниже.

// Пример 2:
// Input: [12, 20, 39, 45, 89]
// Output: 5
// Пояснение: будут видны все элементы, так как они расположены по возрастанию

public class Heights {

  public static void main(String[] args) {
        int[] buildings = {8, 2, 3, 11, 11, 10};
        int[] buildingsTwo = {12, 20, 39, 45, 89};
        int[] buildingsThree = {8, 8, 8, 1, 8};
        int[] buildingsFour = {8, 4, 6, 7, 5, 9};
        int[] buildingsFive = {5, 3, 6, 8, 4, 7};

        System.out.println("Visible floors for {8, 2, 3, 11, 11, 10}: " + countVisible(buildings));
        System.out.println("Visible floors for {12, 20, 39, 45, 89}: " + countVisible(buildingsTwo));
        System.out.println("Visible floors for {8, 8, 8, 1, 8}: " + countVisible(buildingsThree));
        System.out.println("Visible floors for {8, 4, 6, 7, 5, 9}: " + countVisible(buildingsFour));
        System.out.println("Visible floors for {5, 3, 6, 8, 4, 7} should be 3: " + countVisible(buildingsFive));
    }

    private static int countVisible(int[] buildings) {
        if (buildings == null) {
            return -1;
        }

        if (buildings.length == 0) {
            return 0;
        }

        int count = 1;
        int maxFloorBuilding = buildings[0];
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i] > maxFloorBuilding) {
                count++;
                maxFloorBuilding = buildings[i];
            }
        }
        return count;
    }
}
