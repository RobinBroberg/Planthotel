package Växthotell;

import static Växthotell.Näringsvätska.KRANVATTEN;

public class Palm extends Växter {

    public Palm(double längd, String namn) {
        super(längd, namn);

    }

    @Override
    public double vätskeMängd() {

        return 0.5*getLängd();
    }
    public String mängdVätska(){
        double mängd = vätskeMängd();
        String m = getNamn() + " behöver " + mängd + " liter " + KRANVATTEN.typ;
        return m;
    }
}
