package Växthotell;

import static Växthotell.Näringsvätska.KRANVATTEN;

public class Palm extends Växter {

    public Palm(double längd, String namn) {
        super(längd, namn);

    }

    @Override
    public double näringsBehov() {

        return 0.5 * längd; // Liter
    }

    public String mängdVätska() { // polymorfism
        double mängd = näringsBehov();
        return namn + " behöver " + mängd + " liter " + KRANVATTEN.typ + " per dag";
    }
}
