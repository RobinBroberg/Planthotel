package Växthotell;
import javax.swing.*;

public class Frågeruta {

    public Frågeruta() {
        Palm Laura = new Palm(5, "Laura");
        Palm Putte = new Palm(1, "Putte");
        Köttätande Meatloaf = new Köttätande(0.7, "Meatloaf");
        Kaktus Igge = new Kaktus(0.2, "Igge");

        String namn = JOptionPane.showInputDialog("Vilken växt ska få mat?");
        if (namn.equalsIgnoreCase(Laura.getNamn())) {
            JOptionPane.showMessageDialog(null, Laura.mängdVätska());
        } else if (namn.equalsIgnoreCase(Putte.getNamn())) {
            JOptionPane.showMessageDialog(null, Putte.mängdVätska());
        } else if (namn.equalsIgnoreCase(Meatloaf.getNamn())) {
            JOptionPane.showMessageDialog(null, Meatloaf.mängdVätska());
        } else if (namn.equalsIgnoreCase(Igge.getNamn())) {
            JOptionPane.showMessageDialog(null, Igge.mängdVätska());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Det finns ingen växt med det namnet på hotellet!");

            }

        }
    }
