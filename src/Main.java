package online.Tannenberg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Where to?");
        int numberTo = Integer.valueOf(scan.nextLine());
        System.out.println("Where from?");
        int numberFrom = Integer.valueOf(scan.nextLine());

        System.out.println("Where from?");

        for (int i = numberFrom; i <= numberTo; i++) {
            System.out.println(i);
        }

    }
}