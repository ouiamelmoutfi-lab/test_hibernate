package ma.projet.service;

import ma.projet.classes.Assurance;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AssuranceService extends AbstractFacade<Assurance> {

    public AssuranceService(){
        super(Assurance.class);
    }
  public List<Assurance>  findBytype(String type){
      Session session = null;
      List<Assurance> assurances= null;

      try{
          session = HibernateUtil.getSessionFactory().openSession();
          List<Assurance> assurances1 = session.createQuery(
                  "select a from Assurance a where a.type = : type"
          ).setParameter("assurances", assurances).list();

          return assurances;



      }catch (){

      }
  }
}



