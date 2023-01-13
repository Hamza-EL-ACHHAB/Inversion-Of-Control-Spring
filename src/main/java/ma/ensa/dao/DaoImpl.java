package ma.ensa.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("VERSION BD ...");
        double temp = Math.random()*40;
        return temp;
    }
}
