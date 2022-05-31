package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть прізвище: ");
        String  l1 = scan.nextLine();
        System.out.print("Введіть прізвище: ");
        String  l2 = scan.nextLine();
        System.out.print("Введіть прізвище: ");
        String  l3 = scan.nextLine();
        boolean t = l1.equalsIgnoreCase(l2);
        boolean t1 = l2.equalsIgnoreCase(l3);
        System.out.print(t == t1);

    }
}
