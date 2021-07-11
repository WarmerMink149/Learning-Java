package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Hello How old are you");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(name  +  " is "  + age  +  " years old");

        System.out.printf("%s is %d years old%n" , name , age);

        scanner.close();
    }
}
