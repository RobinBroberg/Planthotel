package Växthotell;
import javax.swing.*;
import java.util.Locale;

public class Frågeruta {

    public Frågeruta() {
        Palm Laura = new Palm(5, "Laura");
        Palm Putte = new Palm(1, "Putte");
        Köttätande Meatloaf = new Köttätande(0.7, "Meatloaf");
        Kaktus Igge = new Kaktus(0.2, "Igge");

        String namn = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            switch (namn.toUpperCase(Locale.ROOT)) {
                case "LAURA" -> JOptionPane.showMessageDialog(null, Laura.mängdVätska());
                case "IGGE" -> JOptionPane.showMessageDialog(null, Igge.mängdVätska());
                case "PUTTE" -> JOptionPane.showMessageDialog(null, Putte.mängdVätska());
                case "MEATLOAF" -> JOptionPane.showMessageDialog(null, Meatloaf.mängdVätska());
                case "" -> JOptionPane.showMessageDialog(null, "Du måste skriva in ett namn");
                default -> JOptionPane.showMessageDialog(null, "Det finns ingen växt med det namnet på hotellet");




            }

        }
    }
