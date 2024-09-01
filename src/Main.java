import classeEtObjet.Moteur;
import classeEtObjet.Passager;
import classeEtObjet.Ville;
import classeEtObjet.Voiture;
import operateurs.OperateurConcatenation;
import structureDeControle.*;
import structureIterative_Boucles.MotsCle_break_continue;
import structureIterative_Boucles.StructureIterative_For;
import structureIterative_Boucles.StructureIterative_While;

public class Main {
    public static void main(String[] args) {

        ////////////////////////////////////// ENTRAINEMENT ///////////////////////////////////////
        {
            //        variables.Variables.declarationDeVariable();

            //        OperateursArithmetiques.operators();
            //        OperateursRelationnels.operators();
            //        OperateursLogiques.operators();
            //        OperateurConcatenation.operators();
            //        OperateurConcatenation.operator2FormatageChaine();

            //        StructureConditionnelleIf.conditions();
            //        StructureConditionnelleIfElse.conditions();
            //        OperateurTernaire.conditions();
            //        StructureConditionnelle_If_ElseIf_Else.conditions();
            //        StructureConditionnelle_SwitchCase.switchCaseMois();
            //        StructureConditionnelle_SwitchCase.switchCaseSaisonAmeliore();
            //        StructureConditionnelle_SwitchCase.switchCaseChar();
            //        StructureConditionnelle_SwitchCase.switchCaseChaine();
            //        StructureIterative_For.iteration();
            //        StructureIterative_While.iteration();
            //        MotsCle_break_continue.motsCleBreak();
            //        MotsCle_break_continue.motsCleContinue();
        }

        ////////////////////////////////////// Voitures ///////////////////////////////////////

        /*
         * Pour le nommage:
         * - Un attribut correspond plus à un nom ou définition (nbPortes, automatique, couleur, etc...)
         * - Une méthode correspond plus à une action (avancer, reculer, ralentir, klaxonner, etc...)
         * */

        Voiture voitureDeMichel = new Voiture("Jaune");
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatique = true;
        voitureDeMichel.couleur = "Vert";

        int nouveauRapport = voitureDeMichel.passerRapport(true);

        System.out.println("Le nouveau rapport est : " + nouveauRapport);

        voitureDeMichel.passerRapport(true);
        voitureDeMichel.passerRapport(true);
        voitureDeMichel.passerRapport(true);
        nouveauRapport = voitureDeMichel.passerRapport(false);

        System.out.println("Le nouveau rapport 2 est : " + nouveauRapport);
        voitureDeMichel.tourner("droite", 10);


        // AVEC LA CLASSE MOTEUR RAJOUTÉ
        Voiture voitureDeJerome = new Voiture();
        Moteur moteurVoitureJerome = new Moteur();
        voitureDeJerome.nbPortes = 5;
        moteurVoitureJerome.carburant = "Diesel";
        moteurVoitureJerome.nbCylindres = 6;
        voitureDeJerome.moteur = moteurVoitureJerome;

        voitureDeMichel.moteur = moteurVoitureJerome;

        System.out.println("Le nombre de cylindres de la voiture de jérome est : " + voitureDeJerome.moteur.nbCylindres);
        System.out.println(voitureDeJerome.moteur.equals(voitureDeMichel.moteur));


        // AVEC LA CLASSE PASSAGER RAJOUTÉ
        Passager passager = new Passager();
        passager.nom = "Berthelot";
        passager.prenom = "Matthias";
        passager.age = 26;
        Ville tours = new Ville();
        tours.nom = "Tours";

        Ville destination = voitureDeMichel.transporter(passager, tours);
        System.out.println("Le passager est arrivé dans la ville de " + destination.nom);
        System.out.printf("Le nombre total de roue en général pour une voiture est de " + Voiture.nbRoue); // On peut appeler directement nbRoue depuis la classe car nbRoue est "static"


        // AVEC LES STATIC MÉTHODES DE VOITURE (Peuvent être appeler sans instancier la classe)
        Voiture.klaxonner();
        Voiture.tourner(true, 20);

    }
}