package Växthotell;

import static Växthotell.Näringsvätska.MINERALTVATTEN;

public class Kaktus extends Växter {


    public Kaktus(double längd, String namn) {
        super(längd, namn);
    }

    @Override
    public double vätskeMängd() {

        return 0.02;
    }

    public String mängdVätska() {
        double mängd = vätskeMängd();
        String m = getNamn() + " behöver " + mängd + " liter " + MINERALTVATTEN.typ;
        return m;
    }
}
