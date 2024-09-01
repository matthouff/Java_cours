package classeEtObjet;

public class Voiture {

    /*
    * "static" permet de faire appel directement à l'attribut ou méthode sans avoir instancié de classe ( ex: Voiture.klaxonner() )
    * une méthode static ne peux pas accéder aux attributs d'instance (non static) mais peut accéder aux propriétés static
    * */

    // Pour une meilleure lisibilité il est préférable de mettre les attributs static en premier et séparé
    public static int nbRoue = 4; // "static" cela permet d'appeler l'attribut directement avec la classe (Voiture.nbRoue) (mais on peut tout de même changer la valeur après avoir instancié une classe)

    public byte nbPortes = 5; // 5 == valeur par défaut définie si on ne met rien comme valeur lors de l'appel mais elle pourra être changé
    public boolean automatique; // Un booleen est false par défaut donc pas besoin de le préciser (si on veut mettre false)
    public String couleur; // valeur par défaut d'un String == null
    public int rapportCourant;
    public int vitesse;
    public Moteur moteur;


    // Les constructeurs doivent être ordonnées par nombre de paramètres pour une meilleure lisibilité
    public Voiture() {
        System.out.println("Une voiture est construite sans paramètres");
    }
    public Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("Une voiture est construite avec des paramètres");
    }
    public Voiture(Moteur moteur) {
        this.moteur = moteur;
    }
    public Voiture(String carburant, int nbCylindre) {
        Moteur moteur = new Moteur();
        moteur.carburant = carburant;
        moteur.nbCylindres = nbCylindre;
        this.moteur = moteur;
    }
    public Voiture(byte nbPortes, boolean automatique, String couleur, int rapportCourant, int vitesse) {
        this.nbPortes = nbPortes;
        this.automatique = automatique;
        this.couleur = couleur;
        this.rapportCourant = rapportCourant;
        this.vitesse = vitesse;
    }


    // Toujours mettre les méthodes static en premier pour une meilleure lisibilité
    public static void klaxonner(){
        System.out.println("Tutuuuuuuut !!!!!");
    }

    public static void tourner(boolean droiteGauche, int angle){
        String tournerDroiteGauche = droiteGauche ? "droite" : "gauche";
        System.out.printf("La voiture va tourner à %s avec un angle de %d°%n", tournerDroiteGauche, angle);
    }
    public void tourner(String droiteGauche, int angle){ // Méthode surchargé (copie de méthode avec des paramètres différents)
        System.out.printf("La voiture va tourner à %s avec un angle de %d°%n", droiteGauche, angle);
    }

    public int accelerer(){
        System.out.println("J'accélère");
        return 100;
    }

    public int accelerer(int vitesse){   // Méthode surchargé (copie de méthode avec des paramètres différents)
        System.out.println("J'accélère");
        this.vitesse = this.vitesse + vitesse; // Le this. permet de faire référence à l'attribut de l'objet utilisé et non le paramètre
        return this.vitesse;
    }

    public int passerRapport(boolean augmenter){
        return augmenter ? ++rapportCourant : --rapportCourant;
    }

    public Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager qui s'appel " + passager.prenom + " " +  passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Paris";
        return villeDeDestination;
    }
}
