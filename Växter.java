package Växthotell;

abstract class Växter implements Näringsbehov {
    protected double längd;
    protected String namn; // protected så jag kan använda dom i subklasserna utan getters.

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
}
