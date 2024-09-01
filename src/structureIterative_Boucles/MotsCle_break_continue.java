package structureIterative_Boucles;

public class MotsCle_break_continue {

    public static void motsCleBreak(){
        int nb = 0;

        while (nb <= 3) {
            System.out.printf("break : %d/3", nb);
            System.out.println();

            if(nb == 2){
                System.out.printf("Le break a cassé la boucle quand nb == %d", nb);
                break;
            }
            nb++;
        }

        System.out.println("");
    }

    public static void motsCleContinue(){
        System.out.println("");
        for (int nb = 0; nb <= 3; nb++) {
            if(nb == 2){
                continue;
            }

            System.out.printf("Continue : %d/3", nb);
            System.out.println();
        }

        System.out.println("Le mot clé \"continue\" à sauté la boucle 2 quand nb == 2");
    }
}
