package KNP;

import java.util.Random;

public class Pocitac {

    private Random nahodneCislo;
    private String jmeno;
    private String[] volbaPc = {"kámen", "nůžky", "papír"};
    private String[] vysmechVety = {"To byl tvůj nejlepší tah?!", "Jsi tak slabý!", "Já jsem neporazitelný!", "Nemáš šanci ;)", "Easy peasy lemon squeezy :-P", "Snažil/a jsi se vůbec?!:0",
    "Haha, amatére!", "Smůla příteli :(", "Zase prohráváš!" , "Kámen, nůžky, papír... jsi bez šance.", "Už radši zkus jinou hru."};

    public Pocitac(String jmeno) {
        this.jmeno = jmeno;
        nahodneCislo = new Random();
    }

    public String tahPocitace() {
        int index = nahodneCislo.nextInt(volbaPc.length);
        return volbaPc[index];
    }

    public String vyberVysmechVetu() {
        int index = nahodneCislo.nextInt(vysmechVety.length);
        return vysmechVety[index];
    }
}


