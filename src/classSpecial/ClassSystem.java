package classSpecial;

public class ClassSystem {
    public static void system(){

        System.out.println("Coucou"); // Message dans la console
        System.err.println("Oupss"); // Message d'erreur dans la console

        long time1970 = System.currentTimeMillis();
        System.out.println(time1970); // Message dans la console

        System.out.println("Passé : " + System.nanoTime()); // sert à calsuler des séquences de temps (la date ne correspond pas à 1970)
        System.out.println("Le temps passe vite");
        System.out.println("Futur : " + System.nanoTime());

        System.out.println("Properties :" + System.getProperties()); // Récupère toutes les propriétés de la machine

        System.out.println("Env : " + System.getenv("PATH")); // Récupère toutes les informations de notre environnement (ex: notre Path)



//        System.exit(0); // Termine le programme avec un code succès 0
        System.exit(1); // Termine le programme avec un code erreur personnalisé (ici 1)
    }
}
