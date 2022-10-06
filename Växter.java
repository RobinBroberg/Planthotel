package Växthotell;

abstract class Växter implements Näringsbehov {
    protected double längd; // protected så jag kan använda dom i subklasserna utan getters.
    protected String namn;

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
}
