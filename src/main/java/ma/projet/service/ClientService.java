package ma.projet.service;

import ma.projet.classes.Client;
import ma.projet.classes.Contrat;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ClientService extends AbstractFacade<Client> {
    public ClientService(){
        super(Client.class);
    }
    public List<Contrat> contracin(Client client){
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            List<Contrat> contrsts = session.createQuery(
                    "select c from Contrat c where c.contrat = :contrat"
            ).setParameter("contrat", contrat).list();

            return contrat;
        }finally {
            session.close();
        }
    }
}
