import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1:
        List<Integer> listOfTask1 = List.of(2, 6, 34, 100);
        List<Integer> listOFTask1_2 = List.of(2, 11, 34, 101);
        System.out.println(CfTasks.getIntersectionNumbers(listOfTask1, listOFTask1_2));

        // Task 2:
        List<String> listOfTask2 = List.of("Hello", "madam", "retek");
        System.out.println(listOfTask2);
        System.out.println(CfTasks.getWordReverse(listOfTask2));

        // Task 3:
        List<String> listOfTask3 = List.of("madam", "hello");
        System.out.println(CfTasks.getPalindrome(listOfTask3));

        // Task 4:
        String word = "madam";
        System.out.println(CfTasks.getUniqueLetters(word));

        // Task 5:
        List<Integer> listOfTask5 = List.of(3, 2, 4, 6, 3, 2);
        System.out.println(CfTasks.getDuplicationNumbers(listOfTask5));

        // Task 6:
        List<Integer> listOfTask6 = List.of(1, 2, 3, 4, 5);
        List<Integer> listOfTask6_2 = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(CfTasks.filterDuplicationNumber(listOfTask6, listOfTask6_2));

        //  Task 7:
        EmailManager emailManager = new EmailManager();
        emailManager.addEmail("farkas.tibor1105@gmail.com");
        emailManager.addEmail("horvathaladar@gmail.com");
        emailManager.addEmail("liludallas@gmail.com");
        System.out.println(emailManager.getEmailList());
        emailManager.updateEmail("liludallas@gmail.com", "tihamer@gmail.com");
        System.out.println(emailManager.getEmailList());
        emailManager.deleteEmail("farkas.tibor1105@gmail.com");
        System.out.println(emailManager.getEmailList());

        // Task 8,9:
        MyLinkedList<String> nameList = new MyLinkedList<>();
        nameList.addData("John");
        nameList.addData("Bruce");
        nameList.addData("William");
        nameList.printElements();
        nameList.removeData("William");
        nameList.printElements();
    }
}