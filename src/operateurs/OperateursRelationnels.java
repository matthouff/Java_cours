package operateurs;

public class OperateursRelationnels {
    static boolean bon = 20 < 30;
    static boolean mauvais = 20 > 30;
    static boolean egale = 20 == 30;
    static boolean infEgale = 20 <= 30;
    static boolean supEgale = 20 >= 30;
    static boolean different = 20 != 30;
    static boolean charCSupY = 'c' >= 'y'; // On peux mettre < ou > pour un "char" car il est ordonné comme un nombre

    public static void operators(){
        System.out.println("Opérateurs relationnels");
        System.out.println("20 < 30 : " + bon);
        System.out.println("20 > 30 : " + mauvais);
        System.out.println("20 == 30 : " + egale);
        System.out.println("20 <= 30 : " + infEgale);
        System.out.println("20 >= 30 : " + supEgale);
        System.out.println("20 != 30 : " + different);
    }
}
