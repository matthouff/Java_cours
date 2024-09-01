package operateurs;

public class OperateurConcatenation {
    /*
    * On peux concaténer une chaine avec un nombre uniquement si la première valeur est un type String
    * car le "+" va analyser la première partie et formater le reste de la concaténation dans le même genre.
    *
    * si la première partie est une chaine et la 2e est un "int", le "int" deviendra un type "String"
    * */

    static String string = "Mon age est ";
    static int age = 26;

    public static void operators(){
        System.out.println("Opérateurs de concaténation");
        System.out.println(string + age);
        System.out.println(string + (age + 1) + " (+1 ajouté à l'age)"); // Comme les calculs, les () passent avant
    }




    /*
    * Pour des raisons de performances on va préferer utiliser des variables dans les chaines de caractères.
    * Il y a des outils pour se faire en Java mais pour l'instant on va utiliser "printf" au lieux de "println"
    *
    * %d : pour des variables de types "int"
    * %s : pour des variables de types "String"
    * %f : pour des variables de types flottant
    * %b : pour des variables de types "booleen"
    *
    * */

    static String nom = "Berthelot";
    static float taille = 1.76F;
    static boolean sexeH = true;

    public static void operator2FormatageChaine(){
        System.out.println("");
        System.out.println("Opérateurs de concaténation avec le formatage de chaine");
        System.out.printf("Mon nom est %s, j'ai %d ans, je fais %fm et je suis un homme : %b", nom, age, taille, sexeH);
    }
}
