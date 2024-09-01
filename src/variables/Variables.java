package variables;

import java.util.Date;

public class Variables {

    /*
    * LES TYPES
    *
    * Types primitifs: Qui commencent par des minuscules
    *
    * - long:   (64 bits) (Il faut préciser derrière le nombre que c'est un long avec "L")
    * - int:    De -2 147 483 648  à  2 147 483 647  (32 bits)
    * - short:  De -32 768  à 32 767  (16 bits)
    * - byte:   De -128  à 127  (8 bits)
    * - char:   Ne contient qu'un seul caractère (initiale par exemple)
    * - float:  Nombre à virgule (32 bits) (Il faut préciser derrière le nombre que c'est un float avec "F" ou "f")
    * - double: Nombre flottant (virgule) plus grand de float (64 bits)
    * - boolean: false / true
    * */

    private static short anneeDeNaissance = 1998;
    private static long millisecondesDepuis1970 = 1609920618000L;
    private static float prixEssence = 1.43F;
    private static char initialPrenom = 'M';
    private static boolean javaFacile = true;


    public static void declarationDeVariable(){
        System.out.println("Année naissance: " + anneeDeNaissance);
        System.out.println("date: " + new Date(millisecondesDepuis1970));
        System.out.println("Prix essence: " + prixEssence);
        System.out.println("Initial prenom: " + initialPrenom);
        System.out.println("Jave est facile : " + javaFacile);
    }
}
