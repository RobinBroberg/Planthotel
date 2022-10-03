package Växthotell;

import static Växthotell.Näringsvätska.PROTEINDRYCK;

public class Köttätande extends Växter {

    public Köttätande(double längd, String namn) {

        super(längd, namn);
    }

    @Override
    public double vätskeMängd() {

        return 0.1 + (0.2 * getLängd());
    }

    public String mängdVätska() {
        double mängd = vätskeMängd();
        String m = getNamn() + " behöver " + mängd + " liter " + PROTEINDRYCK.typ;
        return m;
    }
}