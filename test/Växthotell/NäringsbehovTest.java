package Växthotell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NäringsbehovTest  {
    Palm palm1 = new Palm(5, "Laura");
    Palm palm2 = new Palm(1, "Putte");
    Köttätande köttätare = new Köttätande(0.7, "Meatloaf");
    Kaktus kaktus = new Kaktus(0.2, "Igge");

    @Test
    void näringsBehovTest() {

        assert (palm1.näringsBehov() == 2.5);
        assert (palm2.näringsBehov() == 0.5);
        assert (köttätare.näringsBehov() == 0.24);
        assert (kaktus.näringsBehov() == 2);

    }

}