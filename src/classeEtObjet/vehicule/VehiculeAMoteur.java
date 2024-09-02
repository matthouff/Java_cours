package classeEtObjet.vehicule;

import classeEtObjet.Moteur;
import classeEtObjet.Passager;
import classeEtObjet.Ville;

public abstract class VehiculeAMoteur extends Vehicule {
    /*
    * Ici on déclare le VehiculeAMoteur en abstrait car la méthode klaxonné ne peut pas être ici car une voiture et un
    * camion ont un klaxon différent.
    * VehiculeAMoteur ne pourra donc pas être instancié
    * */

    public Moteur moteur;
    public int vitesse;

    public VehiculeAMoteur() {
        System.out.println("Une voiture est construite sans paramètres");
    }

    public VehiculeAMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public int accelerer(int vitesse){   // Méthode surchargé (copie de méthode avec des paramètres différents)
        System.out.println("J'accélère");
        this.vitesse = this.vitesse + vitesse; // Le this. permet de faire référence à l'attribut de l'objet utilisé et non le paramètre
        return this.vitesse;
    }

    public Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Le véhicule transporte un passager qui s'appel " + passager.prenom + " " +  passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Paris";
        return villeDeDestination;
    }
}
