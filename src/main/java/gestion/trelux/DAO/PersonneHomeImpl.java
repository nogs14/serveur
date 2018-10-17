/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;


import gestion.trelux.metier.Personne;
import gestion.trelux.services.PersonneHome;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ACTIF
 */
public class PersonneHomeImpl extends UnicastRemoteObject implements PersonneHome{
    public  PersonneHomeImpl() throws RemoteException
    {
      super();
    }
    @Override
    public boolean inserer(Personne personne) throws RemoteException {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr =session.beginTransaction();
			session.persist(personne);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
	}

    @Override
    public Personne findById(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personne> listPersonne() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne connection(String loginfield, String passwordfield)   throws RemoteException {
        try
        {

            Session session= HibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
             Criteria cr=session.createCriteria(Personne.class);
             cr.add(Restrictions.eq("login",loginfield));
             cr.add(Restrictions.eq("motpasse",passwordfield));
             List list=cr.list();
             Iterator iterator=list.iterator();

             Personne utilisateur=(Personne)iterator.next();
             transaction.commit();
             session.close();
             return utilisateur;
        }
        catch(Exception e)
        {
            System.out.println("Erreur sur l'idenfication de la personne");
            return null;
        }
     
    }

  
}
