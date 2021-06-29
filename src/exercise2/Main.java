package exercise2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        StringTokenizer string = new StringTokenizer(scanner.nextLine());
        System.out.println("Result:");
        while (string.hasMoreTokens()) {
            System.out.println(string.nextToken());
        }
    }
}
