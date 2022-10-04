package Växthotell;

import static Växthotell.Näringsvätska.MINERALTVATTEN;

public class Kaktus extends Växter {


    public Kaktus(double längd, String namn) {
        super(längd, namn);
    }

    @Override
    public double vätskeMängd() {

        return 2;
    }

    public String mängdVätska() {
        double mängd = vätskeMängd();
        String m = getNamn() + " behöver " + String.format("%.0f", mängd) + " cl " + MINERALTVATTEN.typ;
        return m;
    }
}
