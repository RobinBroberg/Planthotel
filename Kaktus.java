package Växthotell;

import static Växthotell.Näringsvätska.MINERALTVATTEN;

public class Kaktus extends Växter {

    public Kaktus(double längd, String namn) {
        super(längd, namn);
    }

    @Override
    public double näringsBehov() {

        return 2; // Centiliter
    }

    public String mängdVätska() { // polymorfism
        double mängd = näringsBehov();
        return namn + " behöver " + String.format("%.0f", mängd) + " cl " + MINERALTVATTEN.typ + " per dag";
    }
}
