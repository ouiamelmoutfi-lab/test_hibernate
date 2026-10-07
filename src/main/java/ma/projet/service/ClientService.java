package ma.projet.service;

import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public List<Projet> finprojet(Employe employe){
    Session session = HibernateUtil.getSessionFactory().openSession();

    try {
        List<Projet> projets = session.createQuery(
                "select p from Projet p where p.employe = :employe"
        ).setParameter("employe", employe).list();

        return projets;
    }finally {
        session.close();
    }
}