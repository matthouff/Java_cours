package classeEtObjet.usineAssemblage;

import classeEtObjet.Moteur;
import classeEtObjet.vehicule.VehiculeAMoteur;

public class UsineAssemblage {

    public VehiculeAMoteur assemble(){
        Moteur moteur = new Moteur();
        VehiculeAMoteur vehiculeAMoteur = new VehiculeAMoteur(moteur);

        return vehiculeAMoteur;
    }

}
