package classeEtObjet.interfaces;

public interface Vidangeable {
    /*
    * - Une interface permet de définir une méthode vide.
    * - Par exemple ici on créer une méthode "vidanger" que l'on pourra appeler partout en implémentant l'interface à la
    * classe souhaité
    * - Dans l'exemple on va l'imlémenter dans la classe Voiture car une voiture se vidange. Mais le pouvoir d'une
    * interface c'est qu'elle doit pouvoir être utilisé pour une classe mais aussi pour d'autres (si besoin) comme par
    * exemple un évier qui a besoin d'être vidangé, on fera appel à la méthode mais la façon de vidanger sera
    * complètement différent. Donc le contenu de la méthode sera complètement différent.
    * */

    public void vidanger();

}
