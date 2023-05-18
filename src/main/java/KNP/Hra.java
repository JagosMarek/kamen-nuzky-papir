package KNP;

import java.util.ArrayList;
import java.util.List;

public class Hra {

    private int pocetBoduPocitac;
    private int pocetBoduHrac;
    private Pocitac pocitac;
    private Hrac hrac;
    private List<String> zapasy;

    public Hra(String jmenoHrace, int obtiznost) {
        pocetBoduPocitac = 0;
        pocetBoduHrac = 0;
        pocitac = new Pocitac("CPU 9000");
        hrac = new Hrac(jmenoHrace);
        zapasy = new ArrayList<>();

        if (obtiznost == 1) {
            pocetBoduPocitac = 0;
        } else if (obtiznost == 2) {
            pocetBoduPocitac = 2;
        } else if (obtiznost == 3) {
            pocetBoduPocitac = 4;
        } else if (obtiznost == 4) {
            pocetBoduPocitac = 6;
        }
    }

    public void losovani() {
        while (pocetBoduPocitac < 10 && pocetBoduHrac < 10) {
            hrac.tahHrace();
            String tahPocitace = pocitac.tahPocitace();

            System.out.println(hrac.getJmeno() + " zvolil/a: " + hrac.getVolbaHrace());
            System.out.println("Počítač zvolil: " + tahPocitace);

            porovnejTahy(hrac.getVolbaHrace(), tahPocitace);

            System.out.println("Skóre: " + hrac.getJmeno() + " - " + pocetBoduHrac + ", CPU 9000 - " + pocetBoduPocitac);
            System.out.println();

            String zprava = hrac.getJmeno() + ": " + hrac.getVolbaHrace() + " body: " + pocetBoduHrac + ", CPU 9000: " + tahPocitace + " body: " + pocetBoduPocitac;
            zapasy.add(zprava);
        }

        if (pocetBoduPocitac == 10) {
            System.out.println("CPU 9000 vyhrál! Příště buď lepší");
        } else {
            System.out.println(hrac.getJmeno() + " vyhrál/a!");
            System.out.println("CPU 9000 TO NENÍ MOŽNÉÉÉ...");
        }
        System.out.println();
        vypisProbehleZapasy();
        vypisPocetHer();
        System.out.println();
    }

    private void porovnejTahy(String tahHrace, String tahPocitace) {
        if (tahHrace.equals("kámen") && tahPocitace.equals("nůžky") ||
                tahHrace.equals("nůžky") && tahPocitace.equals("papír") ||
                tahHrace.equals("papír") && tahPocitace.equals("kámen")) {
            pocetBoduHrac++;
            System.out.println(hrac.getJmeno() + " vyhrál/a toto kolo!");
        } else if (tahHrace.equals(tahPocitace)) {
            System.out.println("Remíza!");
        } else {
            pocetBoduPocitac++;
            String vysmivaciVeta = pocitac.vyberVysmechVetu();
            System.out.println("CPU 9000 vyhrál toto kolo! " + "-> " + vysmivaciVeta);
        }
    }

    private void vypisProbehleZapasy() {
        System.out.println("Proběhlé zápasy:");
        for (String zapas : zapasy) {
            System.out.println(zapas);
        }
    }

    public void vypisPocetHer() {
        System.out.println("Počet her byl: " + zapasy.size());
    }
}
