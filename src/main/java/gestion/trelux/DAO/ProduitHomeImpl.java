/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Produit;
import gestion.trelux.services.ProduitHome;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class ProduitHomeImpl extends UnicastRemoteObject implements ProduitHome{
 
    public  ProduitHomeImpl() throws RemoteException
    {
        super();
    }

    @Override
    public Produit findById(String id) throws RemoteException {
    try{
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        Produit ad=(Produit)session.get(Produit.class,id);
        tr.commit();
        session.close();
        return ad;
    }
    catch(Exception e){System.out.println("Recherche échouée");return null;}
    }
    

    @Override
    public boolean inserer(Produit produit) throws RemoteException {
    try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr =session.beginTransaction();
			session.persist(produit);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
    }

    @Override
    public List<Produit> listProduit() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
