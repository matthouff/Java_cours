package structureDeControle;

public class StructureConditionnelle_SwitchCase {

    /*
    * Depuis Java 17 le switch case a été amélioré, voir l'amélioration (méthode "switchCaseSaisonAmeliore()")
    * */

    static int mois = 10;
    static String moisString = "octobre";
    static char initiale = 'l';

    public static void switchCaseMois(){
        switch (mois){
            case 1:
                System.out.println("C'est Janvier");
                break;
            case 2:
                System.out.println("C'est Février");
                break;
            case 3:
                System.out.println("C'est Mars");
                break;
            case 4:
                System.out.println("C'est Avril");
                break;
            case 5:
                System.out.println("C'est Mai");
                break;
            case 6:
                System.out.println("C'est Juin");
                break;
            case 7:
                System.out.println("C'est Juillet");
                break;
            case 8:
                System.out.println("C'est Aout");
                break;
            case 9:
                System.out.println("C'est Septembre");
                break;
            case 10:
                System.out.println("C'est Octobre");
                break;
            case 11:
                System.out.println("C'est Novembre");
                break;
            case 12:
                System.out.println("C'est Decembre");
                break;
            default:
                System.out.println("Ce mois n'existe pas");
        };
    }

    public static void switchCaseSaison(){
        switch (mois){
            case 1:
            case 2:
            case 3:
                System.out.println("C'est l'hiver");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("C'est le printemps");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("C'est l'été");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("C'est l'automne");
                break;
            default:
                System.out.println("Ce mois n'existe pas");
        }
    }
    public static void switchCaseSaisonAmeliore(){
        switch (mois){
            case 1,2,3 -> System.out.println("C'est l'hiver");
            case 4,5,6 -> System.out.println("C'est le printemps");
            case 7,8,9 -> System.out.println("C'est l'été");
            case 10,11,12 -> System.out.println("C'est l'automne");
            default -> System.out.println("Ce mois n'existe pas");
        }
    }

    public static void switchCaseChar(){
        switch (initiale){
            case 'm':
                System.out.println("Matthias");
                break;
            case 'l':
                System.out.println("Lucie");
                break;
            case 'a':
                System.out.println("Marie-ange");
                break;
            case 'j':
                System.out.println("Jérome");
                break;
            case 's':
                System.out.println("Marie-laura");
                break;
            case 'n':
                System.out.println("Nicolas");
                break;
        }
    }

    public static void switchCaseChaine(){
        switch (moisString){
            case "janvier":
                System.out.println("C'est Janvier");
                break;
            case "février":
                System.out.println("C'est Février");
                break;
            case "mars":
                System.out.println("C'est Mars");
                break;
            case "avril":
                System.out.println("C'est Avril");
                break;
            case "mai":
                System.out.println("C'est Mai");
                break;
            case "juin":
                System.out.println("C'est Juin");
                break;
            case "juillet":
                System.out.println("C'est Juillet");
                break;
            case "aout":
                System.out.println("C'est Aout");
                break;
            case "septembre":
                System.out.println("C'est Septembre");
                break;
            case "octobre":
                System.out.println("C'est Octobre");
                break;
            case "novembre":
                System.out.println("C'est Novembre");
                break;
            case "decembre":
                System.out.println("C'est Decembre");
                break;
            default:
                System.out.println("Ce mois n'existe pas");
        };
    }


}
