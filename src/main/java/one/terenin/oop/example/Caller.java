package one.terenin.oop.example;

import java.io.InputStream;
import java.util.Scanner;

public class Caller {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scanner.nextLine());
    }

    // ll -> The ll command executed
    // cd -> The change directory command executed
    // mkdir -> The make directory command executed
    // vi -> The vim executed
}
