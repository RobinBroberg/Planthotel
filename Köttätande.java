package Växthotell;

import static Växthotell.Näringsvätska.PROTEINDRYCK;

public class Köttätande extends Växter {

    public Köttätande(double längd, String namn) {

        super(längd, namn);
    }

    @Override
    public double näringsBehov() {

        return 0.1 + (0.2 * längd); // Liter
    }

    public String mängdVätska() { // polymorfism
        double mängd = näringsBehov();
        return namn + " behöver " + mängd + " liter " + PROTEINDRYCK.typ + " per dag";
    }
}