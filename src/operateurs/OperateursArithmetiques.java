package operateurs;

public class OperateursArithmetiques {
    static int add = 5 + 2;
    static int sous = 5 - 2;
    static int mult = 5 * 2;
    static int div = 5 / 2; // retourne un entier 2 et non 2.5
    static float divFloat = 5F / 2; // retourne un nombre réel 2.5
    static int rest = 5 % 2;

    public static void operators(){
        System.out.println("Opérateurs arithmétiques");
        System.out.println("add : " + add);
        System.out.println("sous : " + sous);
        System.out.println("mult : " + mult);
        System.out.println("division : " + div);
        System.out.println("divFloat : " + divFloat);
        System.out.println("reste : " + rest);
    }
}
