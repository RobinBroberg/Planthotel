package Växthotell;

import javax.swing.*;

public class Frågeruta {

    public Frågeruta() {
        Palm palmEtt = new Palm(5, "Laura");
        Palm palmTvå = new Palm(1, "Putte");
        Köttätande köttätare = new Köttätande(0.7, "Meatloaf");
        Kaktus kaktus = new Kaktus(0.2, "Igge");
        boolean run = true;
        while (run) {
            String namn = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if (namn.equalsIgnoreCase("Stopp")) {
                run = false;
            } else {
                if (namn.equalsIgnoreCase(palmEtt.getNamn())) {
                    JOptionPane.showMessageDialog(null, palmEtt.mängdVätska());
                } else if (namn.equalsIgnoreCase(palmTvå.getNamn())) {
                    JOptionPane.showMessageDialog(null, palmTvå.mängdVätska());
                } else if (namn.equalsIgnoreCase(köttätare.getNamn())) {
                    JOptionPane.showMessageDialog(null, köttätare.mängdVätska());
                } else if (namn.equalsIgnoreCase(kaktus.getNamn())) {
                    JOptionPane.showMessageDialog(null, kaktus.mängdVätska());
                } else if (namn.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Du måste skriva in ett namn");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Det finns ingen växt med det namnet på hotellet!");

                }

            }
        }
    }
}