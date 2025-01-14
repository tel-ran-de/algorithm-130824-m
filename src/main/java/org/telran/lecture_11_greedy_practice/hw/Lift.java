package org.telran.lecture_11_greedy_practice.hw;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Lift {
    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(20, 3, 2, 2);
        elevator.init();
    }

    private static class Elevator {
        private static final long MILLISECONDS = 100; //1000
        private final int doorTime;
        private final int floors;
        private final long floorSpeedSeconds;
        private int currentFloor = 1;

        private Elevator(int floors, int height, int speed, int doorTime) {
            this.doorTime = doorTime;
            this.floors = floors;
            floorSpeedSeconds = height / speed * MILLISECONDS;
        }

        private void init() throws InterruptedException {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                Command command = new Command(scanner.nextLine());
                if (command.targetFloor > floors) {
                    System.out.println("Target floor should be less than " + floors);
                    continue;
                }
                if (command.targetFloor > currentFloor) {
                    moveUp(command);
                } else if (command.targetFloor < currentFloor) {
                    moveDown(command);
                }
                currentFloor = command.targetFloor;
                openAndCloseDoor(doorTime);
            }
        }

        private void printCurrentFloor(int i) {
            System.out.println("Current floor is " + i);
        }

        private void openAndCloseDoor(int doorTime) throws InterruptedException {
            System.out.println("Open door");
            Thread.sleep(doorTime * MILLISECONDS);
            System.out.println("Close door");
        }

        private void moveDown(Command command) throws InterruptedException {
            for (int i = currentFloor; i >= command.targetFloor; i--) {
                Thread.sleep(floorSpeedSeconds);
                printCurrentFloor(i);
            }
        }

        private void moveUp(Command command) throws InterruptedException {
            for (int i = currentFloor; i <= command.targetFloor; i++) {
                Thread.sleep(floorSpeedSeconds);
                printCurrentFloor(i);
            }
        }
    }

    private static class Command {
        private final PressType type;
        private final int targetFloor;

        private Command(String type) {
            String[] commands = type.split(" ");
            this.type = PressType.type(commands[0]);
            this.targetFloor = parseInt(commands[1]);
        }
    }

    private enum PressType {
        IN("in"),
        OUT("out");

        private final String type;

        PressType(String type) {
            this.type = type;
        }

        private static PressType type(String s) {
            return valueOf(s);
        }
    }
}
