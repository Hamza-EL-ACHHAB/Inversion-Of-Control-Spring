package ma.ensa.pres;

import ma.ensa.dao.IDao;
import ma.ensa.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        /*Le chargement dynamique d'une class en mermoire en utilisant forName*/
        /*Dans java, toutes les classes et les interfaces sont chargees en momoire une seule fois
         sous forme d'une object qui est de type Class*/
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());



    }
}
