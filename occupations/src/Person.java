public class Person {
    String name;
    int age;
    Gender gender;

    public Person() {
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s ", name, age, gender);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }
}
