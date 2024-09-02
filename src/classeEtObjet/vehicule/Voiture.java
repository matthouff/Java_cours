package classeEtObjet.vehicule;

import classeEtObjet.Moteur;
import classeEtObjet.Passager;
import classeEtObjet.interfaces.Vidangeable;
import classeEtObjet.Ville;

public class Voiture extends VehiculeAMoteur implements Vidangeable {

    /*
    * "static" permet de faire appel directement à l'attribut ou méthode sans avoir instancié de classe ( ex: Voiture.klaxonner() )
    * une méthode static ne peux pas accéder aux attributs d'instance (non static) mais peut accéder aux propriétés static
    * */

    // Pour une meilleure lisibilité il est préférable de mettre les attributs static en premier et séparé
    public static int nbRoue = 4; // "static" cela permet d'appeler l'attribut directement avec la classe (Voiture.nbRoue) (mais on peut tout de même changer la valeur après avoir instancié une classe)

    public byte nbPortes = 5; // 5 == valeur par défaut définie si on ne met rien comme valeur lors de l'appel mais elle pourra être changé
    public boolean automatique; // Un booleen est false par défaut donc pas besoin de le préciser (si on veut mettre false)
    public String couleur; // valeur par défaut d'un String == null
    public Integer rapportCourant;


    // Les constructeurs doivent être ordonnées par nombre de paramètres pour une meilleure lisibilité
    public Voiture() {
    }

    public Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("Une voiture est construite avec des paramètres");
    }

    public Voiture(String carburant, int nbCylindre) {
        Moteur moteur = new Moteur();
        moteur.carburant = carburant;
        moteur.nbCylindres = nbCylindre;
    }
    public Voiture(byte nbPortes, boolean automatique, String couleur, int rapportCourant, int vitesse) {
        this.nbPortes = nbPortes;
        this.automatique = automatique;
        this.couleur = couleur;
        this.rapportCourant = rapportCourant;
    }


    // Toujours mettre les méthodes static en premier pour une meilleure lisibilité
    public static void tourner(boolean droiteGauche, int angle){
        String tournerDroiteGauche = droiteGauche ? "droite" : "gauche";
        System.out.printf("La voiture va tourner à %s avec un angle de %d°%n", tournerDroiteGauche, angle);
    }
    public void tourner(String droiteGauche, int angle){ // Méthode surchargé (copie de méthode avec des paramètres différents)
        System.out.printf("La voiture va tourner à %s avec un angle de %d°%n", droiteGauche, angle);
    }

    public int passerRapport(boolean augmenter){
        return augmenter ? ++rapportCourant : --rapportCourant;
    }

    public Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("La voiture transporte un passager qui s'appel " + passager.prenom + " " +  passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Paris";
        return villeDeDestination;
    }

    // Lorsque l'on implémente une interface on doit obligatoirement appeler ses méthodes grâce à l'Override et lui
    // donner les instructions qui lui sont propres dans la classe.
    @Override
    public void vidanger() {
        System.out.println("Dévisser le bouchon sous la culasse et attendre que ça coule.");
    }

    // La méthode klaxonner vient de Vehicule et est passé par VehiculeAMoteur pour arrivé à cette dernière classe fille
    @Override
    void klaxonner() {
        System.out.println("Tut Tuuuuuuuut !!!");
    }
}
