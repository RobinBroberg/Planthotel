package Växthotell;

abstract class Växter implements vätskeBehov {

    private  double längd;

    private String namn;

    public double getLängd() {

        return längd;
    }

    public String getNamn() {

        return namn;
    }

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
}
