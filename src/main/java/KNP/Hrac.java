package KNP;

import java.util.Scanner;

public class Hrac {

    private Scanner sc;
    private String jmeno;
    private String volbaHrace;

    public Hrac(String jmeno) {
        this.jmeno = jmeno;
        sc = new Scanner(System.in);
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getVolbaHrace() {
        return volbaHrace;
    }

    public void tahHrace() {

        System.out.print(jmeno + ", zadej svou volbu [ Kámen = k | Nůžky = n | Papír = p ]: ");
        String volba = sc.nextLine().toLowerCase().trim();

        while (!volba.equals("kámen") && !volba.equals("nůžky") && !volba.equals("papír")
                && !volba.equals("k") && !volba.equals("n") && !volba.equals("p")) {
            System.out.print("Neplatná volba. Zkus to znovu: ");
            volba = sc.nextLine().toLowerCase().trim();
        }

        if (volba.equals("k")) {
            volba = "kámen";
        } else if (volba.equals("n")) {
            volba = "nůžky";
        } else if (volba.equals("p")) {
            volba = "papír";
        }
        volbaHrace = volba;
    }
}
