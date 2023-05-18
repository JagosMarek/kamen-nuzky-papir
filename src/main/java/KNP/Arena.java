package KNP;

import java.util.Scanner;

public class Arena {

    private Scanner sc;
    private String jmenoHrace;
    private int obtiznost;

    public Arena(Scanner sc) {
        this.sc = sc;
    }

    public void uvitani() {
        System.out.println("Vítejte v aréně, kde se hraje kámen, nůžky, papír!");
        System.out.print("Zadej jméno hráče: ");
        jmenoHrace = sc.nextLine();
    }

    public void vykresleniObtiznosti() {
        boolean platnaObtiznost = false;
        while (!platnaObtiznost) {
            System.out.println();
            System.out.println("Vyber obtížnost:");
            System.out.println("1 - Lehká (Počítač má na začátku 0 bodů)");
            System.out.println("2 - Normální (Počítač má na začátku 2 body)");
            System.out.println("3 - Těžká (Počítač má na začátku 4 body)");
            System.out.println("4 - Nemožná (Počítač má na začátku 6 bodů)");
            System.out.print("Zadej číslo obtížnosti: ");
            System.out.println();
            System.out.println();

            try {
                obtiznost = Integer.parseInt(sc.nextLine());
                if (obtiznost >= 1 && obtiznost <= 4) {
                    platnaObtiznost = true;
                } else {
                    System.out.println("Neplatná obtížnost. Zadej číslo 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup. Zadej číslo 1-4.");
            }
        }
        System.out.println("Obtížnost nastavena na: " + obtiznost);
    }

    public void spustHru() {
        uvitani();
        vykresleniObtiznosti();
        Hra hra = new Hra(jmenoHrace, obtiznost);
        vykresli();
        System.out.println("Nechť zápasy začnou!");
        System.out.println("===================================");
        System.out.println();
        hra.losovani();
        System.out.println("===================================");
        System.out.println();
        System.out.println("Děkuji za hru!");
        System.out.println();
    }

    public void vykresli() {
        System.out.println();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf(" %s     %s     %s  %n", jmenoHrace, "VS", " CPU 9000");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        System.out.println();
    }
}

