import first.FirstTask;
import second.SecondTask;

void main() {
    System.out.println("Task 1:");
    List<Integer> listOfFirstTask = new ArrayList<>(List.of(12, 21, 5, 9, 20, 15, 4, 2, 9));
    System.out.println(FirstTask.getListWithThreshold(listOfFirstTask, 10));

    System.out.println("Task 2:");
    List<Integer> firstListOfSecondTask = new ArrayList<>(List.of(1, 3, 5, 7, 9));
    List<Integer> secondListOfSecondTask = new ArrayList<>(List.of(2, 4, 6, 8, 10));
    System.out.println(SecondTask.mergeTwoLists(firstListOfSecondTask, secondListOfSecondTask));
}