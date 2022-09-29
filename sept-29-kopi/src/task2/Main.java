package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name");
        String name = scanner.nextLine();
        System.out.println("Please type your age");
        int age = scanner.nextInt();

        int result = 67-age;
        System.out.println("Hi "+ name+" you can retire in "+ result+ " years");

    }

}
