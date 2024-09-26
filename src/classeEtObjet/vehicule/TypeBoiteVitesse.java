package classeEtObjet.vehicule;

public enum TypeBoiteVitesse {

    // On peut uniquement utiliser les énumération comme telles.
    // Mais on peut ajouter des valeurs à chacunes (après les énum) en définissant une variable de type String et en définissant un
    // constructeur.

    AUTO("Automatique"),
    SEMI_AUTO("Semi-automatique"),
    MANUELLE("Manuelle");

    String typeBoiteVitesse;

    TypeBoiteVitesse(String typeBoiteVitesse) {
        this.typeBoiteVitesse = typeBoiteVitesse;
    }
}
