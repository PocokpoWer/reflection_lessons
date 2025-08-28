import task1.StringManipulation;
import task2.AppleForaging;
import task2.Participant;
import task3.Person;
import task3.parseCsv;
import task4.Activity;
import task4.Cycling;
import task4.Hiking;
import task4.Running;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // Task 1:
        String sentence = "the quick brown fox jumps over the lazy dog";
        System.out.println(StringManipulation.getString(sentence) + "\n");

        // Task 2:
        List<Participant> applePickers = List.of(
                new Participant("Alice", 25),
                new Participant("Bob", 35),
                new Participant("Charlie", 50),
                new Participant("Alice", 32),
                new Participant("Diana", 48),
                new Participant("Eli", 20));
        System.out.println(AppleForaging.mergeApplePieces(applePickers) + "\n");

        // Task 3:
        Set<Person> people = parseCsv.read("src/people.csv");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        // Task 4:
        List<Activity> list = new ArrayList<>();
        list.add(new Running(30, 5));
        list.add(new Cycling(60, 21));
        list.add(new Hiking(40, 300));
        for (Activity a : list) {
            System.out.println("Activity type: " + a.getClass().getSimpleName());
            System.out.println("Calories burned: " + a.caloriesBurned());
            System.out.println("Is intense? " + a.isIntense());
            System.out.println();
        }
    }


}