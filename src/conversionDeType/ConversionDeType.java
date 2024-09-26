package conversionDeType;

import classeEtObjet.vehicule.Voiture;

public class ConversionDeType {

    public static void conversion(){
        Integer i = new Integer(12);

        Float f = new Float(12.6F);
        Float f2 = new Float("12.6");

        float f3 = f.floatValue();
        int i2 = i.intValue();

        float f4 = Float.parseFloat("14.5");
        boolean b = Boolean.parseBoolean("true");

        Voiture clio2 = new Voiture();
        clio2.rapportCourant = 2;
        clio2.rapportCourant++;

        int i3 = Integer.parseInt("16"); // Transforme un nombre type String en un Integer
        String i4 = String.valueOf(i3); // valueOf() transforme absolument tout en chaine de caractère
        System.out.println(i4);
    }

}
