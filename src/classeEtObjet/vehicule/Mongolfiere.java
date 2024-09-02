package classeEtObjet.vehicule;

import classeEtObjet.interfaces.Amarable;

public class Mongolfiere implements Amarable {
    public int surface;

    @Override
    public int nbCordes(int vitesseDuVent) {
        int nbCorde = surface / 50;
        nbCorde += vitesseDuVent / 100;

        return nbCorde;
    }
}
