package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter à la BD et récupérer la température
         */
        System.out.println("version bases de données");
        double temp = Math.random()*40;
        return temp;
    }
}
