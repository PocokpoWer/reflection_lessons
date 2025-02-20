import java.util.Scanner;
public class NameCard {
    public static void main(String[] args) {
        // Task 1:
        String nameCard = getNameCard();
        System.out.println(nameCard);
        // Task 2:
        Scanner scanner = new Scanner(System.in);
        //Initialization
        String nameCardBorder = "-";
        String pipe = "|";
        String space = " ";
        String[] nameCardData = {" Name: ", " Age: ", " Email: ", " Phone: ", " LinkedIn: "};
        //Data input from user
        System.out.println("Please write your name: ");
        String nameInput = scanner.nextLine();
        while (nameInput.isEmpty()) {
            System.out.println("You didn't write anything, try again: ");
            nameInput = scanner.nextLine();
        }
        System.out.println("Please write your age: ");
        String Input = scanner.nextLine();
        while (Input.isEmpty() || !Input.matches("\\d+")) {
            if (Input.isEmpty()) {
                System.out.println("You didn't write anything, write again: ");
            } else {
                System.out.println("It's not a number, please try again: ");
            }
            Input = scanner.nextLine();
        }
        System.out.println("Please write your email address: ");
        String emailInput = scanner.nextLine();
        while (emailInput.isEmpty()) {
            System.out.println("You didn't write anything, try again: ");
            emailInput = scanner.nextLine();
        }
        System.out.println("Please write your phone number: ");
        String phoneNumberInput = scanner.nextLine();
        while (phoneNumberInput.isEmpty() || !phoneNumberInput.matches("\\d+")) {
            if (phoneNumberInput.isEmpty()) {
                System.out.println("You didn't write anything, write again: ");
            } else {
                System.out.println("It's not a number, please try again: ");
            }
            phoneNumberInput = scanner.nextLine();
        }
        System.out.println("Please write your social media address: ");
        String socialMediaAddressInput = scanner.nextLine();
        while (socialMediaAddressInput.isEmpty()) {
            System.out.println("You didn't write anything, try again: ");
            socialMediaAddressInput = scanner.nextLine();
        }
        //Frame generation
        int longestInput = Math.max(Math.max(nameInput.length(), emailInput.length()), socialMediaAddressInput.length());
        int dividerLength = longestInput + nameCardData[4].length() + (Math.multiplyExact(pipe.length(), 3));
        //Name card display
        String nameCard2 = String.format(nameCardBorder.repeat(dividerLength) + "\n" +
                pipe + nameCardData[0] + nameInput + space.repeat(Math.max(0, dividerLength - nameInput.length() - nameCardData[0].length()-Math.multiplyExact(pipe.length(), 2))) + pipe + "\n" +
                nameCardBorder.repeat(dividerLength) + "\n" +
                pipe + nameCardData[1] + Input + space.repeat(Math.max(0, dividerLength - Input.length() - nameCardData[1].length() - Math.multiplyExact(pipe.length(), 2))) + pipe + "\n" +
                nameCardBorder.repeat(dividerLength) + "\n" +
                pipe + nameCardData[2] + emailInput + space.repeat(Math.max(0, dividerLength - emailInput.length() - nameCardData[2].length() - Math.multiplyExact(pipe.length(), 2))) + pipe + "\n" +
                nameCardBorder.repeat(dividerLength) + "\n" +
                pipe + nameCardData[3] + phoneNumberInput + space.repeat(Math.max(0, dividerLength - phoneNumberInput.length() - nameCardData[3].length() - Math.multiplyExact(pipe.length(), 2))) + pipe + "\n" +
                nameCardBorder.repeat(dividerLength) + "\n" +
                pipe + nameCardData[4] + socialMediaAddressInput + space.repeat(Math.max(0, dividerLength - socialMediaAddressInput.length() - nameCardData[4].length() - Math.multiplyExact(pipe.length(), 2))) + pipe + "\n" +
                nameCardBorder.repeat(dividerLength)
        );
        System.out.println(nameCard2);
        scanner.close();
    }

    private static String getNameCard() {
        String name = "Csongor Nagy";
        byte age = 31;
        String email = "nagycsongorors@gmail.com";
        long phoneNumber = 36_70_396_9554L;
        String socialMediaAddress = "https://shorturl.at/aCEL1";
        return String.format(
                "---+-----+----+-----+-------+---------+------+-----\n"+
                        "   | Name: %-34s|\n"+
                        "---+-----+----+-----+-------+---------+------+-----\n"+
                        "   | Age: %-35d|\n"+
                        "---+-----+----+-----+-------+---------+------+-----\n"+
                        "   | Email: %-33s|\n"+
                        "---+-----+----+-----+-------+---------+------+-----\n"+
                        "   | Phone: +%-32d|\n"+
                        "---+-----+----+-----+-------+---------+------+-----\n"+
                        "   | LinkedIn: %-30s|\n"+
                        "---+-----+----+-----+-------+---------+------+-----\n",
                name,age,email,phoneNumber,socialMediaAddress
        );
    }
}