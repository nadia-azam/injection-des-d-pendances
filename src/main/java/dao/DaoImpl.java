package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        se connecter a la base dee donnée pour  récuperer la température
         */
        System.out.println("Version base de donnée : ");
        double temp = Math.random()*40 ;

        return temp;
    }
}
