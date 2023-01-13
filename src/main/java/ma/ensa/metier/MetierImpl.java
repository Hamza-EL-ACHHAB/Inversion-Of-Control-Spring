package ma.ensa.metier;

import ma.ensa.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    //Couplage faible

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*223*Math.cos(tmp);
        return res;
    }
    /*Pour Injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
