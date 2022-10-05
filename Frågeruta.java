package Växthotell;

import javax.swing.*;

public class Frågeruta {

    public Frågeruta() {
        Palm palm1 = new Palm(5, "Laura");
        Palm palm2 = new Palm(1, "Putte");
        Köttätande köttätare = new Köttätande(0.7, "Meatloaf");
        Kaktus kaktus = new Kaktus(0.2, "Igge");

        boolean run = true;
        while (run) {
            String namn = JOptionPane.showInputDialog("Vilken växt ska få mat?\nVill du avsluta? Skriv \"Stopp\"");
            if (namn.equalsIgnoreCase("Stopp")) {
                run = false;
            } else {
                if (namn.equalsIgnoreCase(palm1.namn)) {
                    JOptionPane.showMessageDialog(null, palm1.mängdVätska());
                } else if (namn.equalsIgnoreCase(palm2.namn)) {
                    JOptionPane.showMessageDialog(null, palm2.mängdVätska());
                } else if (namn.equalsIgnoreCase(köttätare.namn)) {
                    JOptionPane.showMessageDialog(null, köttätare.mängdVätska());
                } else if (namn.equalsIgnoreCase(kaktus.namn)) {
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