package ma.ensa.ext;

import ma.ensa.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        return 6000;
    }
}
