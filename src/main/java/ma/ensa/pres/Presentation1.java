package ma.ensa.pres;

import ma.ensa.dao.DaoImpl;
import ma.ensa.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        /*Injection des dependances par Instanciation statique en utilisant un setter
         ou via le constructeur=> new */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());

    }
}