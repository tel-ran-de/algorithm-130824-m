
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiftApp {

    public static void main(String[] args) throws IOException {

        int building = 19;

        Lift liftA = new Lift("A", 3, 4);
        Lift liftB = new Lift("B", 2, 8);
        Lift liftC = new Lift("C", 2, 5);
        LiftManager liftManager = new LiftManager();
        liftManager.addLift(liftA);
        liftManager.addLift(liftB);
        liftManager.addLift(liftC);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = "yes";
        while (string.equals("yes")){
            System.out.println("Do you want to call the elevator? yes/no");
            string= reader.readLine();
            System.out.println("What floor are you on?");
            int flor = Integer.parseInt(reader.readLine());
            liftManager.callLift(flor);

        }
    }
}

---------------------------------------------------------------------------------

package org.telran.lecture_11_greedy_practice.practice.hw;


import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Getter
public class LiftManager {

    private List<Lift> liftList = new ArrayList<>();

    public LiftManager() {
    }

    public void addLift(Lift lift) {
        liftList.add(lift);
    }

    public void printWhereLiftLocated() {
        for (Lift lift : liftList) {
            System.out.println("Lift " + lift.getName() + " located on " + lift.getLocatedLift() + "   ");
        }
    }

    public void callLift(int flor) {
        int timeToFlor = 0; // секунды за сколько выполнит
        int numberBetweenFloors = 0; // кол-во этажей между, где стоит лифт и куда должен ехать

        for (Lift lift : liftList) {
            numberBetweenFloors = lift.getLocatedLift() - flor;
            timeToFlor = lift.getSpied() * numberBetweenFloors;
            lift.setDistanceBetweenFloors(Math.abs(timeToFlor));
            System.out.println("Lift " + lift.getName() + " is on the "  + lift.getLocatedLift() + " flour ");
        }

        List<Lift> list = liftList.stream()
                .sorted(Comparator.comparing(Lift::getDistanceBetweenFloors)
                        .thenComparingInt(Lift::getSpied))
                .toList();

        list.get(0).setLocatedLift(flor);

        System.out.println("The Lift " + list.get(0).getName() + " has arrived in " + flor + " flour ");
    }

}
------------------------------------------------------------------------------------------------

  package org.telran.lecture_11_greedy_practice.practice.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Lift {

    private String name;

    private int spied;

    private int locatedLift;

    private int distanceBetweenFloors;

    public Lift(String name, int spied, int locatedLift) {
        this.name = name;
        this.spied = spied;
        this.locatedLift = locatedLift;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "name='" + name + '\'' +
                ", spied=" + spied +
                ", locatedLift=" + locatedLift +
                '}';
    }
}


