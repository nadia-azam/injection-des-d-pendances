package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {

        /*
            injection des dependances par instanciation statique
         */

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat : "+metier.calcul());


        /*
        MetierImpl metier = new MetierImpl();
        System.out.println(metier.calcul());

        là se lève une exception non surveillée NullPointer Exception
        elle arrete l execution de l'application
        Un objet qui depend de l autre mais on n a pas satisfait les dependanse
         */
    }
}
