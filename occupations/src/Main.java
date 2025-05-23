public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
        }
        for (int i = 5; i < 10; i++) {
            Gender gender;
            if (i % 3 == 0) {
                gender = Gender.MAN;
            } else if (i % 3 == 1) {
                gender = Gender.WOMAN;
            } else {
                gender = Gender.UNDEFINED;
            }
            people[i] = new Person("Person" + i, 20 + i, gender);
        }

        Chef[] chefs = new Chef[5];
        for (int i = 0; i < 5; i++) {
            chefs[i] = new Chef();
        }

        for (int i = 0; i < 5; i++) {
            Gender gender;
            if (i % 3 == 0) {
                gender = Gender.MAN;
            } else if (i % 3 == 1) {
                gender = Gender.WOMAN;
            } else {
                gender = Gender.UNDEFINED;
            }
            chefs[i] = new Chef("Chef" + i, 20 + i, gender);
        }

        for (Person p : people) {
            p.introduce();
            p.printGoal();
        }
        String[] foods = {"pizza", "sushi", "goulash", "salad", "burger", "pasta", "tacos", "ramen", "curry", "paella"};
        for (String food : foods) {
            for (Chef c : chefs) {
                c.introduce();
                c.printGoal();
                System.out.println(c.cook(food));
            }
        }
    }
}