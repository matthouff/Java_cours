package operateurs;

public class OperateursLogiques {
    /*
    * Dans les opérateurs logiques on a:
    *
    * &     : "et"
    * |     : "ou"
    *
    * &&    : "et" (mais plus performant car il arrête la logique dès qu'il tombe sur un false et retourne "false")
    * ||    : "ou" (mais plus performant car il arrête la logique dès qu'il tombe sur un true et retourne "true")
    *
    * */

    static boolean et = true && true;
    static boolean et2 = true && false;
    static boolean ou = false || true; // il s'arrète qu'au premier "true"
    static boolean ou2 = false && false;
    static boolean excluLesDoubles = true ^ true; // false
    static boolean excluLesDoubles2 = false ^ false; // false
    static boolean excluLesDoubles3 = false ^ true; // true
    static boolean inverse = !true; // false
    static boolean inverse2 = !false; // true


    public static void operators(){
        System.out.println("Opérateurs logiques");
        System.out.println("true && true : " + et);
        System.out.println("true && false : " + et2);
        System.out.println("false || true : " + ou);
        System.out.println("false || false : " + ou2);
        System.out.println("true ^ true : " + excluLesDoubles);
        System.out.println("false ^ false : " + excluLesDoubles2);
        System.out.println("false ^ true : " + excluLesDoubles3);
        System.out.println("!true : " + inverse);
        System.out.println("!false : " + inverse2);
    }
}
