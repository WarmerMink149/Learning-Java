package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Choose one of the following options");
        System.out.println("1 - Cappaucino");
        System.out.println("2 - latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("7 - Quit the program");

        String useChoice = scanner.nextLine();
        System.out.println("You chose " + useChoice);

        scanner.close();
    }
}
