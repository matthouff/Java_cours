package classeEtObjet;

import classeEtObjet.interfaces.Amarable;
import classeEtObjet.vehicule.Bateau;

public class Port {
    public void accueilEngin(Amarable amarable){

        if(amarable instanceof Bateau){ // Vérifie si la valeur reçue est de type Bateau
            System.out.println("Il s'agit bien d'un bateau");
        }else{
            System.out.println("Il s'agit d'un hydravion");
        }

        int nbCordes = amarable.nbCordes(50);
        System.out.println("Nombre de cordes necessaires est de " + nbCordes);
    }
}
