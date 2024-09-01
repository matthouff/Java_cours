package structureDeControle;

public class StructureConditionnelleIf {
    static int age = 26;
    static int ageDuCapitaine = 50;

    public static void conditions(){
        System.out.printf("Mon age est %d ans", age);

        if (age > 40) {
            System.out.println(", oui je fais plus jeune");
        }

        if(age < ageDuCapitaine && age < 30){
            System.out.println("");
            System.out.println("Le capitaine est plus vieux que moi et j'ai moins de 30 ans");
        }
    }
}
