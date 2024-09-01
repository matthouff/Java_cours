package structureDeControle;

public class StructureConditionnelleIfElse {
    static int age = 26;
    static int ageDuCapitaine = 50;

    public static void conditions(){
        System.out.printf("Mon age est %d ans", age);

        if (age > 40) {
            System.out.println(", oui je fais plus jeune");
        }else{
            System.out.println(", Cool je suis encore jeune :)");
        }

        if(age < ageDuCapitaine){
            System.out.println("");
            System.out.println("Le capitaine est plus vieux que moi");
        }else{
            System.out.println("");
            System.out.println("Le capitaine est plus jeune que moi");
        }
    }
}
