package classSpecial;

import java.util.Scanner;

public class ClassScanner {

    public static void scanner(){

        System.out.println("Veuillez saisir un texte de type String");
        Scanner sc = new Scanner(System.in); // System.in permet d'écouter/lire le clavier
        String ligneSuivante = sc.nextLine(); // Permet de récupérer la ligne suivante (celle qu'on vient de taper)
        System.out.println("La ligne tapé à la main est : " + ligneSuivante);

        int ligne2 = sc.nextInt(); // Permet de récupérer la ligne suivante (celle qu'on vient de taper)
        System.out.println("L'entier entré est : " + ligne2);

    }

}
