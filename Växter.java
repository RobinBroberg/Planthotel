package Växthotell;

abstract class Växter implements vätskeBehov {
    protected double längd;
    protected String namn;

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
}
