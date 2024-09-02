package classeEtObjet.vehicule;

import classeEtObjet.interfaces.Amarable;

public class Bateau implements Amarable {
    public int masse;

    @Override
    public int nbCordes(int vitesseDuVent) {
        int nbCorde = masse / 10;
        nbCorde += vitesseDuVent / 100;
        return nbCorde;
    }
}
