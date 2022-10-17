package test;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();




        namew("World");
        switch (input){
            case "1":
                System.out.println("Hello World!");
            default:
                System.out.println("Invalid input");
                break;
            case "2":
                System.out.println("Hello World!2");
                break;
            case "3":
                System.out.println("Hello World!3");
                break;

        }
        namew("World");

    }

    private static void namew(String world) {
        System.out.println("Hello, " + world);
    }
}
