package KNP;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arena arena = new Arena(sc);
        String znovu = "ano";

        while (znovu.equals("ano")) {
            arena.spustHru();
            System.out.println("Pro opakování hry napiš [ano], pro ukončení stiskni libovolnou klávesu + enter.");
            znovu = sc.nextLine().toLowerCase().trim();
        }
        System.out.println();
        System.out.println("Přeji pěkný den :)");

    }
}

