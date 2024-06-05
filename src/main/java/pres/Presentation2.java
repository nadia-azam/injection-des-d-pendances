package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("src/config.txt"));

        /*
         DaoImpl dao = new DaoImpl();
         */

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();


        /*
        MetierImpl metier = new MetierImpl();
         */

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();


        /*
         metier.setDao(dao);
         */

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier , dao);

        System.out.println("Resultat => "+metier.calcul());



    }



    /*
        en java toutes les classes qu'on utilise sont chargées dans la memoire sous forme d'un objet de type Class

        InstantiationException : vous avez crée un constructeur par parametre mais vous n'avez pas crée un constructeur par defaut ,
        IllegalAccessException : le constructeur par defaut existe mais privé : n'a pas le droit
        ClassCastException : instancier une classe qui n'est pas de type IDao

        Class cDao = Class.forName(daoClassName);  charger la classe en mémoire
     */
}
