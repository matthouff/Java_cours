package structureDeControle;

public class StructureConditionnelle_If_ElseIf_Else {
    static int age = 26;

    public static void conditions(){
        System.out.printf("Mon age est %d ans", age);

        if (age >= 40) {
            System.out.println(", oui je fais plus jeune");
        }else if(age < 10){
            System.out.println(", Je suis très jeune");
        }else if(age == 26){
            System.out.println(" , Je suis en pleine forme");
        }else {
            System.out.println(" , Je suis fier de mon age hehe");
        }
    }
}
