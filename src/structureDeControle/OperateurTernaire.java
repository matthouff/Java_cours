package structureDeControle;

public class OperateurTernaire {
    static int age = 26;
    static int ageDuCapitaine = 50;

    public static void conditions(){
        System.out.println(age < ageDuCapitaine ? "Le capitaine est plus vieux que moi" : "Le capitaine est plus jeune que moi");
    }
}
